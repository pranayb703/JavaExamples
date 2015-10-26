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
public class Circle {
    double radius ;
    double area;
    private static final double pi = 3.142 ;
    /**
     * Default Constructor
     */
    public Circle(){
        radius = 0.0 ;
        area = 0.0 ;
    }
    /**
     * Parameterized Constructor
     * @param radius 
     */
    public Circle(double radius){
        this.radius = radius;
        area = pi * radius * radius ;
    }
    /**
     * 
     * @return radius
     */
    public double getRadius(){
        return radius;
    }
    /**
     * 
     * @param radius 
     */
    public void setRadius(double radius){
        this.radius = radius ;
        setArea(this.radius);
    }
    /**
     * 
     * @return area 
     */
    public double getArea(){
        return area;
    }
    /**
     * 
     * @param radius 
     */
    public void setArea(double radius){
        area = pi * radius * radius ;
    }
    @Override
    /**
     * Overriding the toString function from String Class
     */
    public String toString(){
        return "Radius of the circle is R ="+getRadius()+" and following Area is A= "+getArea()+" !";
    }
    
    
}
