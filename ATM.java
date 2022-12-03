package org.example;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank theBank = new Bank("Bank of Drausin");

        User aUser = theBank.addUser("John", "Doe", "1234");

        Account newAccount = new Account("Cheking", aUser,theBank );
        aUser.addAccount(newAccount);
        theBank.addAccount(newAccount);
        theBank.addAccount(newAccount);

        User curUser;
        while (true) {
            curUser = ATM.mainMenuPrompt(theBank, sc);

            ATM.printUserMenu(curUser,sc);
        }

    }

    public static User mainMenuPrompt(Bank theBank, Scanner sc) {

        String userID;
        String pin;
        User authUser;

        do {

            System.out.printf("\n\nWelcome to %s\n\n");

        } while();

        }
    }
}