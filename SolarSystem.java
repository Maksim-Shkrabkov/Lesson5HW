package by.htp.starSystem;

public class SolarSystem {
	
	private String nameOfSolarSystem;
	private Planet[] planetsInTheSolarSystem;
	private int countOfPlanet;
	private Star starInSystem;
	private Luna nameOfLuna;
	
//	constructor
	
	public SolarSystem() {
		
	}
	
	public SolarSystem(String nameOfSolarSystem, int countOfPlanet) {

		this.nameOfSolarSystem = nameOfSolarSystem;
		
		if(countOfPlanet > 0) {
			planetsInTheSolarSystem = new Planet[countOfPlanet];
		}
		
	}

//	methods
	
	public void addPlanet(Planet planeta) {
		if (planeta != null && countOfPlanet < planetsInTheSolarSystem.length) {
			planetsInTheSolarSystem[countOfPlanet] = planeta;
			countOfPlanet++;
		}
	}
	
	public void addStar(Star nameOfStar) {
		if(nameOfStar != null) {
			starInSystem = nameOfStar;
		}
	}
	
	
	public void addLunaInTheSolarSystem(Luna nameOfMoon) {
		if(nameOfMoon != null) {
			nameOfLuna = nameOfMoon;
		}
	}
	
	public void nameOfStar() {
		System.out.println("Name of Star: " + starInSystem.getNameOfStar());
	}
	
	public void quantityOfPlanetsInSolarSystem() {
		
		int quantity = 0;
		
		for(int i = 0; i < planetsInTheSolarSystem.length; i++) {
			if(planetsInTheSolarSystem[i] != null) {
				quantity++;
			}
		}
		System.out.println("Quantity planets in the System: " + quantity);
	}
	
	
	public void nameOfLuna() {
			System.out.println("Name of Moon: " + nameOfLuna.getNameOfMoon());
	}
	
}
