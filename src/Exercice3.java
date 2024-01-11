import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez deux nombres entiers a et b :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();



   System.out.println("Vérifier si la somme a + b est paire");
        int somme = a + b;
        if (somme % 2 == 0) {
            System.out.println("La somme a + b est paire.");
        } else {
            System.out.println("La somme a + b n'est pas paire.");
        }


           System.out.println("2. Vérifier si le produit ab est pair");
        int produit = a * b;
        if (produit % 2 == 0) {
            System.out.println("Le produit ab est pair.");
        } else {
            System.out.println("Le produit ab n'est pas pair.");
        }

        System.out.println("3. Connaître le signe de la somme a + b");

        if (somme > 0) {
            System.out.println("La somme a + b est positive.");
        } else if (somme < 0) {
            System.out.println("La somme a + b est négative.");
        } else {
            System.out.println("La somme a + b est égale à zéro.");
        }


        System.out.println("4. Connaître le signe du produit ab");

        if (produit > 0) {
            System.out.println("Le produit ab est positif.");
        } else if (produit < 0) {
            System.out.println("Le produit ab est négatif.");
        } else {
            System.out.println("Le produit ab est égal à zéro.");
        }

}}
