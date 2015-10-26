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
public class Square extends Rectangle{
    /**
     * Default Constructor of Square 
     * @param side 
     */
    public Square(double side){
        super(side,side);
    }
    @Override
    /**
     * 
     */
    public String toString(){
        return "The side of Square is S = "+this.getLength()+" and Area = "+ this.getArea();
    }
    
}
