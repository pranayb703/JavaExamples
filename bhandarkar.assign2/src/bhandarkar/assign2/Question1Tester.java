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
public class Question1Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
        // Testing for Rectangle Class
		Rectangle rectangle = new Rectangle(2, 3);
		System.out.println("------ RECTANGLE ------");
		System.out.println("Area of Rectangle\n" + rectangle);
		//setting new width for the updated rectangle's area
		rectangle.setWidth(15);
		System.out.println("Updated Area of Rectangle\n" + rectangle);
        // Testing for Square Class
		Square s = new Square(4);
		Rectangle rect = new Rectangle(7, 8);
		System.out.println("\n");
		System.out.println("------ SQUARE ------");
		System.out.println("This details are of Square : \n" + s);
		System.out.println("The details of super class Rectangle are : \n" + rect);
        // Sphere object        
		Sphere sphere = new Sphere(2);
		System.out.println("\n");
		System.out.println("------ SPHERE ------");
		System.out.println("Volume of Sphere\n" + sphere);
		sphere.setRadius(4);
		System.out.println("New volume is \n" + sphere);
        // Block
		Block b = new Block(2, 4, 2);
		System.out.println("\n");
		System.out.println("------ BLOCK ------");
		System.out.println("Volume of the Block with the parameters given \n" + b);
        //Cube 
                Cube cube = new Cube(4);
                System.out.println("\n");
		System.out.println("------ CUBE ------");
		System.out.println("Volume of the CUBE with the parameters given \n" + cube);
                
        // Circle
		Circle c = new Circle(2);
		System.out.println("\n");
		System.out.println("------ CIRCLE ------");
		System.out.println("The circle is here \n" + c);     
        // Cylinder
		Cylinder cy = new Cylinder(10, 20); // use constructor 
		System.out.println("\n");
		System.out.println("------ CYLINDER ------");
		System.out.println(" Cylider inside the Circle\n" + cy);  
                
                
       // FrameHasAPicture - Frame is bigger than Picture to accommodate the Picture.
		FrameHasAPicture pf = new FrameHasAPicture(4, 6, "Glass", 2, 4, "Adventures of P", "Pranay");
		System.out.println("\n");
		System.out.println("------ PICTURE FRAME ------" );
		System.out.println("Picture Frame ,  " + pf);
		// Error case- when Picture is bigger than Frame
		FrameHasAPicture pf1 = new FrameHasAPicture(4, 6, "Ceramic", 4, 8, "Adventures of P", "Pranay");
		System.out.println("\nPicture Frame , " + pf1);

        // Block Has A Sphere

		BlockHasASphere bb = new BlockHasASphere(10, 10, 10, 2);
		System.out.println("\n");
		System.out.println("------ BLOCK HAS A SPHERE ------");
		System.out.println("" + bb);
		// Error case  when Sphere is bigger than the Block.
		BlockHasASphere bb1 = new BlockHasASphere(20, 11, 9, 9);
		System.out.println("" + bb1);
		
	//Cone Has A Circle
		Cone cc = new Cone(2,4);
		System.out.println("\n");
		System.out.println("------ CONE HAS A CIRCLE ------");
		System.out.println(""+cc);        
                
    }
    
}
