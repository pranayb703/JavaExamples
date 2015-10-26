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
public class Cylinder extends Circle  {
    
    double height ;
    double radius;
    double volume;
    static final double pi = 3.142 ;
    /**
     * 
     */
    public Cylinder(){
    super();
    //this.radius = 0.0;
    height =0.0;
    }
    /**
     * 
     * @param radius
     * @param height 
     */
    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height= height;
        setVolume(radius,height);
    }
    /**
     * 
     * @return 
     */
    public double getHeight() {
		return height;
	}

    /**
     * Setter function for height of the cylinder
     * 
     * @param height
     */
	public void setHeight(double height) {
		this.height = height;
		setVolume(this.radius, this.height);
	}
    public double getVolume(){
        return this.volume ;
    }
    public void setVolume(double radius ,double height){
        this.volume = pi * radius * radius * height ;
    }
    @Override
    public String toString(){
        return "The details about cylinder are radius =  "+ radius +" height = "+ getHeight() + " Volume of Cylinder = " +getVolume();
    }
    
}