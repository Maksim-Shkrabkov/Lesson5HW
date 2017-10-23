package by.htp.starSystem;

public class Planet extends SolarSystem {
	
//	instance variables
	
	private String nameOfPlanet;

//	constructor
	
	public Planet(String nameOfPlanet) {
		super();
		this.nameOfPlanet = nameOfPlanet;
	}
	
	public Planet(String nameOfSolarSystem, int countOfPlanet, String nameOfPlanet) {
		super(nameOfSolarSystem, countOfPlanet);
		this.nameOfPlanet = nameOfPlanet;
	}

//	Getters and setters
	
	public String getNameOfPlanet() {
		return nameOfPlanet;
	}


	public void setNameOfPlanet(String nameOfPlanet) {
		this.nameOfPlanet = nameOfPlanet;
	}
	
	

}
