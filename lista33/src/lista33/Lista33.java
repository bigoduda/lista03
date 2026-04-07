/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista33;
import java.util.Scanner;
/**
 *
 * @author Bigoduda
 */
public class Lista33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += (double) i / i;
        }

        System.out.println("Resultado de S = " + soma);

        sc.close();
    }
}  // TODO code application logic here
    
