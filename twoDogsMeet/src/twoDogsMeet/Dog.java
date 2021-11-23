package twoDogsMeet;

import java.util.Random;

public class Dog {
		public String name;
		public String breed;
		public int agro;
		public int hunger;
		
		public Dog(String Name,String Breed) {
			name = Name;
			breed = Breed;
		}
		public void agression() {
			Random rand = new Random();
			agro = rand.nextInt(10);
		}
		public void hunger() {
			Random rand = new Random();
			hunger = rand.nextInt(10);
		}
}
