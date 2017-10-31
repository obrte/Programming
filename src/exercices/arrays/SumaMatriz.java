package exercices.arrays;
import java.util.Scanner;


public class SumaMatriz {

//Suma de 2 arreglos
//NOTA: solo se pueden sumar arreglos que tengan las mismas dimensiones
    public static void main(String[] args) {
        Scanner obs = new Scanner((System.in));
        int i, j;
        System.out.println("Introduce numero de renglones de las Matrices:");
        int row = obs.nextInt();
        System.out.println("Introduce numero de columnas de las Matrices:");
        int col = obs.nextInt();
        int [][] mat1 = new int[row][col];
        int [][] mat2 = new int[row][col];
        //Matriz 1
        for(i = 0; i < row; i++){
            System.out.println("introduce los " + col + " numeros del renglon " + (i+1) + " de la matriz 1(presiona enter despues de digitar cada valor)");
            for(j = 0; j < col; j++){
                mat1[i][j] = obs.nextInt();
            }
        }
        //Matriz 2
        for(i = 0; i < row; i++){
            System.out.println("introduce los " + col + " numeros del renglon " + (i+1) + " de la matriz 2(presiona enter despues de digitar cada valor)");
            for(j = 0; j < col; j++){
                mat2[i][j] = obs.nextInt();
            }
        }
        System.out.println("La suma de tus matrices es:");
        for(i = 0; i < row; i++){
            if(i != row-2){
                for(j = 0; j < col; j++){
                    System.out.print(mat1[i][j] +" ");
                }
                System.out.print("\t \t");
                for(j = 0; j < col; j++){
                    System.out.print(mat2[i][j] +" ");
                }
                System.out.print("\t \t");
                for(j = 0; j < col; j++){
                    System.out.print((mat1[i][j] + mat2[i][j]) +" ");
                }
            }else {
                for(j = 0; j < col; j++){
                    System.out.print(mat1[i][j] +" ");
                }
                System.out.print("\t+\t");
                for(j = 0; j < col; j++){
                    System.out.print(mat2[i][j] +" ");
                }
                System.out.print("\t=\t");
                for(j = 0; j < col; j++) {
                    System.out.print((mat1[i][j] + mat2[i][j]) + " ");
                }

            }
            System.out.println();
        }

    }
}
