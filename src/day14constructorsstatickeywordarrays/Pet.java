package day14constructorsstatickeywordarrays;

public class Pet {

	public static void main(String[] args) {
		
		Dog.eat(); // Package deki diger Dog sinifindaki eat static metodunu getirdi.Sinif ismiyle cagirdi
		
		//To acces static methods just vlass name is enough
		
		Dog dog = new Dog();
		dog.drink(); //Diger Dog sinifindaki drink (sattik olmayan) metodunu getirdi. Ama once
		// metot olusturmak lazim.
		
		// To non-static methods you must create object.
		// To access static methods you can use objects as well but it is not recommended, 
		// because it is long way and Java gives you notification with yellow underline
		}

}
