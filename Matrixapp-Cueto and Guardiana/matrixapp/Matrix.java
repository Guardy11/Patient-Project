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
public class Matrix {
    
    final int Size = 4;
    private int [][] square = new int [Size][Size];
    
    
    public void addMatrices(Matrix a, Matrix b){
        int j, l;
        for ( j = 0; j < Size; j++){
            for ( l = 0; l < Size; l++){
                square [j][l] = a.getCell(j,l) + b.getCell(j,l);
            }
            
        }
    }
    public void setCell (int i, int j, int val){
        this.square [i][j] = val;
    }
    public int getCell(int x, int y){
        return square[x][y];
    }
    public void displayMatrix(){
        for (int a = 0; a < Size; a++){
            for (int b = 0; b < Size; b++){
                System.out.print(this.getCell(a, b)+ "\t");
            }
            System.out.println();
        }
    }
}
    

