import java.util.Scanner;

public class TestTryCatch {
	public static void main() {
		Scanner sc = new Scanner(System.in); 
		for (;;) {
			try {
				System.out.println("Entrez le N° du consommable : ");
				int intSaisieNumConso = sc.nextInt();
				System.out.println("Valeur saisie du N° de consommable : " + intSaisieNumConso);
			} catch (Exception e) {
				System.out.println("Exception récupérée : " + e);
				sc.next(); // Pour éviter de rester bloqué après une erreur
			}
		}
		// sc.close();
	}
}