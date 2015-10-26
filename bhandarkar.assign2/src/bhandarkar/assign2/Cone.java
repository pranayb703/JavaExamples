/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhandarkar.assign2;

/**
 *
 * @author Pranay
 */
public class Cone {
    // Composition has-a Relationship

	private Circle base;
	// private ConeHasACircle cone;
	double coneheight;

	/**
	 * Default constructor for class
	 */
	public Cone() {
		base = new Circle();
		this.coneheight = 0;

	}

	/**
         * 
         * @param coneRadius
         * @param coneHeight 
         */
	public Cone(double coneRadius, double coneHeight) {
		coneheight = coneHeight;
		base = new Circle(coneRadius);

	}

	/**
	 * getter function for height of the cone
	 * 
	 * @return coneheight
	 */
	public double getConeheight() {
		return coneheight;
	}

	/**
	 * setter function for height of cone
	 * 
	 * @param coneheight
	 */
	public void setConeheight(double coneheight) {
		this.coneheight = coneheight;
	}

	@Override
	/**
	 * This is the toString method that converts the object to a string
	 * representation
	 */
	public String toString() {
		return "\nCone Has A Circle \nits details are " + base + ", \nand cone height is " + coneheight + " .";
	}
}
