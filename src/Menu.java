public class Menu {

    private Output out = new Output();
    private Input inp = new Input();
    private LogIn log = new LogIn();
    
    private User loggedIn;

    UserList userList = UserList.getUserList();
    ContactList contactList = ContactList.getContactList();

    public void mainMenu() {
        if (loggedIn != null && loggedIn.isAdmin()) {
            out.mainMenuOptionAdmin();
            int chosenOption = inp.chooseInt();
            switch (chosenOption) {
                case 1:
                    contactList.search();
                    mainMenu();
                    break;
                case 2:
                    contactList.addContact();
                    mainMenu();
                    break;
                case 3:
                    contactList.updateContact();
                    mainMenu();
                    break;
                case 4:
                    contactList.deleteContact();
                    mainMenu();
                    break;
                case 5:
                    out.endProgram();
                    break;
                default: mainMenu();
            }
        } else {
            out.mainMenuOptionNotAdmin();
            int chosenOption = inp.chooseInt();
            switch (chosenOption) {
                case 1:
                    contactList.search();
                    mainMenu();
                    break;
                case 2: loggedIn = log.logIn(userList);
                        mainMenu();
                    break;
                case 3:
                    out.endProgram();
                    break;
                default: mainMenu();
            }
        }
    }
}
