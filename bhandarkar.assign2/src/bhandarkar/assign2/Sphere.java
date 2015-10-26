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
public class Sphere {
    double radius ;
    double volume;
    
    public Sphere(){
    radius = 0.0;
    volume = 0.0;
    }
    /**
     * 
     * @param radius 
     */
    public Sphere(double radius){
    this.radius = radius ;
    setVolume(radius);
    }
    /**
     * 
     * @return 
     */
    public double getRadius(){
    return this.radius;
    }
    /**
     * 
     * @param radius 
     */
    public void setRadius(double radius){
        this.radius = radius;
        setVolume(radius);
    }
    /**
     * 
     * @return 
     */
    public double getVolume(){
        return this.volume;
    }
    /**
     * 
     * @param radius 
     */
    public void setVolume(double radius){
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
    @Override
    /**
     * 
     */
    public String toString(){
        return "Radius of Sphere = " + getRadius() + " and Volume of Sphere is = " + getVolume(); 
    }
    
}
