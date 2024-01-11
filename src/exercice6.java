import java.util.Scanner;

public class exercice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la valeur de A :");
        int a = scanner.nextInt();

        System.out.println("Entrez la valeur de B :");
        int b = scanner.nextInt();

        int signeProduit;

        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            signeProduit = 1; // Le produit est positif
        } else {
            signeProduit = -1; // Le produit est négatif
        }

        System.out.println("Le signe du produit de A et B est : " + signeProduit);

        scanner.close();
    }
}
