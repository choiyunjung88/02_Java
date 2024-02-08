package edu.kh.oop.practice.model.vo;

public class Hero {
	// 속성
	// 필드 <- 멤버변수
	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void attack(int exp) {
		System.out.println(this.nickName + "은/는 공격을 했다!");
		this.exp += exp;
		System.out.println("현재 경험치 : " + this.exp);
		if (this.exp >= 500) {
			this.level++;
			System.out.println("레벨이 올랐습니다! " + this.level + " 레벨입니다");
		}

	}
	public void magicJump() {
		System.out.println(this.nickName + "의 점프!");
		this.mp -= 10;
		if (this.mp <= 0) {
			System.out.println("더 이상 매직 점프할 수 없어요!");
		}	
	}
}
