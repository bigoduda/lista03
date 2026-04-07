/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista32;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Bigoduda
 */
public class Lista32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data mais antiga
        System.out.print("Digite a data mais antiga (dia mes ano): ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int a1 = sc.nextInt();

        // Data mais recente
        System.out.print("Digite a data mais recente (dia mes ano): ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int a2 = sc.nextInt();

        LocalDate data1 = LocalDate.of(a1, m1, d1);
        LocalDate data2 = LocalDate.of(a2, m2, d2);

        long dias = ChronoUnit.DAYS.between(data1, data2);

        System.out.println("Dias decorridos: " + dias);

        sc.close();
    }

    }
    

