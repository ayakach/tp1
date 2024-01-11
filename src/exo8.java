import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre des lignes :");
        int n = scanner.nextInt();

        // Affichage croissant
        for (int i = 1; i <= n/2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Affichage décroissant
        for (int i = n /2+1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
