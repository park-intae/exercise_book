package org.galapagos.macmorning.exception;

public class UseridCountOverException extends Exception{
	
	public UseridCountOverException() {
		super("사용자 id 입력 횟수 초과");
		
	}
	
}
