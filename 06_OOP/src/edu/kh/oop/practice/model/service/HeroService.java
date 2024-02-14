package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		Hero warrior = new Hero();
		Hero wizard = new Hero();
		
		warrior.setNickName("이구역짱");
		warrior.setJob("전사");
		warrior.setHp(200);
		warrior.setMp(20);
		warrior.setLevel(1);
		warrior.setExp(100);
		
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다. 현재 레벨 : %d \n",
					warrior.getJob(), warrior.getNickName(), warrior.getLevel()
				);
		
		
		wizard.setNickName("Zi존위자드");
		wizard.setJob("마법사");
		wizard.setHp(100);
		wizard.setMp(100);
		wizard.setLevel(1);
		wizard.setExp(100);
		
		
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다. 현재 레벨 : %d \n",
				wizard.getJob(), wizard.getNickName(), wizard.getLevel()
			);
		
		System.out.println("=========================================================");
		
		
		warrior.attack(100);
		warrior.attack(100);
		warrior.attack(100);
		warrior.attack(100);
		warrior.attack(100);
		
		warrior.magicJump();
		warrior.magicJump();
		warrior.magicJump();
		
		
		System.out.println("==================");
		
		wizard.attack(500);
		wizard.magicJump();
	
		
	}
}
