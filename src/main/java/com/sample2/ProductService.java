package com.sample2;

/*
 * ProductService가 의존성 주입받기
 * 		- ProductService는 ProductDao 인터페이스 타입의 멤버변수를 정의했다.
 * 		  * ProductDao 인터페이스를 구현한 자식 객체를 참조하겠다.
 * 		- ProductDao 인터페이스를 구현한 자식객체를 의존성 주입(전달)받기 위해서
 * 	      생성자 혹은 setter 메소드를 정의한다.
 */
public class ProductService {
	
	// 1. ProductDao 인터페이스를 구현한 모든 종류의 자식객체를 참조할 수 있는 멤버변수
	private ProductDao productDao;
	
	public ProductService() {}
	
	// 2. ProductDao 인터페이스를 구현한 모든 종류의 자식객체를 전달받아 멤버변수에 대입하는 생성자
	public ProductService(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	// 2. ProductDao 인터페이스를 구현한 모든 종류의 자식객체를 전달받아 멤버변수에 대입하는 setter 
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
 
	public void 상품입고처리() {
		productDao.insertProduct();
	}
	
	public void 상품츨고처리() {
		productDao.updateProduct();
	}
}
