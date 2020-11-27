import java.util.Scanner;

public enum LanguageManager {
    INSTANCE;

    private Language language;

    public Language getLanguage() {
        System.out.println("zmenit jazyk?");
        String input = InputManager.INSTANCE.GitGudString();
        if (input.equals("cs")) {
            LanguageManager.INSTANCE.setLanguage(Language.CESTINA);
        } else if (input.equals("en")) {
            LanguageManager.INSTANCE.setLanguage(Language.ENGLISH);
        }

        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
