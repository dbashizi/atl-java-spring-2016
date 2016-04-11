package tiy.core; 

import java.util.Scanner; 

/** 
	This class defines a new type named "Sample" in a package named "tiy.core"
	It needs to be saved in a folder structure that has a "core" folder inside a "tiy" folder
	The "tiy" folder itself can be anywhere on your computer. Wherever the "tiy" folder is will be called
	your "base" directory
	You must compile (with javac) and run (with java) from the base directory
 */
public class Sample { 
	String colorful; 
	String scissors; 
	int kitchen; 
	Scanner xyz; 

	/**
		Default constructor 
		It doesn't have to do anything
		This one initializes every instance variable to a default value 
	*/ 
	public Sample() { 
		System.out.println("Sample class - default constructor"); 
		this.colorful = new String("some sample text assigned to the colorful variable"); 
		this.scissors = new String("scissors are deceptively dangerous for little children"); 
		this.kitchen = 289; 
		this.xyz = new Scanner(System.in); 
	}

	/** 
		This constructor takes a parameter and is therefore not the default 
		constructor
		A constructor can call another constructor in the same class using the 
		"this()" notation, but ... it has to be the first instruction in the constructor
	*/
	public Sample(int phone) { 
		this(); // calls the default constructor
		System.out.println("Sample class - constructor with an int parameter"); 
		this.kitchen = phone; // changes the value of the variable kitchen to be the same as the value of the variable phone
	}

	/** 
		This is another constructor that takes in a parameter of a different type
		A class can have as many constructors as it wants, as long as their signature 
		is different (i.e. they take different parameters)
	*/
	public Sample(String incredible) { 
		this(); // <--- calls the default constructor
		System.out.println("Sample class - constructor with a String parameter"); 
		this.colorful = incredible; // changes the value of the variable colorful to be the same as the value of the variable incredible
	}

	/** 
		This is yet another constructor, but this one takes multiple parameters
		and does not call any other constructor
	*/
	public Sample(String abc, Scanner lightyears) { 
		System.out.println("Sample class - constructor with a String parameter and a Scanner parameter"); 
		this.scissors = abc; 
		this.xyz = lightyears; 
	}

	/** 
		A public method called zombie() that returns a String and doesn't take any parameters
	*/
	public String zombie() { 
		return new String("This is what the method called zombie returns"); 
	}
}