package simple.carproject; 

public class SimpleCar { 

	public String color; 
	public String make; 
	public String model; 
	public boolean isCarStarted = false; 
	public int speed = 0; 
	public int gasLevel = 10; 

	public void startCar() {
		System.out.println("Starting your car!"); 
		if (make.equals("BMW")) {
			System.out.println("Your BMW is broken (again!) - go pay your dealership $4,000 for a starter"); 
		} else { 
			isCarStarted = true;  
		}
	}

	public void accelerate() { 
		if (isCarStarted && gasLevel > 0) { 
			speed = speed + 5; 
		} else { 
			System.out.println("You have to start your car before you accelerate"); 
			if (make.equals("BMW")) { 
				System.out.println("Sorry, BMW Owner, you don't get to accelerate"); 
			}
		}
	}

	public SimpleCar() { 
		color = "Blue";
		make = "Land Rover"; 
		model = "Range Rover Sport SVR"; 
	}

	public SimpleCar(String inputColor, String inputMake, String inputModel) {
		color = inputColor; 
		if (inputMake.equals("Dodge")) { 
			make = "CrappyCar"; 
			speed = 50; 
		} else { 
			make = inputMake; 
		}
		model = inputModel;  
	}

}