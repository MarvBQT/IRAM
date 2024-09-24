
//PJ1Ex1-6-a L’exercice est identique au précédent c’est-à-dire qu’il permet d’afficher le coût de la TVA à partir d’un prix net mais, cette fois, l’utilisateur entre le prix net au clavier répondant à l’invitation « Entrez le prix net ».
//PJ1Ex1-6-b Améliorez l’exercice précédent en créant une première fonction de calcul du coût de la TVA calculCoutTVA (déjà réalisée au 5c), et une deuxième getUserNetPriceInput( ) qui renvoie la saisie de l’utilisateur (le prix Net) au format réel double précision.
import java.util.Scanner;

public class ex06 {
	public static void main() {
		double PrixNet = getUserNetPriceInput(0, Double.MAX_VALUE);
		double TauxTVA = getUserVATInput(0, 21);
		ex05.AfficherTVA(PrixNet, TauxTVA, ex05.calculCoutTVA(PrixNet, TauxTVA));
	}

	public static double getUserNetPriceInput(double ValMin, double ValMax) {
		return getUser_doubleInput("Entrez le prix net", ValMin, ValMax, "Prix incorrecte. Le prix doit être un nombre réel compris entre " + ValMin + " et " + ValMax + ".");
	}

	public static double getUserGrossPriceInput(double ValMin, double ValMax) {
		return getUser_doubleInput("Entrez le prix brut", ValMin, ValMax, "Valeur incorrecte. La valeur saisie doit être un nombre réel compris entre " + ValMin + " et " + ValMax + ".");
	}

	public static double getUserVATInput(double ValMin, double ValMax) {
		return getUser_doubleInput("Entrez le taux de TVA", ValMin, ValMax, "Valeur incorrecte. La valeur saisie doit être un nombre réel compris entre " + ValMin + " et " + ValMax + ".");
	}

	public static double getUser_doubleInput(String Text, double ValMin, double ValMax, String MsgErr) { 
		double Saisie = 0;
		boolean SaisieValide = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(Text);

			try {
				Saisie = sc.nextDouble();
				if (Saisie < ValMin || Saisie > ValMax) {	
					System.out.println(MsgErr);				
				}
				else
				{
					SaisieValide = true;
				}

			} catch (Exception e) {
				System.out.println(MsgErr);
				sc.next(); // Consomme l'entrée incorrecte
			}

		} while (!SaisieValide);

		return Saisie;
	}
}
