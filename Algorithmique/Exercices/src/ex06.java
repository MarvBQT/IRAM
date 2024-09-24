//PJ1Ex1-6-a L’exercice est identique au précédent c’est-à-dire qu’il permet d’afficher le coût de la TVA à partir d’un prix net mais, cette fois, l’utilisateur entre le prix net au clavier répondant à l’invitation « Entrez le prix net ».
//PJ1Ex1-6-b Améliorez l’exercice précédent en créant une première fonction de calcul du coût de la TVA calculCoutTVA (déjà réalisée au 5c), et une deuxième getUserNetPriceInput( ) qui renvoie la saisie de l’utilisateur (le prix Net) au format réel double précision.
import java.util.Scanner;

public class ex06 {
	public static void main()
	{
		
		

		
	}
	
	public static double DemanderPrixNet()
	{
		return 0;
	}
		
	public static double DemanderPrixBrut()
	{
		return 0;
	}
	
	public static double DemanderTauxTVA()
	{
		return 0;
	}
	
	public static double DemanderDouble(String Texte, double ValMin, double ValMax)
	{
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(Texte);
			double Saisie = sc.nextDouble();
			return Saisie;
		} catch (Exception e) {
			System.out.println("Exception récupérée : " + e);
			sc.next(); // Pour éviter de rester bloqué après une erreur
		}
		
		sc.close();
		
		return 0;
	}
	
}
