import java.util.Scanner;

public class tabexo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie de l'entier N
        System.out.println("Entrez un entier N :");
        int N = scanner.nextInt();

        // Affichage de la représentation binaire
        System.out.println("La représentation binaire de " + N + " est : " + convertirEnBinaire(N));

        scanner.close();
    }

    // Fonction pour convertir un entier en représentation binaire
    private static String convertirEnBinaire(int nombre) {
        return Integer.toBinaryString(nombre);
    }
}
