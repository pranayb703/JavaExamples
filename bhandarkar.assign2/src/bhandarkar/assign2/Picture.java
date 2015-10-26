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
public class Picture {
    //Dimensions (Length, Width), Title, Artist
    double length ;
    double width;
    String title ;
    String artist;
    
    /**
     * Default constructor of class Picture
     */
    public Picture(){
        length = 0.0;
        width = 0.0;
        title = "";
        artist = "";
    }
    
    /**
     * Parameterized constructor for Picture Class
     * @param length
     * @param width
     * @param title
     * @param artist 
     */
    public Picture(double length , double width , String title , String artist){
        this.length = length;
        this.width = width ;
        this.title = title;
        this.artist =artist;
    }
    /**
     * It returns the current length of Picture 
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
    }
    /**
     * 
     * @return title
     */
    public String getTitle(){
        return title;
    }
    /**
     * 
     * @param title 
     */
    public void setTitle(String title){
        this.title = title;
    }
    /**
     * 
     * @return artist 
     */
    public String getArtist(){
        return artist;
    }
    /**
     * 
     * @param artist 
     */
    public void setArtist(String artist){
        this.artist = artist;
    }
  
    @Override
    /**
     * 
     * @return String
     */
    public String toString(){
    return "The attributes of Picture are as follows : \n Length : "+length+" Width :"+width+" Title :"+title+" Artist :"+artist+" !!";
    }
    
    
}
