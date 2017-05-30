import java.util.Random;

public class VirtualPet {

		String name;
		int hunger = 65;
		int thirst = 25;
		int rage = 40;
		int ennui = 25;
		int fatigue = 10;
		
		int growth = 1;
		int level = 1;
		
		
		/*********************
		 * General Modifiers
		 ********************/
		
		String sayName() {
			return name;
		}
		
		void feed() {
			hunger -= 50;
			rage += 10;
			fatigue += 5;
		} 
		
		void drink() {
			thirst -= 50;
			fatigue += 5;
			
		}
		
		void play() {
			rage -= 40;
			ennui -= 20;
			fatigue += 5;
			hunger += 5;
			thirst += 5;
		}
		
		void think() {
			ennui -= 40;
			rage -= 10;
			fatigue += 10;
			hunger += 5;
		}
			
		void sleep() {
			fatigue -= 50;
			hunger += 5;
			thirst += 5;
			rage -= 15;
		}
		
		/*********************
		 * Leveling Mechanics
		 *********************/
		
		int displayLevel() {
			return level;
		}
		
		void levelUp() {
			growth = 1;
			level++;
		}
		
		boolean isCapped()  {
			return growth > 9;
		}
		
		void grow() {
			growth++;
		}
		
		/*****************
		 * Boolean Tests
		 ******************/
		boolean isHungry() {
			return hunger >= 50;
		}
		
		boolean isThirsty() {
			return thirst >= 50;
		}
		
		boolean isAngry() {
			return rage >= 50;
		}
	
		boolean isEnnui() {
			return ennui >= 50;
		}
		
		boolean isTired() {
			return fatigue >= 60;
		}
		
		/********************
		 * Other Thresholds
		 **********************/
		
		boolean isEnraged() {
			return rage >= 80;
		}
		
		boolean isExistential() {
			return ennui >= 70;
		}
		/*******************
		 * Pet Demise Thresholds
		 **********************/
		
		boolean isAlive() {
			if(hunger < 100 && thirst < 100 && rage < 100 && ennui < 100 && fatigue < 100) {
			return true;
			} else {
				return false;
			}
		}
		
		/****************
		 * Tick()
		 ****************/
		Random rand = new Random();
		int n = rand.nextInt(12) + 1;
		int i = rand.nextInt(10) + 1;
		int m = rand.nextInt(9) + 1;
		
		
		void tick() {
			hunger += i;
			thirst += n;
			ennui += i;
			rage += m;	
		}
		
} // end VirtualPet
