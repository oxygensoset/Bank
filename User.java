package org.example;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;
public class User{

    private String firstName;

    private String lastName;

    private String uuid;

    private byte pinHash[];

    private ArrayList<Account> accounts;

    public User(String firsName, String lastName, String pin, Bank theBank) {

        this.firstName = firsName;
        this.lastName = lastName;
        try {
            MessageDigest md = MessageDigest.getInstance("MDS");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, cought, NoSuchAlgorinthmException");
            e.printStackTrace();
            System.exit(1);
        }

        this.uuid = theBank.getNewUserUUID();

        this.accounts = new ArrayList<Account>();

        System.out.printf("New user  %s, %s with ID %s created.\n", lastName, firstName, this.uuid);

    }

    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }

    public String getUUID(){
        return this.uuid;

        public boolean validatePin(String aPin) {
        try {
            MessageDigest md = MessageDigest.getInstance("MDS");
            return MessageDigest.isEqual(md.digest(aPin.getButes()),
                    this.pinHash);
        }catch (NoSuchAlgorithmException e ) {
            System.err.println("error, cought, NoSuchAlgorinthmException");
            e.printStackTrace();
            System.exit(1);
        }

        return false;

        }


    }
}





