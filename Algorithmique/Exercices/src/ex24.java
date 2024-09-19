//PJ1Ex24. Le but de cet exercice est de récupérer toute la commande d’une table dans un ArrayList. Le serveur a, sous forme de tableau imprimé à côté de l’ordinateur, la liste de tous les consommables avec leur N° identifiant. Il entre le N° de la consommation par son N° d’identifiant répondant à l’invitation "Entrez le N° de consommable ou Q(Quitter) ". Il précise ensuite la quantité de consommations pour ce type de consommation en répondant à l’invitation du programme "Nombre de consommations pour X ? /A(Annuler) /Q (Quitter)" X étant le nom de la consommation dont il vient de saisir le N° d’identifiant. Après une consommation, le serveur a le droit de valider la commande et le message d’invitation devient : "Entrez le N° de consommable ou Q(Quitter) V (Valider le ticket) ". Ces opérations d’encodage se succèdent jusqu’au moment où le serveur valide le ticket en entrant la lettre V (majuscule ou minuscule). Le but est de créer une procédure getOrder(…) dont la signature est la suivante :
//public static void getOrder(ArrayList<int[]> ord) { }
//et qui va modifier le contenu de l’ArrayList vierge passé en paramètre. Il s’agit d’un ArrayList de tableaux à une dimension et à 2 cases () contenant, dans la 1ère case, l’index de la consommation (à 1 unité près étant donné que la consommation N°1 porte l’index 0 dans les tables de prix et de consommation) et, dans la deuxième, le nombre de consommations.
//Principes algorithmiques et programmation INF A – V2.23 V. Leblond
//18
//La commande est donc saisie dans un tableau dynamique (ArrayList) et non dans un tableau de taille figée comme c’était le cas pour l’exercice PJ1 EX19.

public class ex24 {
	public static void main()
	{

	}
}
