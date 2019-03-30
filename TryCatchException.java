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
public class TryCatchException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            int x = 234;
            int y = 0;
            int result = x / y;

            System.out.println(x/y + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("caught Exception can't devide any numbers with zero");
            System.out.println(e);
        }
    }
    
}
