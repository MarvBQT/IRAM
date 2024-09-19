//PJ1Ex1-17. Lors de l’élaboration du ticket de caisse, le serveur aura l’occasion de saisir des réponses aux invitations du programme telles que "Voici une question… / A pour Annuler, V pour valider, Q pour quitter le programme". Créez une fonction getUserSpecificInput(…,…) qui pose une question à l’utilisateur, et renvoie une réponse valide si elle correspond bien à la demande (A, V ou Q dans l’exemple) sans ambiguïté (donc ni "VQ" ni "AQ" ni "AVQ", …une seule lettre est attendue). Dans le cas d’une réponse non valide, le message d’erreur s’affiche "Erreur de saisie, votre choix doit être parmi XX..X, une seule lettre seulement" (XX_X est AVQ dans notre exemple) puis la question est reposée. Les possibilités de réponse ne sont pas limitées à trois, les caractères attendus doivent se trouver en paramètre (expectedAnswers) de la fonction rassemblés dans une chaine de caractères "AVQ" pour notre exemple. La fonction renvoie une chaine de caractères même si elle ne comprend qu’un seul caractère (donc soit "A", "V" ou "Q" pour l’exemple). L’appel de la fonction peut être :
//getUserSpecificInput("Voici une question / A pour Annuler, V pour valider, Q pour quitter le programme", "AVQ") ;

public class ex17 {
	public static void main()
	{

	}
}
