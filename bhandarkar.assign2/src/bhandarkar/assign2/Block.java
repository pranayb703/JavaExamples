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
public class Block {
    double height;
    double depth;
    double width;
    double volume;
    /**
     * Default Constructor
     */
    public Block(){
        height = 0.0;
        depth = 0.0 ;
        width = 0.0;
        volume = 0.0;
    }
    /**
     * 
     * @param height
     * @param depth
     * @param width 
     */
    public Block(double height ,double depth , double width){
        this.height=height;
        this.depth=depth;
        this.width=width;
        setVolume(this.height,this.depth,this.width);
    }/**
     * 
     * @return height
     */
    public double getHeight(){
        return height;
    }
    /**
     * 
     * @param height 
     */
    public void setHeight(double height){
        this.height = height;
        setVolume(height, this.depth ,this.width);
    }
    /**
     * 
     * @return depth
     */
    public double getDepth(){
        return depth;
    }
    /**
     * 
     * @param depth 
     */
    public void setDepth(double depth){
        this.depth=depth;
        setVolume(this.height,depth,this.width);
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
        setVolume(this.height,this.depth,width);
    }
    /**
     * 
     * @return volume
     */
    public double getVolume(){
        return this.volume;
    } 
    /**
     * 
     * @param height
     * @param depth
     * @param width 
     */
    public void setVolume(double height,double depth ,double width ){
        this.width = width;
	this.height = height;
        this.depth =depth;
        volume = height * depth * width ;
    }
    @Override
    /**
     * 
     */
    public String toString(){
        return "The attributes of the Block are Height = "+height+" Depth = "+depth+" Width = "+width+" and Volume = "+volume;
   
    }
    
    
}
