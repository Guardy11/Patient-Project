/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class ShiftCipher 
{ 
    
    private String origString;
    private String cipherString;
    private String decipheredString;
    private int shift;
    
    private String getAlphabet()
    {
        return "abcdefghijklmnopqrstuvwxyz";
    }        
    public ShiftCipher(String plain, int shift)
    {
        this.origString =plain;
        this.shift =shift;
    }
    private char shiftLetter (char origLetter, String type)
    {
        String alphabet = this.getAlphabet();
        int letterPosition = alphabet.indexOf(origLetter);
        char shiftedLetter;
        int shiftedPosition = 0;
        if (type.equals("encrypt")){
            shiftedPosition = (letterPosition + 3) % 26;
        }else if (type.equals("decrypt")){
            shiftedPosition = (letterPosition - 3) % 26;
        if (shiftedPosition < 0){
                shiftedPosition = alphabet.length() + shiftedPosition;
                
            } 
        }
        shiftedLetter = alphabet.charAt(shiftedPosition);
        return shiftedLetter;
    }
    public void cipher()
    {
        this.origString = this.origString.toLowerCase();
        this.cipherString = "";
        char shiftedLetter;
        for (char letter: this.origString.toCharArray())
        {
            shiftedLetter = this.shiftLetter(letter, "encrypt");
            this.cipherString += shiftedLetter;
            }
        }
        public String getCiphered()
        {
            return cipherString ;
        }
        public void decipher()
        {
            this.cipherString = this.cipherString.toLowerCase();
            this.decipheredString = "";
            char shiftedLetter;
            for(char letter: this.cipherString.toCharArray()){
                shiftedLetter = this.shiftLetter(letter, "decrypt");
                this.decipheredString += shiftedLetter;
            }
        }
        public String getDeciphered(){
            return decipheredString; 
        
    }
}

   
