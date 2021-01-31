package toolsqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class Config {

    public static final String SITE = "https://demoqa.com/automation-practice-form";
    public static final String FIRST_NAME = "Sergey";
    public static final String LAST_NAME = "Lukichev";
    public static final String EMAIL = "Lukichev_s@mail.ru";
    public static final String PHONE_NUMBER = "89139139150";
    public static final String ADDRESS = "Novosibirsk";
    public static final String IMAGE = "src/test/java/toolsqa/img/logo.jpg";
    public static final String STATE = "Haryana";
    public static final String CITY = "Panipat";


    @BeforeAll
    public static void setUp() {
        Configuration.startMaximized = true;
    }

}
