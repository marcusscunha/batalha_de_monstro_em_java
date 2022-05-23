package model.item;

public class Ashbringer extends Weapon{

	public Ashbringer(String name, int power) {
		super(name, power);
		
	}

	@Override
	public void attack() {
		System.out.printf("Retribution for the light!");	
	}
    
	int power = 2000;
	
			
}
