package app;

import model.creature.*;
import model.item.*;

public class App
{
	public static void main(String[] args)
	{
		Hero hero01 = new Hero("Gladiator",50);
		Raden Raden = new Raden("titan of lightning and thunder", 20, 15, 1, 7000);
		
		Ashbringer Ashbringer = new Ashbringer("Ashbringer", 2000);
		
		hero01.setWeapon(Ashbringer);
	  int opcaoA = 5000;
	  int opcaoB  = 7000;
		while(Raden.getHp() > 0)
			while ((opcaoA!=0)&&(opcaoB!=0)){
		
			hero01.attack(Raden);
			System.out.println("Round 1");
			Raden.attack(hero01);
			System.out.println("Round 2");			
			hero01.attack(Raden);
			System.out.println("Round 3");
			return;
		}
		}
	}

