//PJ1Ex1-9 Créez une fonction getAndCheckTableNumber()qui permet de renvoyer le N° de table saisi par l’utilisateur répondant à l’invitation « Entrez le numéro de table ».
// La fonction vérifie si le N° de table entré est correct. 
// La différence avec l’exercice précédent réside dans le fait que le message d’erreur doit être spécifique à l’erreur de saisie : si le N° est inférieur à 1, le programme affiche « Saisie incorrecte ! 
// Le N° de table doit être supérieur ou égal à 1 », si le nombre est supérieur à 20 (constante du programme), on affiche « Saisie incorrecte ! Le N° table le plus élevé est NumMax. Contactez l’administrateur du programme si vous souhaitez augmenter ce nombre », si le N° est correct, le programme main() affiche « Vous avez entré le numéro de table X » avec X le N° de table entré. Si le N° de table est incorrect, la fonction doit renvoyer -1 comme code d’erreur.

public class ex09 {
	public static void main()
	{
		getAndCheckTableNumber();
	}
	public static int getAndCheckTableNumber()
	{
		String MsgErr =  "Saisie incorrecte, le numéro de table doit être compris entre 1 et " + ex08.CONST_MAX_TABLE + ".\nContactez l’administrateur du programme si vous souhaitez augmenter ce nombre.";
		return ex08.getUser_intInput("Entrez le N° de table", 1, ex08.CONST_MAX_TABLE, MsgErr);
	}
}
