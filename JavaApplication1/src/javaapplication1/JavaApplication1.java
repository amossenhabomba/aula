/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Nhabomba
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int q = 0;
        for (int num = 300; num >= 70; num--) {
            if (num % 10 == 0) {
                System.out.println(num);
            }
            if (num % 4 == 0) {
                q++;
            }
        }
        System.out.println("quantidade"+q);
    }
}
