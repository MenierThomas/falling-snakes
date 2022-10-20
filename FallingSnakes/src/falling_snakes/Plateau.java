package falling_snakes;

import java.util.ArrayList;

public class Plateau {
	private int height;
	private int width;
	private int[][] grille;
	private ArrayList<Obstacle> obstacles;
	private Snake snake;
	
	public Plateau(int height, int width,ArrayList<Obstacle> obstacles,int snakeSize) {
		super();
		this.height = height;
		this.width = width;
		this.grille = new int[height][width];
		this.obstacles = obstacles;
		Snake snake = new Snake(snakeSize);
		this.snake = snake;
	}
	
	public boolean hasBois(int x, int y) { // Comment détécter un objet sur la case
		for(Obstacle o : this.obstacles) {
		}
		return true;
		
	}
	
	public int[] nextStep() {//Calcul de la prochaine marche
		switch (this.snake.getOrientation()) {
			case DROITE:
				if(this.snake.getHead()[0]+1 >= this.width || hasBois(this.snake.getHead()[0]+1,this.snake.getHead()[1])) {
					int[] cas = {0,0};
					return cas;
				}
				break;
				
			case GAUCHE:
				if(this.snake.getHead()[0]+1 >= this.width || hasBois(this.snake.getHead()[0]+1,this.snake.getHead()[1])) {
					int[] cas = {0,0};
					return cas;
				}
				break;
				
						
		}
		//Si pas normal on descend de 1 + on inverse le sens
		return null;
	}
	
	
}
