import java.util.Scanner;

public class Launcher {

    public void run() throws InterruptedException {
        while (true) {
            System.out.println(LanguageManager.INSTANCE.getLanguage());

            /**
             * TODO
             * 1) posunte kod nize, tak aby zmena jazyka probihala v LanguageManageru
             * 2) upravte kod tak, aby nacitani vstupu probihalo v InputManager
             *      - ten vytvorte, pouzijte navrhovy vzor singleton, implementujte pomoci enumu
             */
            System.out.println("zmenit jazyk?");
            Scanner sc = new Scanner(System.in);
            String nextLine = sc.nextLine();
            if (nextLine.equals("cs")) {
                LanguageManager.INSTANCE.setLanguage(Language.CESTINA);
            } else if (nextLine.equals("en")) {
                LanguageManager.INSTANCE.setLanguage(Language.ENGLISH);
            }
        }
    }
}
