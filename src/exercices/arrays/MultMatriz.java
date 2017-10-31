package exercices.arrays;
import java.util.Scanner;

public class MultMatriz {

//multiplicacion de 2 matrices
//NOTA: solo se pueden multiplicar las matrices que coincidan el numero de columnas de la matriz1 con el numero de renglones de la matriz 2
//Ejemplo: 3x3 X 3x4
    public static void main(String[] args) {
        Scanner obs = new Scanner((System.in));
        int i, j, k, h, row2, result;
        System.out.println("--introduce matrices validas para multiplicar--");
        System.out.println("Introduce numero de renglones de las Matriz 1:");
        int row1 = obs.nextInt();
        System.out.println("Introduce numero de columnas de las Matriz 1:");
        int col1 = obs.nextInt();
        int [][] mat1 = new int[row1][col1];
        System.out.println("Introduce numero de renglones de las Matriz 2:");
        do {
            row2 = obs.nextInt();
            if(row2==0){
                return;
            }
            if(col1!=row2){
                System.out.println("No es posible multiplicar una matriz A de " +col1 +" columnas con una matriz B de " +row2 +" renglones");
                System.out.println("introduce un valor valido o presiona 0 (CERO) para salir");
            }
        }while (col1!=row2);
        System.out.println("Introduce numero de columnas de las Matriz 2:");
        int col2 = obs.nextInt();
        int [][] mat2 = new int[row2][col2];

//in Matriz 1
        for(i = 0; i < row1; i++){
            System.out.println("introduce los " + col1 + " numeros del renglon " + (i+1) + " de la matriz 1(presiona enter despues de digitar cada valor)");
            for(j = 0; j < col1; j++){
                mat1[i][j] = obs.nextInt();
            }
        }

//in Matriz 2
        for(i = 0; i < row2; i++){
            System.out.println("introduce los " + col2 + " numeros del renglon " + (i+1) + " de la matriz 2(presiona enter despues de digitar cada valor)");
            for(j = 0; j < col2; j++){
                mat2[i][j] = obs.nextInt();
            }
        }

//Imprimiendo Datos
        System.out.println("La multiplicacion de tus matrices es:");
        for(i = 0; i < row2; i++){
            if(i != row1-2){

            //out Matriz 1
                for(j = 0; j < col1; j++) {
                    if (i < row1) {
                        System.out.print(mat1[i][j] + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            //Tab entre Matriz 1 y Matriz 2
                System.out.print("\t \t");

             //out Matriz 1
                for(j = 0; j < col2; j++){
                    System.out.print(mat2[i][j] +" ");
                }

            //Tab entre Matriz 2 y Resultado
                System.out.print("\t \t");
                //matriz resultado mult

                if (i < row1) {
                    for(j = 0; j < col2; j++){
                        result = 0;
                        for(k = 0; k < row2; k++) {
                            result += (mat1[i][k]) * (mat2[k][j]);
                        }
                        System.out.print(result + " ");
                    }
                }else {
                    for(j = 0; j < col2; j++){
                        System.out.print("  ");
                    }
                }


            }else {



                for(j = 0; j < col1; j++) {
                    if (i < row1) {
                        System.out.print(mat1[i][j] + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("\tX\t");
                for(j = 0; j < col2; j++){
                    System.out.print(mat2[i][j] +" ");
                }
                System.out.print("\t=\t");
                //matriz resultado mult

                if (i < row1) {
                    for(j = 0; j < col2; j++){
                        result = 0;
                        for(k = 0; k < row2; k++) {
                            result += (mat1[i][k]) * (mat2[k][j]);
                        }
                        System.out.print(result + " ");
                    }
                }else {
                    for (j = 0; j < col2; j++) {
                        System.out.print("  ");
                    }
                }


            }
            System.out.println();
        }

    }
}
