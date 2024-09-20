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
*/

public class ex04 {
	public static void main()
	{
		// PJ1Ex1-4-a
		PrintPrixNet(100, 21);
		PrintPrixNet(125.5, 21);
		
		// PJ1Ex1-4-b
		PrintPrixNet(100, 6);
		PrintPrixNet(125.5, 21);
		
        // PJ1Ex1-4-c
		PrintPrixNet(100, 6);
		PrintPrixNet(125.5, 21);
	}
	
	private static void PrintPrixNet(double PrixBrute, double TVA)
	{	
		Print(PrixBrute, PrixNet(PrixBrute, MontantTVA(PrixBrute, TVA) , 0));
	}
	
	private static void Print(double PrixBrute, double PrixNet)
	{
		System.out.println("Pour un prix brut de " + PrixBrute + " €, le prix net est de " + PrixNet + " €");
	}
	
	private static double PrixNet(double PrixBrute, double Taxes, double Reductions)
	{
		return PrixBrute + Taxes - Reductions;
	}
	
	private static double MontantTVA(double PrixBrute, double Taux)
	{
		return PrixBrute * (Taux / 100);
	}
	
}
