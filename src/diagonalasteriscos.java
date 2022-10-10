import java.util.Scanner;

public class diagonalasteriscos {
    public static void main(String[] args) {
        int altura = 0;
        Scanner algo = new Scanner(System.in);
        System.out.println("Introduzca altura:");
        altura = algo.nextInt();
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < i; j++) {
            System.out.print(" ");
            }
            System.out.println("*");
        }

        }
}
