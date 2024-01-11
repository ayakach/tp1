import java.util.Scanner;

public class exercice5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'heure actuelle ");
        int heure = scanner.nextInt();

        System.out.println("Choisissez la langue ('f' pour français, 'a' pour anglais) :");
        char choixLangue = scanner.next().charAt(0);

        if (choixLangue == 'f') {
            if (heure >= 0 && heure <= 18) {
                System.out.println("Bonjour");
            } else if (heure > 18 && heure <= 22) {
                System.out.println("Bonsoir");
            } else if (heure > 22 && heure <= 24) {
                System.out.println("Bonne nuit");
            } else {
                System.out.println("Heure invalide");
            }
        } else if (choixLangue == 'a') {
            if (heure >= 0 && heure <= 18) {
                System.out.println("Good Morning");
            } else if (heure > 18 && heure <= 22) {
                System.out.println("Good Evening");
            } else if (heure > 22 && heure <= 24) {
                System.out.println("Good Night");
            } else {
                System.out.println("Invalid Hour");
            }
        } else {
            System.out.println("Choix de langue invalide.");
        }
    }
}
