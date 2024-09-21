//PJ1Ex1-5-a : Le programme calcule le montant de la TVA à partir d’un prix net (prix net = prix TVAC avec un taux de TVA fixé à 21%). Le programme affiche. « Pour un net de xxx €, le coût de la TVA s’élève à yyy € ». Une analyse préalable au pseudocode est nécessaire !
//PJ1Ex1-5-b : Créez une procédure qui calcule et affiche le montant de la TVA à partir d’un prix net et un taux de TVA variables. Prendre 121€ et 21,0 %, 85,5€ et 12.5% pour les essais. Le programme affiche : « Pour un prix net de x € et une TVA de y %, le coût de la TVA s’élève à z € ».
//PJ1Ex1-5-c : Créez une fonction qui calcule le montant de la TVA à partir d’un prix net et un taux de TVA variables. Prendre 121€ et 21,0 %, 85,5€ et 12.5% pour les essais. Le programme affiche : « Pour un prix net de x € et une TVA de y %, le coût de la TVA s’élève à z € ».

// PrixNet = PrixTVAC
// PrixBrute = PrixHTVA

public class ex05 {
	public static void main()
	{
		//PJ1Ex1-5-a : 
		double PrixNet = 121;
		PrintCoutTVA(PrixNet, MontantTVA(PrixNet, 21));
	}

	private static double MontantTVA(double PrixNet, double TauxTVA)
	{
		return PrixNet - PrixBrut(PrixNet, TauxTVA);
	}
	
	private static double PrixBrut(double PrixNet, double TauxTVA)
	{
		return PrixNet / (1 + TauxTVA / 100);
	}
	
	private static void PrintCoutTVA(double PrixNet, double MontantTva)
	{
		System.out.println("Pour un net (TVAC) de " + PrixNet + " €, le coût de la TVA s’élève à " + MontantTva + " €");
	}
	
	private static void Print(double PrixNet, double TauxTVA, double CoutTva)
	{
		System.out.println("Pour un prix net (TVAC) de " + PrixNet + " € et une TVA de " + TauxTVA + " %, le coût de la TVA s’élève à " + CoutTva + " €");
	}
}
// b: Prendre 121€ et 21,0 %, 85,5€ et 12.5% pour les essais.

// c: Prendre 121€ et 21,0 %, 85,5€ et 12.5% pour les essais. Le programme affiche : « Pour un prix net de x € et une TVA de y %, le coût de la TVA s’élève à z € ».
