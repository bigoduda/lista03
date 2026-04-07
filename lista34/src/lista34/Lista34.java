/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista34;
import java.util.Scanner;
/**
 *
 * @author Bigoduda
 */
public class Lista34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        int contadorMulheres = 0;

        String sexo, olhos, cabelos;

        System.out.println("Digite os dados (idade -1 para encerrar):");

        while (true) {
            System.out.print("Idade: ");
            idade = sc.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            sexo = sc.next();

            System.out.print("Cor dos olhos (azuis/verdes/castanhos): ");
            olhos = sc.next();

            System.out.print("Cor dos cabelos (louros/castanhos/pretos): ");
            cabelos = sc.next();

            // Maior idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            // Menor idade
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            // Condição pedida
            if (sexo.equalsIgnoreCase("F") &&
                idade >= 18 && idade <= 35 &&
                olhos.equalsIgnoreCase("verdes") &&
                cabelos.equalsIgnoreCase("louros")) {

                contadorMulheres++;
            }
        }

        // Resultados
        System.out.println("\nRESULTADOS:");
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de mulheres (18-35, olhos verdes, cabelos louros): " 
                           + contadorMulheres);

        sc.close();
    }
}