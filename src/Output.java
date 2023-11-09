import java.util.ArrayList;

public class Output {

    public void mainMenuOptionAdmin(){
        System.out.println("\n - Kontaktboken - \n" +
                "  1. Sök kontakt \n" +
                "  2. Lägg till kontakt \n" +
                "  3. Uppdatera kontakt \n" +
                "  4. Ta bort kontakt \n" +
                "  5. Avsluta \n"
        );
    }

    public void mainMenuOptionNotAdmin(){
        System.out.println("\n - Kontaktboken - \n" +
                "  1. Sök kontakt \n" +
                "  2. Logga in \n" +
                "  3. Avsluta \n"
        );
    }

    public void logIn(UserList users){
        System.out.println(" - Vem vill logga in? \n");
        for (int i = 0; i < users.userProfiles.size(); i++) {
            System.out.println(i + " - " + users.userProfiles.get(i).getUserName());
        }
    }

    public void password(){
        System.out.println(" - Skriv in ditt lösenord \n");
    }

    public void wrongPassword(){
        System.out.println("Du har skrivit in fel lösenord");
    }

    public void confirmLogIn(String name){
        System.out.println("Du är nu inloggad som " + name + "\n");
    }
    public void search(){
        System.out.println(" - Vilken uppgift vill du söka på? \n" +
                            "1. - Efternamn \n" +
                            "2. - Address \n" +
                            "3. - Förnamn \n" +
                            "4. - Frisökning \n"
        );
    }

    public void chooseSearchTerm(){
        System.out.println("Skriv in ditt sökord");
    }

    public void foundContact(Contact contact, ArrayList<Contact> contactProfiles){
        System.out.println("#" + contactProfiles.indexOf(contact) + " - " + contact);
    }

    public void chooseDelete(){
        System.out.println("Vilken av dessa kontakter vill du ta bort?");
    }

    public void confirmDeletion(Contact contact){
        System.out.println("Kontakten " + contact.getFirstName() + " " + contact.getSurname() + " är nu borttagen.");
    }

    public void chooseFirstName(){
        System.out.println("Skriv in kontaktens förnamn eller lämna blankt");
    }

    public void chooseSurname(){
        System.out.println("Skriv in kontaktens efternamn eller lämna blankt");
    }

    public void chooseAge(){
        System.out.println("Skriv in kontaktens ålder eller lämna blankt");
    }

    public void choosePrivatePhoneNumber(){
        System.out.println("Skriv in kontaktens privata telefonnummer eller lämna blankt");
    }

    public void chooseWorkPhoneNumber(){
        System.out.println("Skriv in kontaktens telefonnummer till arbetet eller lämna blankt");
    }

    public void chooseAdress(){
        System.out.println("Skriv in kontaktens adress eller lämna blankt");
    }

    public void confirmNewContact(Contact contact){
        System.out.println("Kontakten " + contact + " är nu tillagd i telefonboken.");
    }

    public void chooseUpdate(){
        System.out.println("Vilken kontakt vill du uppdatera?");
    }

    public void confirmUpdate(Contact contact){
        System.out.println("Kontakten " + contact + " är nu uppdaterad.");
    }

    public void noResult(){
        System.out.println("Inga sökresultat funna på den valda söktermen, kontrollera stavningen och försök igen.");
    }

    public void endProgram(){
        System.out.println("Hejdå och på återseende :) ");
    }
}
