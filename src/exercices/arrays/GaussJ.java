package exercices.arrays;
import java.util.Scanner;

public class GaussJ {
    public static void main(String[] args) {
        Scanner obs = new Scanner(System.in);
        System.out.println("cuantas variables tiene la ecuación?");
        int var = obs.nextInt();
        int [][] mat1 = new int[var][var+1];
        for(int i = 0; i < var; i++){
            System.out.println("Ecuación " + (i+1)+ "; introduce los valores de las variables, y su igualdad de la ecuación(presiona enter despues de cada valor)");
            for(int j = 0; j <= var; j++){
                    mat1[i][j] = obs.nextInt();
            }
        }

        //Imprimiendo
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


    }
}
