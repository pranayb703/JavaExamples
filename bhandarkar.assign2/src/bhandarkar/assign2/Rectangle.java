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
public class Rectangle {
    double width ;
    double length;
    
    double area;
    
    /**
     * 
     */
    public Rectangle(){
        width =  0.0 ;
        length = 0.0;
        area = 0.0;
    }
    /**
     * 
     * @param width
     * @param length 
     */
    public Rectangle(double width , double length){
        this.width = width;
        this.length = length;
        this.area = width * length;
    }
    /**
     * 
     * @return 
     */
    public double getWidth(){
        return this.width;
    }
    /**
     * 
     * @param width 
     */
    public void setWidth(double width){
        this.width = width;
        setArea(width,this.length);
    }
    /**
     * 
     * @return 
     */
    public double getLength(){
        return this.length;
    }
    /**
     * 
     * @param length 
     */
    public void setLength(double length){
        this.length = length;
        setArea(this.width,length);
    }
    /**
     * 
     * @return Area
     */
    public double getArea(){
        return this.area;
    } 
    /**
     * 
     * @param width
     * @param length 
     */
    public void setArea(double width , double length){
        this.width = width;
	this.length = length;
        area = width * length;
    }
    @Override
    /**
     * 
     */
    public String toString(){
    return "According to given width : "+width+" and length : "+length+", the Area = "+area;
    } 
   
}
