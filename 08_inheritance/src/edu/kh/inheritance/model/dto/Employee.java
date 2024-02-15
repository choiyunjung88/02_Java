package edu.kh.inheritance.model.dto;

//final 클래스 -> 상속불가
// - 제공되는 클래스 그대로 사용해야 하는 경우
public /*final*/class Employee extends Person{
	private String company;
	
	//Person으로부터 상속받은 메서드 중 
	// ove() 메서드를 emploee에 맞게 저장
	@Override
	public void move() {
		System.out.println("오버라이딩된 move()");
	}
	
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		
		this.company = company;
	}


	public Employee() {
		super();
	}


	@Override
	public String toString() {
		return super.toString() + " / " + company;
	}
	
	/*
	 * final 메서드 -> 오버라이딩 불가
	 * 
	 * - 메서드의 기능이 변하면 안되는 경우
	 * 
	 * 
	 * */
	
	public final void onlyEmployee() {
		System.out.println("final 메서드 입니다");
	}
	
}
