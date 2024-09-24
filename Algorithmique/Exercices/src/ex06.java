
//PJ1Ex1-6-a L’exercice est identique au précédent c’est-à-dire qu’il permet d’afficher le coût de la TVA à partir d’un prix net mais, cette fois, l’utilisateur entre le prix net au clavier répondant à l’invitation « Entrez le prix net ».
//PJ1Ex1-6-b Améliorez l’exercice précédent en créant une première fonction de calcul du coût de la TVA calculCoutTVA (déjà réalisée au 5c), et une deuxième getUserNetPriceInput( ) qui renvoie la saisie de l’utilisateur (le prix Net) au format réel double précision.
import java.util.Scanner;

public class ex06 {
	public static void main() {
		double PrixNet = DemanderPrixNet(0, Double.MAX_VALUE);
		double TauxTVA = DemanderTauxTVA(0, 21);
		ex05.AfficherTVA(PrixNet, TauxTVA, ex05.CoutTVA(PrixNet, TauxTVA));
	}

	public static double DemanderPrixNet(double ValMin, double ValMax) {
		return DemanderDouble("Entrez le prix net", ValMin, ValMax, "Valeur incorrecte. La valeur saisie doit être comprise entre " + ValMin + " et " + ValMax + ".", "Valeur incorrecte. Veuillez entrer un nombre réel.");
	}

	public static double DemanderPrixBrut(double ValMin, double ValMax) {
		return DemanderDouble("Entrez le prix brut", ValMin, ValMax, "Valeur incorrecte. La valeur saisie doit être comprise entre " + ValMin + " et " + ValMax + ".", "Valeur incorrecte. Veuillez entrer un nombre réel.");
	}

	public static double DemanderTauxTVA(double ValMin, double ValMax) {
		return DemanderDouble("Entrez le taux de la TVA", ValMin, ValMax, "Valeur incorrecte. La valeur saisie doit être comprise entre " + ValMin + " et " + ValMax + ".", "Valeur incorrecte. Veuillez entrer un nombre réel.");
	}

	public static double DemanderDouble(String Texte, double ValMin, double ValMax, String MsgErrFiltre, String MsgErrFormat) { // Gérer msg erreur
		double Saisie = 0;
		boolean SaisieValide = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(Texte);

			try {
				Saisie = sc.nextDouble();
				if (Saisie < ValMin || Saisie > ValMax) {	
					System.out.println(MsgErrFiltre);				
				}
				else
				{
					SaisieValide = true;
				}

			} catch (Exception e) {
				System.out.println(MsgErrFormat);
				sc.next(); // Consomme l'entrée incorrecte
			}

		} while (!SaisieValide);

		return Saisie;
	}
}
