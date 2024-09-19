//PJ1Ex1-14 : Le programme contient un tableau à deux dimensions avec le N° d’emplacement des consommables dans la 1ère colonne et le nombre d’unités en stock dans la 2ème. Un autre tableau contient les dénominations des consommables.
//Les tableaux sont initialisés comme suit :
//L’utilisateur entre le N° d’identifiant (1 pour l’eau plate, 2 pour le coca, …) du consommable répondant à l’invitation "Entrez le N° d’identifiant". Si le N° d’identifiant est non référencé dans les tables, le programme indique "N° non référencé" puis s’arrête. (Pour cette entrée, utilisez la fonction déjà développée). Ensuite, l’utilisateur entre le nombre d’unités consommées répondant à l’invitation "Entrez le nombre d’unités consommées pour X. Quantité actuellement en stock Y, emplacement Z" (avec X le nom du consommable, Y la quantité en stock avant la modification et Z le N° d’emplacement). Le stock s’en trouve diminué de la valeur saisie. Si le nombre saisi dépasse la quantité actuelle en stock, le programme affiche "Erreur de saisie ou de quantité en stock pour X ! Annuler ou Mettre à Zero le stock. A/Z". Pour ce faire, réutilisez la fonction checkAnswer() dévelopée pour l’exercice PJ1Ex1-13. Dans le cas où l’utilisateur n’a pas demandé la mise à zéro du stock, le programme n’impacte pas le stock et affiche le message "Modification annulée" ; en cas de remise à zéro, le stock pour ce produit est mis à 0 et le programme affiche "Stock 0 pour X". Le programme affiche, au début et à la fin du programme, un récapitulatif, ligne par ligne, avec l’identifiant, le nom de la
//index
//N°emplacement
//Unités en stock
//0
//19
//92
//1
//6
//16
//2
//14
//27
//3
//4
//72
//index
//Dénomination
//0
//Eau plate
//1
//Coca Cola
//2
//Bière pression
//3
//Café long
//Principes algorithmiques et programmation INF A – V2.23 V. Leblond
//14
//consommation, l’emplacement et la quantité en stock (en tenant compte de la modification effectuée à la fin). Pour ce faire, créez une procédure showStock(). Les tableaux peuvent être déclarés en variables globales ; dans ce cas, ils ne doivent pas être passés en paramètres à la procédure.


public class ex14 {
	public static void main()
	{

	}
}
