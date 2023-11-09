public class User {

    private String userName;
    private String password;
    private boolean isAdmin;

    private User(UserBuilder newUser){
        this.userName = newUser.userName;
        this.password = newUser.password;
        this.isAdmin = newUser.isAdmin;
    }

    public static class UserBuilder{
        private String userName;
        private String password;
        private boolean isAdmin;


        public UserBuilder userName(String name){
            this.userName = name;
            return this;
        }

        public UserBuilder userPassword(String password){
            this.password = password;
            return this;
        }

        public UserBuilder userIsAdmin(boolean isAdmin){
            this.isAdmin = isAdmin;
            return this;
        }

        public User newUser(){
            return new User(this);
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
