//A Very Simple Example
import java.util.Scanner;

class ExampleProgram {

    public static void main(String[] args) {
//        Scanner obs = new Scanner(System.in);
        int i, j, izq, der, lvl;
//        System.out.println("De cuantos niveles quieres el rombo?: ");
//        int lvl = obs.nextInt();
        lvl = 6;
        if(lvl%2==0) {
            izq = (lvl / 2) - 1;
            der = (lvl / 2) - 1;
        }else {
            izq = lvl/2;
            der = lvl/2;
        }
        for(i=0; i<lvl; i=i+2) {
            for (j = 0; j < lvl; j++) {
                if (j < izq || j> der) {
                    System.out.print(". ");
                } else {
                    System.out.print("* ");
                }
            }
            izq--;
            der++;
            System.out.println("");
        }

        //par
        if(lvl%2==0){
            der= der-1;
            izq= izq+1;
            for(i=lvl;i>2;i=i-2){
                for(j=lvl-2;j>=0;j--){
                    if (j < izq || j> der) {
                        System.out.print("- ");
                    } else {
                        System.out.print("* ");
                    }
                }
                izq++;
                der--;
                System.out.println("");
            }
            // inpar
        }else {
            der = der - 2;
            izq = izq + 2;
            for (i = lvl / 2; i > 0; i = i - 1) {
                for (j = lvl - 1; j >= 0; j--) {
                    if (j < izq || j > der) {
                        System.out.print("- ");
                    } else {
                        System.out.print("* ");
                    }
                }
                izq++;
                der--;
                System.out.println("");
            }
        }
    }
}