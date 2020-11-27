import java.util.Scanner;

public enum InputManager {
    INSTANCE;

    public String GitGudString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
