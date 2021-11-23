package AnimalTester;

public class Dog {
	//name, breed and age
	public String Name;
	public String Age;
	public String Breed;
	
	public Dog(String name,String age,String breed) {
		Name = name;
		Age = age;
		Breed = breed;
	}
	public void changeName(String change) {
		Name = change;
	}
	public void changeBreed(String change) {
		Breed = change;
	}
	public void changeAge(String change) {
		Age = change;
	}

}
