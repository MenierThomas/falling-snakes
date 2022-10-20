package falling_snakes;

public abstract class Obstacle {
	private static final double[] WEIGHT= {0.5f,0.7f,0.9f};//Poids additionné le dernier est 1 forcément (n-1) poidss
	private int[] coordinates;
	

	public Obstacle(int[] coordinates) {
		this.coordinates = coordinates;
	}
	
	public int[] getCoordinates() {
		return this.coordinates;
	}
	
	public static Obstacle randomObstacle(int[] coordinates){
		double r = Math.random();
		//Parmi les choix pondérées
		if(r < WEIGHT[1]) return new Bois(coordinates);
		if(r < WEIGHT[2]) return new Fraise(coordinates);
		if(r < WEIGHT[3]) return new Myrtille(coordinates);
		return new PieceDOr(coordinates);
	}
}
