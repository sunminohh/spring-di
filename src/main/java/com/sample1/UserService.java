package com.sample1;

/*
 * 의존성 주입받기
 * 		- UserService객체는 OracleUserDao 객체가 필요하다.
 * 			+ OracleUserDao 타입의 멤버변수를 정의한다.
 * 		- UserService 객체는 OracleUserDao 객체를 직접 생성하지 않고,
 * 		  외부로부터 주입(전달, 제공)받는다.
 * 			+ OracleUserDao 타입의 매개변수가 있는 생성자 메소드 혹은 \
 * 			  OracleUserDao 타입의 매개변수가 있는 Setter 메소드를 정의한다.
 * 		- UserService 객체의 회원가입 기능, 회원탈퇴 기능에서는 
 * 		  OracleUserDao객체의 데이터베이스 엑세스 기능을 사용하기 위해서는 
 * 		  UserService객체에 OracleDao객체가 주입이 완료되어야 한다.
 */

public class UserService {
	
	// 1. 의존하는 객체를 참조하는 멤버변수를 정의한다. 
	private OracleUserDao oracleUserDao; 
	
	public UserService() {} 
	
	// 2. 의존하는 객체를 전달받아서 멤버변수에 대입하는 생성자 메소드를 정의한다.
	public UserService(OracleUserDao oracleUSerDao) {
		this.oracleUserDao = oracleUSerDao;
	}
	
	// 2. 의존하는 객체를 전달받아서 멤버변수에 대입하는 Setter 메소드를 정의한다.
	public void setOracleUserDao(OracleUserDao oracleUSerDao) {
		this.oracleUserDao = oracleUSerDao;
	}
	
	public void 회원가입(String id, String pwd, String name) {
		oracleUserDao.insertUser();
	}
	
	public void 회원탈퇴(String id) {
		oracleUserDao.deleteUser();
	}

}
