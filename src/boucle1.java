import java.util.Scanner;

public class boucle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int position = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Entrez le nombre " + i + " :");
            int nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
                position = i;
            }
        }

        System.out.println("Le maximum parmi les 20 nombres est : " + max);
        System.out.println("Il a été saisi à la position : " + position);

        // question 3
        System.out.println("Entrez une suite de nombres se terminant par 0 :");
        int nombre = scanner.nextInt();
        int maxSuite = nombre;

        while (nombre != 0) {
            if (nombre > maxSuite) {
                maxSuite = nombre;
            }
            nombre = scanner.nextInt();
        }

        System.out.println("Le maximum de la suite est : " + maxSuite);

    }
}
