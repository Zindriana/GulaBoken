public class Contact {

    private String firstName;
    private String surname;
    private int age;
    private String privatePhoneNumber;
    private String workPhoneNumber;
    private String adress;


    private Contact(ContactBuilder newContact){
        this.firstName = newContact.firstName;
        this.surname = newContact.surname;
        this.age = newContact.age;
        this.privatePhoneNumber = newContact.privatePhoneNumber;
        this.adress = newContact.adress;
    }

    public static class ContactBuilder{
        private String firstName;
        private String surname;
        private int age;
        private String privatePhoneNumber;
        private String workPhoneNumber;
        private String adress;


        public ContactBuilder contactFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder contactSurname(String surname){
            this.surname = surname;
            return this;
        }

        public ContactBuilder contactAge(int age){
            this.age = age;
            return this;
        }

        public ContactBuilder contactPrivatePhoneNumber(String phoneNumber){
            this.privatePhoneNumber = phoneNumber;
            return this;
        }

        public ContactBuilder contactWorkPhoneNumber(String phoneNumber){
            this.workPhoneNumber = phoneNumber;
            return this;
        }

        public ContactBuilder contactAdress(String adress){
            this.adress = adress;
            return this;
        }

        public Contact newContact(){
            return new Contact(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getPrivatePhoneNumber() {
        return privatePhoneNumber;
    }

    public void setPrivatePhoneNumber(String privatePhoneNumber) {
        this.privatePhoneNumber = privatePhoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @Override
    public String toString() {
        return
                "Förnamn: '" + firstName + '\'' +
                ", Efternamn: '" + surname + '\'' +
                ", Ålder: " + age +
                ", Telefonnummer: '" + privatePhoneNumber + '\'' +
                ", Arbetsnummer: '" + workPhoneNumber +'\n' +
                ", Adress: '" + adress + '\'';
    }
}
