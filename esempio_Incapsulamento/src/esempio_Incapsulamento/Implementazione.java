package esempio_Incapsulamento;

import java.util.Scanner;

public class Implementazione 
{
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		Anagrafica anagrafica = new Anagrafica();
		
		System.out.println("Inserisci il nome: ");
		anagrafica.setNome(scanner.nextLine());
	    
	    System.out.println("Inserisci l'anno di nascita: ");
		anagrafica.setAnnoDiNascita(scanner.nextInt());
		
		System.out.println("Il signor " + anagrafica.getNome() + " è nato nel " + anagrafica.getAnnoDiNascita());

	}

}
