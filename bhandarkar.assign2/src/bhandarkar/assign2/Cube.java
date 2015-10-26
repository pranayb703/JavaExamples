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
public class Cube {
    private Block b;

	/**
	 * Default constructor for class
	 */
	public Cube() {
		this.b = new Block();
	}

	/**
	 * Parameterized constructor for class
	 * 
	 * @param cubelen
	 */
	public Cube(double cubelen) {
		b = new Block(cubelen, cubelen, cubelen);
	}

	@Override
	/**
	 * This is the toString method that converts the object to a string
	 * representation
	 */
	public String toString() {
		return "This is Cube of Block type with dimensions \n" + b + " ";
	}
}
