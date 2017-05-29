import java.util.Random;

public class VirtualPet {

		String name;
		int hunger = 75;
		int thirst = 15;
		int rage = 40;
		int ennui = 25;
		int fatigue = 10;
		
		int growth = 1;
		int level = 1;
		
		
		void rename(String name) {
			name = this.name;
		}
		
		String sayName() {
			return name;
		}
		
		void feed() {
			hunger -= 45;
			rage += 20;
			fatigue += 20;
		} 
		
		void drink() {
			thirst -= 60;
			fatigue += 15;
		}
		
		void play() {
			rage -= 30;
			fatigue += 20;
		}
		
		void think() {
			ennui -= 40;
			fatigue += 10;
		}
			
		void sleep() {
			fatigue -= 90;
		}
		
		/*****************
		 * Boolean Tests
		 ******************/
		boolean isHungry() {
			return hunger >= 60;
		}
		
		boolean isThirsty() {
			return thirst >= 60;
		}
		
		boolean isAngry() {
			return rage >= 50;
		}
	
		boolean isEnnui() {
			return ennui >= 60;
		}
		
		boolean isTired() {
			return fatigue >= 65;
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
		int n = rand.nextInt(20) + 1;
		
		void tick() {
			hunger += n;
			thirst += n;
			ennui += n;
			rage += n;	
		}
		
} // end VirtualPet
