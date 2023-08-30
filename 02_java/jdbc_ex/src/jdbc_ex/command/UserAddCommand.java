package jdbc_ex.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.cli.command.Command;

import jdbc_ex.dao.UserDAO;
import jdbc_ex.dao.UserDAOImpl;
import jdbc_ex.domain.UserVO;

public class UserAddCommand implements Command {
	UserDAO dao = UserDAOImpl.getInstance();
	
	@Override
	public void execute() {
		System.out.println("[사용자 추가]");
		
		String userId = Input.read("사용자 ID : ");
		// id 중복체크
		UserVO user = dao.getUser(userId);
		if(user != null) {
			//아이디 중복
			System.out.println("중복된 ID입니다");
			return;
		}
		
		String password = Input.read("비밀번호 : ");
		String name = Input.read("이름 : ");
		String role = Input.read("역할 : ");

		
		user = new UserVO(userId, password, name, role);
		dao.insertUser(user);
		System.out.println("=================================");
	}

}
