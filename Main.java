package by.htp.starSystemrunner;

import java.util.Arrays;

import by.htp.starSystem.Luna;
import by.htp.starSystem.Planet;
import by.htp.starSystem.SolarSystem;
import by.htp.starSystem.Star;

public class Main {

	public static void main(String[] args) {
		
		//Create Solarsystem
		
		SolarSystem ourSystem = new SolarSystem("Наша Солнечная система", 5);
		
		//Create planets
		
		Planet mars = new Planet("Mars");
		Planet mercury = new Planet("Mercury");
		Planet jupiter = new Planet("Jupiter");
		Planet uranus = new Planet("Uranus");
		Planet pluton = new Planet("Pluton");
		
		//Add planets to SolarSystem
		
		ourSystem.addPlanet(uranus);
		ourSystem.addPlanet(jupiter);
		ourSystem.addPlanet(mercury);
		ourSystem.addPlanet(mars);
		
		System.out.println();
		
		//Create Star
		
		Star sirius = new Star("Sirius");
		
		//Add Star
		
		ourSystem.addStar(sirius);
		
		//Name of star
		
		ourSystem.nameOfStar();
		
		//quantity of planets
		
		ourSystem.quantityOfPlanetsInSolarSystem();
		
		//Create Luna
		
		Luna moonOfEarth = new Luna("Moon on Earth");
		
		//Add Luna
		
		ourSystem.addLunaInTheSolarSystem(moonOfEarth);
		
		//Name of Moon
		
		ourSystem.nameOfLuna();
	
	}

}
