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
public class BlockHasASphere {
    //Compostion Example HAS-A Relatiosnhip
    private Sphere sphere;
    private Block block;
    public BlockHasASphere() {
        sphere = new Sphere();
       	block = new Block();

    }
    public BlockHasASphere(double blckHeight, double blckDepth, double blckLen, double ballRadius) {
	double diameter = 2 * ballRadius;
        if (diameter > blckHeight || diameter > blckDepth || diameter > blckLen) {
	System.out.println("\nBall will not fit Inside the Block");
	return;
	}

	sphere = new Sphere(ballRadius);
        block = new Block(blckHeight, blckDepth, blckLen);

	}
    @Override
    public String toString() {
		if (sphere == null || block == null) {
			return "There is no Ball or Block";
		}
		return "Block Has A Sphere \n and details are : " + sphere + "\nand details of block are : " + block + "";
}
}
   
