package day14constructorsstatickeywordarrays;

public class Animal {
	//1) Constructor call must be done in the first line every time
			// 2) In a constructor you can do just single constructor call. Because if you do multiple
			//at least one of them will not be in the first line.That contradits with the first rule

	public String name; 
	public int weight ;
	public boolean herbivorous ;
	
	
	public Animal() {
		this("Joe", 33, true);
		System.out.println("1st constructor is executed");
	}

	public Animal(String name) {
		this();
		System.out.println("2nd constructor is executed");
	this.name = name;
	}

		
	public Animal(String name, int weight) {
		
		System.out.println("3rd constructor is executed");
		this.name = name;
		this.weight = weight;
	}
	

	public Animal(String name, int weight, boolean herbivorous) {
		 		
		System.out.println("4th constructor is executed");
		this.name = name;
		this.weight = weight;
		this.herbivorous = herbivorous;
		
	
	}
	
	
	

	public static void main(String[] args) {
		
					
		Animal dog = new Animal("Mark");
		
		System.out.println(dog.name);
		
		
	}
}
