
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocienciuas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProyectoCiencias {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int m = leer.nextInt();
        int h = leer.nextInt();
        int[] caraF = new int[m];
        for (int i = 0; i < m; i++) {
            caraF[i] = leer.nextInt();
        }
        int[] caraIz = new int[n];
        for (int i = 0; i < n; i++) {
            caraIz[i] = leer.nextInt();

        }
        int[][] vistaSuperior = new int[n][m];
        for (int i = 0; i < vistaSuperior.length; i++) {
            for (int j = 0; j < vistaSuperior[0].length; j++) {
                vistaSuperior[i][j] = leer.nextInt();
            }
        }
        vistaSuperior = armarObjeto(caraF, caraIz, vistaSuperior);

        mostrarMatriz(vistaSuperior);

    }

    public static void mostrarMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int l = matrix[0].length - 1;
            for (int j = 0; j < l; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(matrix[i][l]);
        }
    }

    public static int[][] armarObjeto(int caraF[], int caraIz[], int[][] vistaSuperior) {
        for (int i = 0; i < vistaSuperior.length; i++) {
            for (int j = 0; j < vistaSuperior[0].length; j++) {
                if (vistaSuperior[i][j] == 1) {
                    vistaSuperior[i][j] = Integer.min(caraF[j], caraIz[i]);
                }

            }
        }
        return vistaSuperior;
    }
}
