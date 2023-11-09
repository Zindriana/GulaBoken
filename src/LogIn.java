import java.util.ArrayList;

public class LogIn {

    private Output out = new Output();

    private Input inp = new Input();

    public User logIn(UserList users){
        out.logIn(users);
        int chosenUser = inp.chooseInt();
        out.password();
        String loggedPassword = inp.chooseString();
        String password = users.userProfiles.get(chosenUser).getPassword();
        User user = null;
        if (loggedPassword.equals(password)){
            out.confirmLogIn(users.userProfiles.get(chosenUser).getUserName());
            user = users.userProfiles.get(chosenUser);
        } else {
            out.wrongPassword();
        }
        return user;
    }
}
