//PJ1Ex1-7 L’exercice est identique à l’exercice PJ1Ex1-4 c’est-à-dire qu’il permet de calculer le prix net à partir de la TVA et du prix brut mais, cette fois, l’utilisateur entre le prix brut et le taux de TVA répondant aux invitations « Entrez le prix brut » et «Entrez le taux de TVA».
//PJ1Ex1-7-b En plus de la fonction de calcul du prix net, créez une fonction qui renvoie le prix brut et une autre qui renvoie le taux de TVA.
//PJ1Ex1-7-c Améliorez l’exercice PJ1Ex1-7-b qui consistait à calculer le prix net en fonction d’un prix brut et d’une TVA saisis par l’utilisateur. Remplacez les deux fonctions de saisie ( getUserGrossPriceInput( ) et getUserVATInput( ) ) par une seule getUser_doubleInput( )avec cette fois, le texte d’invitation (« Entrez le prix brut », « Entrez la TVA ») passé en paramètre de la fonction.

import java.util.Scanner;

public class ex07 {
	public static void main()
	{

	}
	
	public static int DemanderInt(String Texte, int ValMin, int ValMax, String MsgErrValeur, String MsgErrFormat) 
	{
		int Saisie = 0;
		boolean SaisieValide = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(Texte);

			try {
				Saisie = sc.nextInt();
				if (Saisie < ValMin || Saisie > ValMax) {	
					System.out.println(MsgErrValeur);				
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
