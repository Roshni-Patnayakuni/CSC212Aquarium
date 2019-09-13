package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	Color color;
	int x;
	int y;
	
	public Fish(Color c, int startX, int startY) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		}
	public void draw(Graphics2D g) {
		DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		this.swim();
	}
	public void swim() {
		this.x += 1;
		this.y += 1;
	}
}
