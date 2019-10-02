/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_01;

/**
 *
 * @author jbridgman2
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int centimetres = 100;
        double inches;
        double feet;
        
        inches = centimetres / 2.54;
        feet = inches / 12;
        
        System.out.println(centimetres + "cm is " + feet + "ft");
    }
    
}
