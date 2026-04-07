/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista03;

/**
 *
 * @author Bigoduda
 */
public class Lista03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 233;
        
        while (i <= 456) {
            System.out.println(i);
            
            if (i >= 300 && i <= 400) {
                i += 3;
            } else {
                i += 5;
            }
        }
    }
} // TODO code application logic here   

