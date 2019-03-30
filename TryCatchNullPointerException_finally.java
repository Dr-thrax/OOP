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
public class TryCatchNullPointerException_finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            int x = 10;
            int y = 0;
            int result = x / y;

            System.out.println("Division result is --> " + result);
        } catch (NullPointerException e) {
            System.out.println("caught Exception");
            System.out.println(e);
        }
        finally{
            System.out.println("Something Always Happened");
        }
    }
    
}
