package entities;

import entities.enums.Color;

public abstract class Shape {

	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

//	Classe com um m�todo abstrato deve ser abstrata
	public abstract double area();
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
