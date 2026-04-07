/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista35;
import java.util.Scanner;
/**
 *
 * @author Bigoduda
 */
public class Lista35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        int veiculos;
        int acidentes;

        int maiorAcidente = 0;
        int menorAcidente = 0;
        int codMaior = 0;
        int codMenor = 0;

        int somaVeiculos = 0;

        int somaAcidentesMenos2000 = 0;
        int contCidadesMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nCidade " + i);

            System.out.print("Código da cidade: ");
            codigo = sc.nextInt();

            System.out.print("Número de veículos: ");
            veiculos = sc.nextInt();

            System.out.print("Número de acidentes: ");
            acidentes = sc.nextInt();

            // Maior e menor índice de acidentes
            if (i == 1) {
                menorAcidente = acidentes;
                codMenor = codigo;
            }

            if (acidentes > maiorAcidente) {
                maiorAcidente = acidentes;
                codMaior = codigo;
            }

            if (acidentes < menorAcidente) {
                menorAcidente = acidentes;
                codMenor = codigo;
            }

            // Soma de veículos
            somaVeiculos += veiculos;

            // Cidades com menos de 2000 veículos
            if (veiculos < 2000) {
                somaAcidentesMenos2000 += acidentes;
                contCidadesMenos2000++;
            }
        }

        double mediaVeiculos = somaVeiculos / 5.0;

        double mediaAcidentesMenos2000 = 0;
        if (contCidadesMenos2000 > 0) {
            mediaAcidentesMenos2000 = (double) somaAcidentesMenos2000 / contCidadesMenos2000;
        }

        // Resultados
        System.out.println("\nRESULTADOS:");
        System.out.println("Maior número de acidentes: " + maiorAcidente + " (Cidade " + codMaior + ")");
        System.out.println("Menor número de acidentes: " + menorAcidente + " (Cidade " + codMenor + ")");
        System.out.println("Média de veículos: " + mediaVeiculos);
        System.out.println("Média de acidentes (cidades com < 2000 veículos): " + mediaAcidentesMenos2000);

        sc.close();
    }
}// TODO code application logic here
    