package java_study.chap_02;

import javax.swing.JOptionPane;

public class string_compare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "root";
		String pw = "pass";

		String inputId = JOptionPane.showInputDialog("ID입력");
		String inputPw = JOptionPane.showInputDialog("PW입력");

		if (id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패, 아이디 혹은 비밀번호가 일치하지 않습니다");
		}

	}

}
