//PJ1Ex1-8-a L’utilisateur saisit un entier correspondant au N° de table répondant à l’invitation « Entrez le N° de table ». Le programme vérifie si le N° de table entré est correct. Si le N° est correct, le programme affiche « Vous avez entré le numéro de table X » (avec X le N° de table entré). Si le nombre est supérieur à 20 ou inférieur à 1, on affiche « Numéro de table incorrect».
//PJ1Ex1-8-b. Créez une fonction getTableNumber()qui permet de renvoyer le N° de table saisi par l’utilisateur répondant à l’invitation « Entrez le numéro de table ». La fonction vérifie si le N° de table entré est correct. Le N° doit être compris entre 1 et le N° de la dernière table qui est le NumMax passé en paramètre. Normalement, ce nombre est de 20 mais le programme doit avoir prévu une extension éventuelle de l’établissement ; c’est pourquoi le nombre 20 doit être une constante du programme. Si le nombre est supérieur au N° de table maximum ou inférieur à 1, la fonction affiche « Numéro de table incorrect, le N° doit être compris entre 1 et N° max». Si le N° de table est incorrect, la fonction doit renvoyer -1 comme code d’erreur. Prévoyez plusieurs appels de la fonction de façon à la valider en testant tous les cas de figure.

import java.util.Scanner;

public class ex08 {
	static final int CONST_MAX_TABLE = 20;
	
	public static void main()
	{
		System.out.println("Vous avez entré le numéro de table " + getTableNumber());
	}
	
	public static int getTableNumber()
	{
		return getUser_intInput("Entrez le N° de table", 1, CONST_MAX_TABLE, "Numéro de table incorrect");
	}
	
	public static int getUser_intInput(String Text, int ValMin, int ValMax, String MsgErr) 
	{
		int Saisie = 0;
		boolean SaisieValide = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(Text);

			try {
				Saisie = sc.nextInt();
				if (Saisie < ValMin || Saisie > ValMax) {	
					System.out.println(MsgErr);				
				}
				else
				{
					SaisieValide = true;
				}

			} catch (Exception e) {
				System.out.println(MsgErr);
				sc.next(); // Consomme l'entrée incorrecte
			}

		} while (!SaisieValide);

		return Saisie;
	}

}
