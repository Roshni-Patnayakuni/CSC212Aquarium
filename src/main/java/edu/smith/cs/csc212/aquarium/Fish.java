package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	Color color;
	int x;
	int y;
	boolean isLittle;
	boolean facingLeft;
	
	public Fish(Color c, int startX, int startY, 
			boolean isLittle, boolean facingLeft) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		
		}
	public void draw(Graphics2D g) {
		if (this.isLittle == true && this.facingLeft == true) {
		DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		this.swim();
		} else if (this.isLittle == false && this.facingLeft == true ){
		DrawFish.facingLeft(g, this.color, this.x, this.y);
		this.swim();	
		} else if (this.isLittle == true && this.facingLeft == false) {
		DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		this.swim();
		} else {
		DrawFish.facingRight(g, this.color, this.x, this.y);
		this.swim();
		}
	}
	public void swim() {
		this.x += 1;
		this.y += 1;
	}
}
