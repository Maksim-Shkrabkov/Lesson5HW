package by.htp.starSystem;

public class Luna extends SolarSystem {
	
//	instance variables
	
	private String nameOfMoon;
	
//	constructor
	
	public Luna(String nameOfMoon) {
		super();
		this.nameOfMoon = nameOfMoon;
	}
	
	public Luna(String nameOfSolarSystem, int countOfPlanet, String nameOfMoon) {
		super(nameOfSolarSystem, countOfPlanet);
		this.nameOfMoon = nameOfMoon;
	}
    
	
//	Getters and setters

	public String getNameOfMoon() {
		return nameOfMoon;
	}


	public void setNameOfMoon(String nameOfMoon) {
		this.nameOfMoon = nameOfMoon;
	}

	
}
