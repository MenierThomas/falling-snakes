package falling_snakes;

import java.util.ArrayList;

public class Partie {
	private static final int HEIGHT = 10;
	private static final int WIDTH = 7;
	private static final int DIFFICULTY = 5;// Le nombre d'obstacle
	private static final int SNAKE_SIZE = 7;
	
	
		
	//Création d'obstacle valide
	public ArrayList<Obstacle> creeObstacles() {
		ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>();
		
		//Liste de toutes les cases valides
		ArrayList<int[]> casesValide = new ArrayList<int[]>();
		for(int x = 0; x < HEIGHT; x++) {
			for(int y = 0; y < WIDTH; y++) {
				int[] coordinates = {x,y};
				casesValide.add(coordinates);
			}
		}
		
		//On prend des cases valides qu'on transforme en obstacles
		for(int i = 0; i < DIFFICULTY; i++) {
			obstacles.add(Obstacle.randomObstacle(casesValide.remove((int) (Math.random()*HEIGHT*WIDTH)-i)));
		}
		return obstacles;
	}
		
		
			
	
	//Lance la partie
	public void start() {
		boolean fin = false;
		boolean win = false;
		Plateau plateau =  new Plateau(HEIGHT,WIDTH,creeObstacles(),SNAKE_SIZE);
		
		while(!fin) {
			
			
		}
		
		if(win) {System.out.println("Vous avez gagné !");}
		else{ System.out.println("Vous avez perdu !");}	
		//Création d'obstacle pas au même endroit
		//prendre une case parmi les restantes prendre case jusce qu'a ce que valide
		
	}
	
}
