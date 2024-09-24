//PJ1Ex1-10 Le programme calcule le prix net à partir de la TVA et du prix brut saisis par l’utilisateur. Le taux de TVA est choisi par l’utilisateur répondant à l’invitation "Pour un taux de TVA de 6% tapez 1, 2 pour 12% et 3 pour 21%". On affiche alors le texte : "Pour un prix brut de X €, le prix net est de Y € (TVA Z%)". Si l’entrée de l’utilisateur n’est pas dans les choix possibles, le programme s’arrête en indiquant « Saisie du taux incorrecte » et le prix brut n’est pas demandé. Utilisez les fonctions déjà développées pour récupérer le prix brut et calculer le prix net. Ajoutez une fonction getVATChoice() qui renvoie le taux de TVA choisi en %, -1.0 en cas de choix incorrect. Prévoyez tous les tests qui permettent de valider les fonctionnalités.

public class ex10 {
	public static void main()
	{
		double PrixBrut = ex06.getUserGrossPriceInput(0, Double.MAX_VALUE);
		double TauxTVA = getVATChoice();
		double PrixNet = ex04.calculPrixNet(PrixBrut, ex04.calculMontantTVA(PrixBrut, TauxTVA) , 0);
		AfficherPrix(PrixBrut, PrixNet, TauxTVA);
	}
	
	public static double getVATChoice() 
	{
		double[] TVA = {6.0, 12.0, 21.0}; 
		int Choix = Menu("Taux de TVA :",  new String[] {TVA[0] + "%", TVA[1] + "%", TVA[2] + "%"});
		return TVA[Choix];	
		
	}
	
	public static int Menu(String Texte, String[] Options)
	{
		System.out.println(Texte);
		
        for (int i = 0; i < Options.length; i++) {
            System.out.println((i+1) + " - " + Options[i]);
        }
		
		return ex08.getUser_intInput("Choix: ", 1, Options.length, "La saisie doit être un nombre entier compris entre 1 et " + Options.length + ".") - 1;
	}
	
	public static void AfficherPrix(double PrixBrut, double PrixNet, double TauxTVA)
	{
		System.out.println("Pour un prix brut de " + PrixBrut + " €, le prix net est de " + PrixNet + " € (TVA " + TauxTVA + "%)");
	}
}
