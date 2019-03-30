/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo1;

/**
 *
 * @author Dr. Thrax
 */
public class ThrowException1 {

    public static void point() 
    { 
        try
        { 
           throw new ArithmeticException("Caught Exception"); 
          
        } 
        catch(ArithmeticException e1) 
        { 
            System.out.println("Somthing Is running"); 
            throw e1; 
        } 
    } 
    public static void main(String[] args) {
        
        try
        { 
            point(); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.println("This is the main function"); 
        } 
    }
    
}
