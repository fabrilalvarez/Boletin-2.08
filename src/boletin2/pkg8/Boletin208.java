/*Calcular  una temperatura expresada en grados centigrados
 y calcule sus respectivos farenheit y kelvin. */
package boletin2.pkg8;

import java.util.Scanner;

public class Boletin208 {

    public static void main(String[] args) {
        // Código de la aplicación.
        //c=grados centigrados.
        float C, F, K;
        System.out.println("Conversor de Cº a Fº y K");
        Scanner dato = new Scanner(System.in);
        System.out.println(" Cº");
        C = dato.nextFloat();

        F = (C + 32) / 1800;
        K = C + 273;

        System.out.println(F + " ºF");
        System.out.println(K + " K");

    }

}
