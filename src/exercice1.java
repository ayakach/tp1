import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez trois nombres :");
        double nombre1 = scanner.nextDouble();
        double nombre2 = scanner.nextDouble();
        double nombre3 = scanner.nextDouble();
        double max = nombre1;
        if (nombre2 > max) {
            max = nombre2;
        }
        if (nombre3 > max) {
            max= nombre3;
        }


        System.out.println("Le maximum des trois nombres est : " + max);

        scanner.close();
    }
}