package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // creo una variabile per lo scanner
        Scanner scan = new Scanner(System.in);

        // chiedo all'utente il nome
        System.out.println("Inserisci il tuo nome:");
        String userName = scan.nextLine();

        // chiedo all'utente il cognome
        System.out.println("Inserisci il tuo cognome:");
        String userLastName = scan.nextLine();

        // chiedo all'utente il suo colore preferito
        System.out.println("Inserisci il tuo colore preferito:");
        String userColor = scan.nextLine();

        // chiedo all'utente la sua data di nascita

        // giorno
        System.out.println("In che giorno sei nato?");
        int userDayOfBirth = scan.nextInt();

        // mese
        System.out.println("In che mese sei nato? (numero)");
        int userMonthOfBirth = scan.nextInt();

        // anno
        System.out.println("In che anno sei nato?");
        int userYearOfBirth = scan.nextInt();

        // data completa
        String userDateOfBirth = userDayOfBirth + "/" + userMonthOfBirth + "/" + userYearOfBirth;

        // stampo in console le info dell'utente
        System.out.println("Nome: " + userName);
        System.out.println("Cognome: " + userLastName);
        System.out.println("Colore preferito: " + userColor);
        System.out.println("Data di nascita: " + userDateOfBirth);

        // chiudo lo scanner
        scan.close();
    }
}
