import java.util.Scanner;

public class exercice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la première variable :");
        int variable1 = scanner.nextInt();
        System.out.println("Entrez la deuxième variable :");
        int variable2 = scanner.nextInt();
        if (variable1 > variable2) {
            int temp = variable1;
            variable1 = variable2;
            variable2 = temp;
        }
        System.out.println("Les variables dans l'ordre croissant sont : " + variable1 + ", " + variable2);
    }
}
