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
public class Frame {
    double length;
    double width;
    double area;
    String material;
    /**
     * Default constructor
     */
    public Frame(){
        length = 0.0;
        width = 0.0;
        area = 0.0;
        material= "";
    }
    /**
     * Parameterized constructor
     * @param length
     * @param width
     * @param material 
     */
    public Frame(double length , double width , String material){
        this.length = length;
        this.width = width;
        this.area = this.length * this.width;
        this.material = material;
    }
    /**
     * It returns the current length of Frame 
     * @return length
     */
    public double getLength(){
        return length;
    }
    /**
     * 
     * @param length 
     */
    public void setLength(double length){
        this.length = length;
        setArea(length,this.width);
    }
    /**
     * 
     * @return width
     */
    public double getWidth(){
        return width;
    }
    /**
     * 
     * @param width 
     */
    public void setWidth(double width){
        this.width = width;
        setArea(this.length, width);
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
    /**
     * 
     * @return material
     */
    public String getMaterial(){
        return material;
    }
    /**
     * 
     * @param material 
     */
    public void setMaterial(String material){
        this.material = material;
    }
    @Override
    public String toString(){
        return "The attributes of Frame are as follows : \n Length : "+length+" Width :"+width+" Area :"+area+" Material :"+material+" !!";
    }
}
