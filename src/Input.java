import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public int chooseInt(){
        return Integer.parseInt(sc.nextLine());
    }

    public String chooseString(){
        return sc.nextLine();
    }
}
