/*
PJ1Ex1-4-a :
Le programme calcule le montant du prix net à partir d’un prix brut donné et de la TVA (fixée à 21%). 
Le programme affiche. « Pour un prix brut xxx €, le prix net est de yyy € ». 
Le programme doit réaliser le calcul pour un prix brut de 100€ et aussi pour un prix brut de 125.5€. 
Pour information, le prix net est le prix brut auquel on a ajouté toutes les taxes et enlevé toutes les réductions éventuelles.

PJ1Ex1-4-b :
Le programme calcule le montant du prix net à partir d’un prix brut donné et de la TVA qui, cette fois, n’est pas forcément 21%. 
En utilisant une procédure avec paramètres, le programme affiche : « Pour un prix brut de xxx €, le prix net est de yyy € ». 
Pour le test du programme, appelez votre procédure au moins deux fois, une première fois pour un prix brut de 100€ et une TVA à 6%, une deuxième fois pour un prix brut de 125.5€ et une TVA à 21%.

PJ1Ex1-4-c :
Le programme calcule le montant du prix net à partir d’un prix brut donné et de la TVA qui, cette fois, n’est pas forcément 21%. 
En utilisant une fonction avec paramètres qui calcule le prix net, le programme affiche : « Pour un prix brut de xxx €, le prix net est de yyy € ». 
Pour le test du programme, appelez votre fonction au moins deux fois, une première fois pour un prix brut de 100€ et une TVA à 6%, une deuxième fois pour un prix brut de 125,5€ et une TVA à 21%.

PrixNet = PrixTVAC
PrixBrut = PrixHTVA

*/

public class ex04 {
	public static void main()
	{
        // PJ1Ex1-4-c
		AfficherPrixNet(100, 6, 0);
		AfficherPrixNet(125.5, 21, 0);
		AfficherPrixNet(100, 21, 0);		
	}
	
	private static void AfficherPrixNet(double PrixBrut, double TVA, double Reductions)
	{	
		AfficherPrix(PrixBrut, calculPrixNet(PrixBrut, calculMontantTVA(PrixBrut, TVA) , Reductions));
	}
	
	public static void AfficherPrix(double PrixBrut, double PrixNet)
	{
		System.out.println("Pour un prix brut (HTVA) de " + PrixBrut + " €, le prix net (TVAC) est de " + PrixNet + " €");
	}
	
	public static double calculPrixNet(double PrixBrut, double Taxes, double Reductions)
	{
		return PrixBrut + Taxes - Reductions;
	}
	
	public static double calculMontantTVA(double PrixBrut, double Taux)
	{
		return PrixBrut * (Taux / 100);
	}
	
}
