package esempio_Classe;

import java.util.Scanner;

public class Implementazione {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);		
		Anagrafica anagrafica = new Anagrafica();
		
		System.out.println("Inserisci il nome: ");
		anagrafica.nome = scanner.nextLine();		
		
		System.out.println("Inserisci l'anno di nascita: ");
		anagrafica.annoDiNascita = scanner.nextInt();
		
		System.out.println("Il signor " + anagrafica.nome + " è nato nel " + anagrafica.annoDiNascita);

	}

}
