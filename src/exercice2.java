import java.util.Scanner;

public class exercice2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la valeur de a :");
        double a = scanner.nextDouble();

        System.out.println("Entrez la valeur de b :");
        double b = scanner.nextDouble();

        System.out.println("Entrez la valeur de c :");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Les racines de l'équation sont réelles et distinctes :");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("L'équation a une racine réelle et double :");
            System.out.println("Root = " + root);
        } else {
            System.out.println("L'équation n'a pas de racines réelles (racines imaginaires).");
        }

        scanner.close();
    }
}
