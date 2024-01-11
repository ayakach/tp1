import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la moyenne de l'étudiant :");
        double moyenne = scanner.nextDouble();

        if (moyenne >= 16) {
            System.out.println("Mention : Très Bien");
        } else if (moyenne >= 14 && moyenne < 16) {
            System.out.println("Mention : Bien");
        } else if (moyenne >= 12 && moyenne < 14) {
            System.out.println("Mention : Assez Bien");
        } else if (moyenne >= 10 && moyenne < 12) {
            System.out.println("Mention : Passable");
        } else {
            System.out.println("Mention : Insuffisant");
        }


    }
}
