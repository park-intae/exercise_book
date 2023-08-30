package org.galapagos.macmorning.dao;

public class MemberListDaoTest {

	public static void main(String[] args) {
		// testSave();
		testLoad();

	}
	
	public static void testSave() {
		MemberDao dao = new MemberListDao();
		try {
			dao.save();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void testLoad() {
		MemberDao dao = new MemberListDao();
		try {
			dao.load();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
