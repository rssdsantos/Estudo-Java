import java.util.Scanner;
public class Prateleira {
    public static void main(String[] args) {

                int[][] prateleira = new int[4][3];

                Scanner leitura = new Scanner(System.in);


                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Digite a quantidade de peças na prateleira " + (i + 1) + ", e no compartimento " + (j + 1) + ": ");
                        prateleira[i][j] = leitura.nextInt();

                    }
                    System.out.println("\n");

                }




                for (int i = 0; i < 4; i++) {
                    System.out.println("Prateleira " + (i + 1) + ":");
                    for (int j = 0; j < 3; j++) {
                        System.out.println("Compartimento " + (j + 1) + ": " + prateleira[i][j]);
                    }
                    System.out.println("\n");
                }
    }
}


