import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Entrez le numéro du mois");
        int mois = scanner.nextInt();
        if (mois == 2) {
            System.out.println("Entrez l'année (1900 à 2100) :");
            int annee = scanner.nextInt();
            if (annee < 1900 || annee > 2100) {
                System.out.println("Année invalide. Veuillez entrer une année entre 1900 et 2100.");
                return;
            }
            boolean estBissextile = (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
            int joursFevrier = (estBissextile) ? 29 : 28;

            System.out.println("Le mois de février " + annee + " a " + joursFevrier + " jours.");
        } else {
            int jours;
            if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                jours = 30;
            } else {
                jours = 31;
            }

            System.out.println("Le mois " + mois + " a " + jours + " jours.");
        }
    }
}
