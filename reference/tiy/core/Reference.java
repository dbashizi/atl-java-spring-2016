package tiy.core; 

/** 
	This class defines a new type named "Reference" in a package named "tiy.core"
	It needs to be saved in a folder structure that has a "core" folder inside a "tiy" folder
	The "tiy" folder itself can be anywhere on your computer. Wherever the "tiy" folder is will be called
	your "base" directory
	You must compile (with javac) and run (with java) from the base directory

	All variables in this class have silly names that don't make sense and that you would never want to use 
	in a real program. This is to make it obvious that variables names can be **anything** you fancy
	All methods also have ridiculous names, although those ones do tell you something about what the method does
	Again, this is to make it obvious that you can also call methods **anything** you fancy
 */
public class Reference { 
	// -------------------------------------------------------
	// All the variables below are defined with the format
	// <modifier> <type> <name>; 
	// The ones that have [] after the type are arrays of
	// variables of that type
	// None of these variables are initialized to anything
	// All these variables are private, which means they 
	// can only be seen by instances of this class
	// All these variables are global instance variables, which 
	// any method in this class can see them
	// -------------------------------------------------------
	// single instances
	private String yo; // this variable of type String is called yo and isn't initialized to anything (its value is currently null)
	private Sample dude; // this variable of type Sample is called dude and isn't initialized to anything
	private int wow; // this variable of type int is called wow and isn't initialized to anything
	// arrays
	private int[] mmm; // this variable is an array of variables of type int. The array is not initialized and therefore doesn't have a size
	private Sample[] phew; // this variable is an array of variables of type Sample. Array is not initialized
	private String[] bingo; // this variable is an array of variables of type String. Array is not initialized

	// -------------------------------------------------------
	// All the variables below are defined with the format
	// <modifier> <type> <name> = new <type>(<parameters>); 
	// All these variables are public, which means they 
	// can only be seen by instances of this class
	// All these variables are global instance variables, which 
	// any method in this class can see them
	// -------------------------------------------------------
	// single instances 
	public String lucky = new String("Any text goes in here"); // this variable of type String is named lucky and has a value of "Any text goes in here"
	public Sample grumpy = new Sample(); // this variable of type Sample is named grumpy and is initialized by the default constructor in the class Sample	
	public Sample goofy = new Sample(37); // an instance of Sample called goofy 
	// arrays
	public int[] bubble = new int[12]; // an array of int variables called bubble, initialized to hold 12 ints

	/** 
		Default constructor
	*/
	public Reference() {
		System.out.println("Reference class - default constructor"); 
		// Initialize instance variables to some default values
		this.yo = "Yo! What's up?"; 
		this.dude = new Sample(); 
		this.wow = 1038; 
		// Initialize arrays and each variable within each array
		mmm = new int[12]; // make mmm an array of 12 ints
		for (int mmmI = 0; mmmI < mmm.length; mmmI++) { 
			mmm[mmmI] = this.wow * mmmI; 
		}
		phew = new Sample[7]; // make phew an array of 7 objects of type Sample
		for (int phewC = 0; phewC < phew.length; phewC++) { 
			phew[phewC] = new Sample(); 
		}
	} 

	/**
		public: this method can be seen by any other class
		void: this method does not return anything
		doSomethingButDontReturnAnything: the (silly) name of the method
		(): this method does not receive any parameters when it's called
		{: start a block of code
		}: end a block of code
	*/
	public void doSomethingButDontReturnAnything() { 
		System.out.println("I do things, but ..."); 
		System.out.println("a) I don't return anything (that's why my return type is void"); 
		System.out.println("b) I don't take any parameters in (that's why my signature says () without anything in the parenthesis"); 
		wow = 97; // initialize the variable named wow to the value 97
		dude = new Sample(); // use the constructor from the Sample class to create a new instance of that class and assign its value to the variable dude
		mmm = new int[21]; // initialize the variable mmm to be an array of 21 variables of type int
	}

	/**
		public: this method can be seen by any other class
		String: this method returns an object of type String
		doSomethingAndReturnSomething: the (silly) name of the method
		(): this method does not receive any parameters when it's called
		{: start a block of code
		}: end a block of code
	*/
	public String doSomethingAndReturnSomething() { 
		if (wow > 50) { 
			return "wow is greater than 50"; 
		} else {
			return "wow is less than or equal to 50"; 
		}
	}

	/**
		public: this method can be seen by any other class
		String: this method does not return anything
		doSomethingWithAParameter: the (silly) name of the method
		(int <variable_name>): this method receives an int as a parameters and calls it kettle
		{: start a block of code
		}: end a block of code
	*/
	public void doSomethingWithAParameter(int kettle) { 
		wow = wow + kettle; 
		if (wow > 25) { 
			System.out.println("After adding " + kettle + " wow is now greater than 25"); 
		} else { 
			System.out.println("Even after adding " + kettle + ", wow is not greater than 25"); 
		}
	}

	public void doSomethingWithTwoParameters(int kettle, Sample boat) { 
		// a variable called blahblahblah of type String that is local to this method
		// (i.e. its scope is the curly braces of the method)
		String blahblahblah = boat.zombie(); 

		if (kettle > 98) { 
			System.out.println("kettle is greater than 98"); 
			System.out.println("the method zombie() returned the following String: " + blahblahblah); 
		} else { 
			System.out.println("kettle is less or equal to 98"); 
			System.out.println("I'm not going to tell you what the method zombie() said ..."); 
		}
	}
}