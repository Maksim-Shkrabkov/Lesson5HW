package by.htp.starSystem;

public class Star extends SolarSystem {
	
	private String nameOfStar;
	
//	constructors
	
	public Star(String nameOfStar) {
		super();
		this.nameOfStar = nameOfStar;
	}
	
	public Star(String nameOfSolarSystem, int countOfPlanet, String nameOfStar) {
		super(nameOfSolarSystem, countOfPlanet);
		this.nameOfStar = nameOfStar;
	}
	

//	Getters and setters

	public String getNameOfStar() {
		return nameOfStar;
	}


	public void setNameOfStar(String nameOfStar) {
		this.nameOfStar = nameOfStar;
	}
	
	

}
