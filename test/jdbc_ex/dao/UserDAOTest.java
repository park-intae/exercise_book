package jdbc_ex.dao;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import jdbc_ex.domain.UserVO;

class UserDAOTest {
	UserDAO dao = UserDAOImpl.getInstance(); 
	@Test
	void testInsertUser() {
		UserVO user = new UserVO("test","1234","테스터","USER");
		dao.insertUser(user);
		
		user=dao.getUser("test");
		assertNotNull(user);
		assertEquals("test",user.getId());
	}

	@Test
	void testGetUserList() {
		List<UserVO> list = dao.getUserList();
		assertEquals(3,list.size());
//			for(UserVO user : list) {
//				System.out.println(user);
//			}
	}

	@Test
	void testGetUser() {
		UserVO user = dao.getUser("guest");
		assertNotNull(user);
		assertEquals("guest",user.getId());
	}

	@Test
	void testUpdateUser() {
		UserVO user = dao.getUser("guest");
		user.setName("외부이용자");
		
		dao.updateUser(user);
		user=dao.getUser("guest");
		
		assertNotNull(user);
		assertEquals("외부이용자",user.getName());
	}

	@Test
	void testDeleteUser() {
		dao.deleteUser("test");
		
		UserVO user = dao.getUser("test");
		assertNull(user);		
	}

}
