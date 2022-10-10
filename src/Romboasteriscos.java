import java.util.Scanner;

public class Romboasteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un numero:");
        int altura = sc.nextInt();
        int bajura = sc.nextInt();
        for (int i = 0; i < altura; i++) {
        }
        int j;
        for (j = 0; j < altura - i - 1; j++) {
            System.out.print(" ");
        }
        for (j = 0; j < i + 1; j++) {
            System.out.print(" *");
        }
        System.out.println("");

        for (int j = 0; j < bajura; j++) {
        }
    }
}


