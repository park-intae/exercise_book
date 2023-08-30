package jdbc_ex.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.cli.command.Command;

import jdbc_ex.dao.UserDAO;
import jdbc_ex.dao.UserDAOImpl;
import jdbc_ex.domain.UserVO;

public class UserUpdateCommand implements Command {
	UserDAO dao = UserDAOImpl.getInstance();	

	@Override
	public void execute() {
		//1.수정 할 id
		System.out.println("[수정할 id를 입력하세요]");
		String userid = Input.read("사용자 ID: ");
		
		//2.id의 수정 전 데이터
        UserVO user = dao.getUser(userid);
        if (user == null) {
            System.out.println("존재하지 않는 ID입니다.");
            return;
        }
        //3.id의 수정 전 데이터 보여주고 수정할 부분 받기
        	// 이름파트
    	String name = Input.read("이름", user.getName());
        	// 역할파트
    	String role = Input.read("역할", user.getRole());

    	user.setName(name);
    	user.setRole(role);
    	dao.updateUser(user);
    	
    	//4.수정 데이터 확인
    	System.out.println("사용자 ID: " + user.getId());
        System.out.println("이름: " + user.getName());
        System.out.println("역할: " + user.getRole());
        System.out.println("========================");

	}

}
