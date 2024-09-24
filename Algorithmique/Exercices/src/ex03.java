//PJ1Ex1-3 Le programme calcule et affiche le prix total pour un type de consommation en fonction du nombre d’unités et du prix unitaire. 
//Le nombre d’unités et le prix unitaire sont d’abord initialisés à des valeurs nulles pour ensuite être affectés à des valeurs quelconques.

public class ex03 {
	public static void main()
	{
		int intQuantitConso=0; //quantité de consommations commandées
		double dblPrixUnitaire=0.0; //prix unitaire de la consommation
		double dblPrixTotParConso=0.0 ;//prix total par type de consommation
		intQuantitConso = 3;
		dblPrixUnitaire = 2.5;
		dblPrixUnitaire = 10/4;
		dblPrixUnitaire = 10/4.0;
		dblPrixTotParConso = dblPrixUnitaire * intQuantitConso;
		System.out.print("Prix total pour cette consommation: " + dblPrixTotParConso + "€");
	}
}



