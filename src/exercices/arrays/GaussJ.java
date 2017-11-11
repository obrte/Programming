package exercices.arrays;
import java.util.Scanner;

public class GaussJ {
    public static void main(String[] args) {
        Scanner obs = new Scanner(System.in);
        double det, x, y, z = 0;
        System.out.println("cuantas variables tiene la ecuación?");
        int var = obs.nextInt();
        double [][] mat1 = new double[var][var+1];
        for(int i = 0; i < var; i++){
            System.out.println("Ecuación " + (i+1)+ "; introduce los valores de las variables, y su igualdad de la ecuación(presiona enter despues de cada valor)");
            for(int j = 0; j <= var; j++){
                    mat1[i][j] = obs.nextInt();
            }
        }

        //Impprimir funciones
        System.out.println();
        System.out.println("Para el sistema de "+var+"x"+var+" siguiente:");
        for(int i = 0; i < var; i++){
            for(int j = 0; j <= var; j++){
                switch (j){
                    case 0:
                        System.out.print(mat1[i][j]+"X");
                        break;
                    case 1:
                        if(mat1[i][j] < 0) {
                            System.out.print(mat1[i][j] + "Y");
                        }else{
                            System.out.print("+"+mat1[i][j] + "Y");
                        }
                        break;
                    case 2:
                        if(var==2){
                            System.out.print(" = "+mat1[i][j]);
                        }else{
                            if(mat1[i][j] < 0) {
                                System.out.print(mat1[i][j] + "Z");
                            }else{
                                System.out.print("+"+mat1[i][j] + "Z");
                            }
                        }
                        break;
                    default:
                        System.out.print(" = " + mat1[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    //imprimir matriz
        System.out.println("El metodo de GaussJ es:");
        for(int i = 0; i < var; i++){
            System.out.print("|");
            for(int j = 0; j <= var; j++){
                if(j==var){
                    System.out.print("| "+mat1[i][j]);
                }else {
                    System.out.print(mat1[i][j] +" ");
                }
            }
            System.out.println("|");
        }

        switch (var){
            case 2:
            //calcular determinante
                det = (mat1[0][0]*mat1[1][1]) - (mat1[1][0]*mat1[0][1]);
                if(det == 0){
                    System.out.println("No tiene Solució :(");
                    return;
                }
                System.out.println("El determinante es: "+det);
                System.out.println();

        //convertir en 1 r1,c1
                if(mat1[0][0]!=1) {
                    System.out.println("Igualamos a 1 en R1,C1");
                    x = mat1[0][0];
                    for (int j = 0; j <= var; j++) {
                        mat1[0][j] = mat1[0][j] / x;
                    }
                    //imprimir 1er conversion
                    for (int i = 0; i < var; i++) {
                        System.out.print("|");
                        for (int j = 0; j <= var; j++) {
                            if (j == var) {
                                System.out.print("| " + mat1[i][j]);
                            } else {
                                System.out.print(mat1[i][j] + " ");
                            }
                        }
                        System.out.println("|");
                    }
                    System.out.println();
                }
        //Convertir 0 r2,c1
                System.out.println("Igualamos a 0 en R2,C1");
                x = mat1[1][0];
                for(int j = 0; j <= var; j++){
                    mat1[1][j] += (-1*x) * mat1[0][j];
                }
            //imprimir 2da conversion
                for(int i = 0; i < var; i++){
                    System.out.print("|");
                    for(int j = 0; j <= var; j++){
                        if(j==var){
                            System.out.print("| "+mat1[i][j]);
                        }else {
                            System.out.print(mat1[i][j] +" ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println();
        //convertir en 1 r2,c2
                if(mat1[1][1]!=1) {
                    System.out.println("Igualamos a 1 en R2,C2");
                    x = mat1[1][1];
                    for (int j = 0; j <= var; j++) {
                        mat1[1][j] = mat1[1][j] / x;
                    }
                //imprimir 3er conversion
                    for (int i = 0; i < var; i++) {
                        System.out.print("|");
                        for (int j = 0; j <= var; j++) {
                            if (j == var) {
                                System.out.print("| " + mat1[i][j]);
                            } else {
                                System.out.print(mat1[i][j] + " ");
                            }
                        }
                        System.out.println("|");
                    }
                    System.out.println();
                }

        //convertir 0 r1,c2
                System.out.println("Igualamos a 0 en R1,C2");
                x = mat1[0][1];
                for(int j = 0; j <= var; j++){
                    mat1[0][j] += (-1*x) * mat1[1][j];
                }
            //imprimir 4ta conversion
                for(int i = 0; i < var; i++){
                    System.out.print("|");
                    for(int j = 0; j <= var; j++){
                        if(j==var){
                            System.out.print("| "+mat1[i][j]);
                        }else {
                            System.out.print(mat1[i][j] +" ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println();
                System.out.println("Los valores que resuelven las ecuaciones son:");
                System.out.println("X="+mat1[0][2]+", Y="+mat1[1][2]);
                break;
            case 3:
        //calcular determinante
                det = (mat1[0][0]*mat1[1][1]*mat1[2][2]) + (mat1[0][1]*mat1[1][2]*mat1[2][0]) + (mat1[0][2]*mat1[1][0]*mat1[2][1])
                     - (mat1[2][0]*mat1[1][1]*mat1[0][2]) - (mat1[2][1]*mat1[1][2]*mat1[0][0]) - (mat1[2][2]*mat1[1][0]*mat1[0][1]);
                if(det == 0){
                    System.out.println("No tiene Solució :(");
                    return;
                }
                System.out.println("El determinante es: "+det);
                System.out.println();
        //convertir en 1 r1,c1
                if(mat1[0][0]!=1) {
                    System.out.println("Igualamos a 1 en R1,C1");
                    x = mat1[0][0];
                    for (int j = 0; j <= var; j++) {
                        mat1[0][j] = mat1[0][j] / x;
                    }
                    //imprimir 1er conversion
                    for (int i = 0; i < var; i++) {
                        System.out.print("|");
                        for (int j = 0; j <= var; j++) {
                            if (j == var) {
                                System.out.print("| " + mat1[i][j]);
                            } else {
                                System.out.print(mat1[i][j] + " ");
                            }
                        }
                        System.out.println("|");
                    }
                    System.out.println();
                }
        //Convertir 0 r2,c1
                System.out.println("Igualamos a 0 en R2,C1");
                x = mat1[1][0];
                for(int j = 0; j <= var; j++){
                    mat1[1][j] += (-1*x) * mat1[0][j];
                }
            //imprimir 2da conversion
                for(int i = 0; i < var; i++){
                    System.out.print("|");
                    for(int j = 0; j <= var; j++){
                        if(j==var){
                            System.out.print("| "+mat1[i][j]);
                        }else {
                            System.out.print(mat1[i][j] +" ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println();
        //Convertir 0 r3,c1
                System.out.println("Igualamos a 0 en R3,C1");
                x = mat1[2][0];
                for(int j = 0; j <= var; j++){
                    mat1[2][j] += (-1*x) * mat1[0][j];
                }
            //imprimir 3er conversion
                for(int i = 0; i < var; i++){
                    System.out.print("|");
                    for(int j = 0; j <= var; j++){
                        if(j==var){
                            System.out.print("| "+mat1[i][j]);
                        }else {
                            System.out.print(mat1[i][j] +" ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println();
        //convertir en 1 r2,c2
                if(mat1[1][1]!=1) {
                    System.out.println("Igualamos a 1 en R2,C2");
                    x = mat1[1][1];
                    for (int j = 0; j <= var; j++) {
                        mat1[1][j] = mat1[1][j] / x;
                    }
                //imprimir 4ta conversion
                    for (int i = 0; i < var; i++) {
                        System.out.print("|");
                        for (int j = 0; j <= var; j++) {
                            if (j == var) {
                                System.out.print("| " + mat1[i][j]);
                            } else {
                                System.out.print(mat1[i][j] + " ");
                            }
                        }
                        System.out.println("|");
                    }
                    System.out.println();
                }
        //Convertir 0 r3,c2
                System.out.println("Igualamos a 0 en R3,C2");
                x = mat1[2][1];
                for(int j = 0; j <= var; j++){
                    mat1[2][j] += (-1*x) * mat1[1][j];
                }
            //imprimir 5ta conversion
                for(int i = 0; i < var; i++){
                    System.out.print("|");
                    for(int j = 0; j <= var; j++){
                        if(j==var){
                            System.out.print("| "+mat1[i][j]);
                        }else {
                            System.out.print(mat1[i][j] +" ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println();



        //convertir 0 r1,c2
                System.out.println("Igualamos a 0 en R1,C2");
                x = mat1[0][1];
                for(int j = 0; j <= var; j++){
                    mat1[0][j] += (-1*x) * mat1[1][j];
                }
            //imprimir 6ta convercion
                for(int i = 0; i < var; i++){
                    System.out.print("|");
                    for(int j = 0; j <= var; j++){
                        if(j==var){
                            System.out.print("| "+mat1[i][j]);
                        }else {
                            System.out.print(mat1[i][j] +" ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println();


        //convertir en 1 r3,c3
                if(mat1[2][2]!=1) {
                    System.out.println("Igualamos a 1 en R3,C3");
                    x = mat1[2][2];
                    for (int j = 0; j <= var; j++) {
                        mat1[2][j] = mat1[2][j] / x;
                    }
                    //imprimir 7ma conversion
                    for (int i = 0; i < var; i++) {
                        System.out.print("|");
                        for (int j = 0; j <= var; j++) {
                            if (j == var) {
                                System.out.print("| " + mat1[i][j]);
                            } else {
                                System.out.print(mat1[i][j] + " ");
                            }
                        }
                        System.out.println("|");
                    }
                    System.out.println();
                }

        //convertir 0 r2,c3
                System.out.println("Igualamos a 0 en R2,C3");
                x = mat1[1][2];
                for(int j = 0; j <= var; j++){
                    mat1[1][j] += (-1*x) * mat1[2][j];
                }
            //imprimir 8va convercion
                for(int i = 0; i < var; i++){
                    System.out.print("|");
                    for(int j = 0; j <= var; j++){
                        if(j==var){
                            System.out.print("| "+mat1[i][j]);
                        }else {
                            System.out.print(mat1[i][j] +" ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println();

        //convertir 0 r1,c3
                System.out.println("Igualamos a 0 en R1,C3");
                x = mat1[0][2];
                for(int j = 0; j <= var; j++){
                    mat1[0][j] += (-1*x) * mat1[2][j];
                }
            //imprimir 9na convercion
                for(int i = 0; i < var; i++){
                    System.out.print("|");
                    for(int j = 0; j <= var; j++){
                        if(j==var){
                            System.out.print("| "+mat1[i][j]);
                        }else {
                            System.out.print(mat1[i][j] +" ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println();

                System.out.println("Los valores que resuelven las ecuaciones son:");
                System.out.println("X="+mat1[0][3]+", Y="+mat1[1][3]+", Z="+mat1[2][3]);
                break;
                default:
                    System.out.println("Tamaño no admitido");
                    return;
        }


    }
}
