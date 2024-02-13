package edu.kh.oop.method.model.vo;

public class Member {
	// 필드
	private String memberId; //아이디
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	// 생성자
	//  기본 생성자
	// 생성자 규칙 :  반환형이 없고 클래스명과 이름이 같아야 한다.
	// 컨트롤 스페이스 제일 첫번째
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	//매개변수생성자 - 알트 시프트 에스
	
}
