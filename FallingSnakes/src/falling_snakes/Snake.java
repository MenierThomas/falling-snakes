package falling_snakes;

import java.util.ArrayList;

enum Orientation{DROITE, GAUCHE};

public class Snake {
	private int size;
	private Orientation orientation;
	private ArrayList<int[]> body;
	
	public Snake(int size) {
		this.size = size;
		this.orientation = Orientation.DROITE;
		ArrayList<int[]> body = new ArrayList<int[]>();
		int[] coordonnee = {0,0};
		for(int i = 0; i < size;i++) {
			body.add(coordonnee);
		}
		this.body = body;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}


	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public int[] getHead() {
		return this.body.get(0);
	}

	public void step(int[] coordonnee) {
		//On avance le corps
		for(int i = this.body.size()-1; i > 0 ; i--) {
			this.body.set(i, this.body.get(i-1));
		}
		//On place la tête sur la nouvelle case
		this.body.set(0,coordonnee);
	}
	
	public void add() {
		
	}
	
	public void suppr() {
		
	}
	

}
