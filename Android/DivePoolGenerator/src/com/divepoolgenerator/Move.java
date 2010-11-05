package com.divepoolgenerator;

public class Move {

	private String id;
	private final int points;
	
	public Move(String id, int points) {	
		this.points = points;
		this.id = id;		
	}	

	public String getId() {
		return id;
	}

	public int getPoints() {
		return points;
	}
	
}
