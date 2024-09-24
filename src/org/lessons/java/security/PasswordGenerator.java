package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	/* salvare in opportune variabili il:
	  - nome, 
	  - cognome, 
	  - colore preferito,
	  - data di nascita di un utente suddivisa in giorno, mese e anno in numero
	  
	 generare (e stampare a video) una password  concatenando:
	 nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
	 */
	public static void main(String[] args){
		
		//Creo le variabili alle quali devo assegnare poi l'input dell'utente
		String nome;
		String cognome;
		String colore;
		int giorno;
		int mese;
		int anno;
		Scanner scan = new Scanner(System.in);
		
		//Creo un messaggio di Output come Titolo
		System.out.println("Benvenuto nel generatore di Password");
		
		//Chiedo all'utente di inserire i dati e li assegno alle variabili
		System.out.println("Inserisci il tuo nome: ");
		nome = scan.next();
		
		System.out.println("Inserisci il tuo cognome: ");
		cognome = scan.next();
		
		System.out.println("Inserisci il tuo colore preferito: ");
		colore = scan.next();
		
		System.out.println("Inserisci il tuo giorno di nascita: ");
		giorno = scan.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita: ");
		mese = scan.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita: ");
		anno = scan.nextInt();
		
		//Dichiariamo una variabile per la password
		String password = nome + "-" + cognome + "-" + colore + "-" + (giorno+mese+anno);
		
		//Stampiamo la password con anche la formattazione
		System.out.println(String.format("La tua password è %s", password));
		
		/**/
	}
}
