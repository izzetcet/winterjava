package day13constructors;

public class Animal {

	/*
	 1- Constructor must have same name with the class
	 2- Constructor namesstart with uppercases (Because they match with the class names)
	 but method names start with lowercases
	 3- Methods must have "return type" but Contructor must not
	 */
	public String name = "Joe"; 
	public int weight =78 ;
	public static boolean isHerbivorous = false;
	
	
	public static void main(String[] args) {
		
		
		
		Animal dog = new Animal ();
		
		System.out.println(dog.name); //Joe
		System.out.println(dog.weight);//78
		System.out.println(dog.isHerbivorous);//true
		
		dog.move();
		dog.eat();
		dog.drink();
		
	}

	public static void eat() {
		if(isHerbivorous) {
			System.out.println("Eats plants");
		}else {
			System.out.println("Eats both plants and meat");
		}
		
	}
	public static void drink() {
		System.out.println("Drinks water");
	}
	public static void move() {
		System.out.println("Moves");
	}
}
