package tiy.core; 

/** 
	This is a class I'll use to call various methods on objects
	of type Reference and objects of type Sample
*/
public class Runner { 

	public static void main(String[] args) { 
		System.out.println("Running ..."); 

		Reference yoyo = new Reference(); 
		Sample craycray = new Sample(); 

		System.out.println("Done creating my local variables ..."); 

		System.out.println("------------------- craycray -------------------"); 
		System.out.println("Calling the method zombie() on an instance of type Sample ..."); 
		craycray.zombie(); 
		System.out.println("Now I can't use the String that the zombie method returned because I didn't save it anywhere"); 
		System.out.println("Now making another call to zombie(), but this time I'm going to actually save what this method returns into a local variable");
		String savingWhatZombieReturns = craycray.zombie(); 
		System.out.println("The zombie() method returned: "); 
		System.out.println(savingWhatZombieReturns); 

		System.out.println("------------------- yoyo -------------------"); 
		yoyo.doSomethingButDontReturnAnything(); 
		String hope = yoyo.doSomethingAndReturnSomething(); 
		System.out.println("doSomethingAndReturnSomething returned: " + hope); 
		yoyo.doSomethingWithAParameter(41); 
		yoyo.doSomethingWithTwoParameters(29, craycray); 
		System.out.println("Done!"); 
	}
}