package model.creature;

public class Raden extends Monster {

	public Raden(String name, int hp, int powerAttack, int defense, int xpReward) {
		super(name, hp, powerAttack, defense, xpReward);
		
		int xpReward1 = 5000;
		  this.name = name;
		this.hp = hp;
		this.powerAttack = powerAttack;
		this.defense = defense;
		this.xpReward = xpReward1;
	}
	
	@Override
	public void hitted(Creature attacker)
	{
		super.hitted(attacker);
		if (alreadyXpReward || isAlive)
			return;
		Hero hero = (Hero) attacker;
		if(hero != null) {
			hero.addXp(xpReward);
			System.out.println(attacker.name + " receives " + xpReward + " of XP");
		}
		alreadyXpReward = true;
	}
	
	public int getHp() {
		return hp;
	}
}
