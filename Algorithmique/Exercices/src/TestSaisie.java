import java.util.Scanner;  // Importation de la classe Scanner pour lire les entrées utilisateur.

public class TestSaisie {
    public static void main() {  // Déclaration de la méthode principale.
        // Déclaration des variables pour stocker les différentes saisies de l'utilisateur.
        int intSaisieUtilisateur;  // Variable pour stocker un entier.
        byte bytSaiseUtilisateur;  // Variable pour stocker un byte.
        double dblSaisieUtilisateur;  // Variable pour stocker un nombre à virgule flottante (double).

        // Initialisation d'un objet Scanner pour lire les données depuis l'entrée standard (le clavier).
        Scanner sc = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un entier.
        System.out.println("Entrez un nombre entier");

        // Lecture de l'entier saisi par l'utilisateur.
        intSaisieUtilisateur = sc.nextInt();

        // Affichage de l'entier saisi par l'utilisateur.
        System.out.println("Le nombre entier saisi est " + intSaisieUtilisateur);

        // Demande à l'utilisateur de saisir un byte.
        System.out.println("Entrez un byte");

        // Lecture du byte saisi par l'utilisateur.
        bytSaiseUtilisateur = sc.nextByte();

        // Affichage du byte saisi par l'utilisateur.
        System.out.println("Le byte saisi est " + bytSaiseUtilisateur);

        // Demande à l'utilisateur de saisir un nombre réel (double).
        System.out.println("Entrez un nombre réel");

        // Lecture du nombre réel saisi par l'utilisateur.
        dblSaisieUtilisateur = sc.nextDouble();

        // Affichage du nombre réel saisi par l'utilisateur.
        System.out.print("Le réel saisi est " + dblSaisieUtilisateur);

        // Fermeture de l'objet Scanner pour libérer les ressources.
        sc.close();
    }
}
