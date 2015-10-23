/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixapp;

/**
 *
 * @author student
 */
public class MatrixApp {

   
    public static void main(String[] args) {
        Matrix AddMatrix = new Matrix();
        
        Matrix MatC = new Matrix();
        Matrix MatG = new Matrix();
        
        System.out.println("Matrix C");
        MatC.setCell(0,0,1);
        MatC.setCell(0,1,2);
        MatC.setCell(0,2,3);
        MatC.setCell(0,3,4);
        MatC.setCell(1,0,5);
        MatC.setCell(1,1,6);
        MatC.setCell(1,2,7);
        MatC.setCell(1,3,8);
        MatC.setCell(2,0,9);
        MatC.setCell(2,1,0);
        MatC.setCell(2,2,1);
        MatC.setCell(2,3,2);
        MatC.setCell(3,0,3);
        MatC.setCell(3,1,4);
        MatC.setCell(3,2,5);
        MatC.setCell(3,3,6);
        
        MatC.displayMatrix();
        
        System.out.println("*****************");
        
        System.out.println("Matrix G");
        MatG.setCell(0,0,1);
        MatG.setCell(0,1,2);
        MatG.setCell(0,2,3);
        MatG.setCell(1,0,5);
        MatG.setCell(1,1,6);
        MatG.setCell(1,2,7);
        MatG.setCell(1,3,8);
        MatG.setCell(2,0,9);
        MatG.setCell(2,1,0);
        MatG.setCell(2,2,1);
        MatG.setCell(2,3,2);
        MatG.setCell(3,0,3);
        MatG.setCell(3,1,4);
        MatG.setCell(3,2,5);
        MatG.setCell(3,3,6);
        
        MatG.displayMatrix();
        
        System.out.println("******************");
        System.out.println("Output of Two Matrices: ");
        AddMatrix.addMatrices(MatC, MatG);
        AddMatrix.displayMatrix();
        
        
        
    }
    
}
