
//skriv med en kommentar med typ:
//"här går det att lägga in en framtida metod för att lägga in fler användare"

import java.util.ArrayList;

public final class UserList extends ArrayList { //singleton, ingen annan klass ska ärva

    private static UserList userList;
    ArrayList<User> userProfiles = new ArrayList<>();

    private UserList(){
        userProfiles.add(
                new User.UserBuilder().userName("Admin").userPassword("admin").userIsAdmin(true).newUser());
    }

    public static UserList getUserList(){
        if (userList == null){
            userList = new UserList();
        }
        return userList;
    }
}
