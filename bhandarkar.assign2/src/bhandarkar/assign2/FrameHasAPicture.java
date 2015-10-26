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
public class FrameHasAPicture {
    //HAS - A Relatiosnhip
	private Frame f;
	private Picture p;

	/**
	 * Default constructor for class
	 */
	public FrameHasAPicture() {
		this.f = new Frame();
		this.p = new Picture();
	}

	/**
	 * Parameterized constructor for class
	 * 
	 * @param framelen
	 * @param framewid
	 * @param framemat
	 * @param piclen
	 * @param picwid
	 * @param pictitle
	 * @param artist
	 */
	public FrameHasAPicture(double framelen, double framewid, String framemat, double piclen, double picwid,
			String pictitle, String artist) {
		if (piclen > framelen || picwid > framewid) {
			System.out.println("\nPicture cannot be Fit in the Frame!");
		} else {
			f = new Frame(framelen, framewid, framemat);
			p = new Picture(piclen, picwid, pictitle, artist);
		}
	}

	@Override
	/**
	 * @Description: This is the toString method that converts the object to a
	 *               string representation
	 * @Params: None
	 */
	public String toString() {
		if (f == null || p == null) {
			return "Cannot be created as it does fit the given dimensions";
		}
		return "Dimensions are as follows : \n" + f + "\n" + p;
	}
}
