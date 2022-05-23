package model.item;

public class Ak47 extends Weapon
{
	public Ak47(String name, int power)
	{
		super(name, power);
	
	}
	int power = 50;


	@Override
	public void attack()
	{
		
		System.out.printf("Shot many bullets in your ass!");
	}
}
