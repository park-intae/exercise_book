package jdbc_ex.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.cli.command.Command;

import jdbc_ex.dao.UserDAO;
import jdbc_ex.dao.UserDAOImpl;
import jdbc_ex.domain.UserVO;

public class UserDeletCommand implements Command {
	UserDAO dao = UserDAOImpl.getInstance();
	@Override
	public void execute() {
		System.out.println("[사용자 삭제]");
		
		String userid = Input.read("사용자 ID:");
		UserVO user = dao.getUser(userid);
		if(user == null) {
			System.out.println("존재하지 않는 아이디입니다");
			return;
		}
		
		//정말 삭제하시겠습니까?[Y/n] >>
		
		boolean answer = Input.confirm("정말 삭제하시겠습니까?", true);
		if (answer) {
			dao.deleteUser(user.getId());
			System.out.println(userid + "를 삭제했습니다.");
		}
	}

}
