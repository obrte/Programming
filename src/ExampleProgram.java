//A Very Simple Example
import java.util.Scanner;

class ExampleProgram {

    public static void main(String[] args) {
//        Scanner obs = new Scanner(System.in);
        int i, j, izq, der;
        int lvl = 6;
//        System.out.println("De cuantos niveles quieres la piramide?:");
//        int lvl = obs.nextInt();
        izq = lvl;
        der = lvl;
        for (i = 0; i < lvl; i++) {
            for (j = 1; j < lvl * 2; j++) {
                if (j < izq || j > der) {
                    System.out.print(". ");
                } else {
                    System.out.print("* ");
                }
            }
            izq--;
            der++;
            System.out.println();

// parte de abajo

        izq = izq +1;
        der = der -1;
            for (i = lvl; i > 0; i--) {
                for (j=(lvl*2)-1; j >0; j--) {
                    if (j < izq || j > der) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }

                }
                izq++;
                der--;
                System.out.println();
            }
        }

    }
}

