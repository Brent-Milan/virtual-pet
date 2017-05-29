import java.util.Scanner;
import java.util.Random;

public class VirtualPetApp {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		 VirtualPet jasper = new VirtualPet();
		 jasper.name = "Jasper";	 
		 
		 System.out.println("Your pet's name is " + jasper.name + ".");
		 
		 //Loop Start
		 do {
			 System.out.println("Jasper's current status is: ");
			 System.out.println("Hunger: " + jasper.hunger);
			 System.out.println("Thirst: " + jasper.thirst);
			 System.out.println("Rage: " + jasper.rage);
			 System.out.println("Ennui: " + jasper.ennui);
			 System.out.println("Fatigue: " + jasper.fatigue);
		 
			 System.out.println("\nWhat would you like to do?");
		
		 
			 System.out.println("1. Feed your golem");
			 System.out.println("2. Sate its thirst");
			 System.out.println("3. Play with your golem");
			 System.out.println("4. Read poetry to your golem");
			 System.out.println("5. Let your golem rest");
			 System.out.println("6: Ignore your golem");
		 
		 // System.out.println("");
		 
			 int userInput = input.nextInt();
		 		switch(userInput) {
		 			case 1: 
		 				if(jasper.isExistential()) {
		 						//System.out.println("Your golem is having an existential crisis!");
		 						System.out.println("Jasper refuses to eat. He feels the call of the void.\n");
		 						jasper.tick();
		 				} else if(jasper.isHungry()){
		 						jasper.feed(); 
		 						System.out.println("Your golem feasts on the blood of his enemies!\n");
		 						jasper.tick();		
		 				} else {
		 					System.out.println("All enemies have been slain! There is nothing else to eat.\n");
		 					jasper.tick();
		 				} 
		 				break;
		 			case 2: 
		 				if(jasper.isThirsty()) {
		 					jasper.drink();
		 					System.out.println("Your golem goes in search of a mana pool to renew its energy.");
		 					System.out.println("Your golem feels rejuvenated!");
		 					jasper.tick();
		 				} else
		 					System.out.println("Your golem searches in vain for a nearby mana pool. Its thirst goes unquenched.\n");
		 					jasper.tick();
		 				break;
		 			case 3: 
		 				if(jasper.isAngry()) {
		 					jasper.play();
		 					System.out.println("Your golem is soothed by interacting with you. He seems calmer now.\n");	
		 					jasper.tick();
		 				} else 
		 					System.out.println("Your golem is unruly and does not wish to play with you right now.\n");
		 					jasper.tick();
		 				break;
		 			case 4:
		 				if(jasper.isEnnui()) {
		 					jasper.think();
		 					System.out.println("Your golem ponders the mysteries of the universe.\n");
		 					jasper.tick();
		 				} else { 
		 					System.out.println("Your golem cares nothing for intellectual pursuits!\n");
		 					jasper.tick();
		 				}
		 				break;
		 			case 5: if(jasper.isTired()) {
		 				jasper.sleep();
		 				System.out.println("Your golem becomes a pile of rocks and enters a deep slumber.");
		 				jasper.tick();
		 				} else {
		 					System.out.println("Your golem refuses to rest." );
		 					jasper.tick();
		 				}
		 				break;
		 			case 6: 
		 				System.out.println("Your golem smolders at your indifference.\n");
		 				if (jasper.isEnraged()) {
		 					System.out.println("Your golem is enraged!");
		 					System.out.println("After smashing your laptop, it goes in search of a new master");
		 					// system quit line needed here
		 				} else {
		 					jasper.tick();
		 				}
		 			default: 
		 				System.out.println("Invalid selection. Try again");
		 				continue;
		 		} // end switch
		 } while (jasper.isAlive());

		 
		 
		
		
		
		
		

	} // end main

	public static void updateDisplay(int value) {
		System.out.println(value);
	}
	
	public static void write(String message) {
		System.out.println(message);
	}
	
}
