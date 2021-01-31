package toolsqa;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTest extends Config {


    @Test
    void PracticeFormTest() {
        open(SITE);
        $x("//div[@class='main-header']").shouldHave(text("Practice Form"));

        $("#firstName").setValue(FIRST_NAME);
        $("#lastName").setValue(LAST_NAME);
        $("#userEmail").setValue(EMAIL);
        $("[for='gender-radio-1']").click();
        $x("//input[@id='userNumber']").setValue(PHONE_NUMBER);
        $("#dateOfBirthInput").click();
        $$(".react-datepicker__day").find(exactText("10")).click();
        $("#subjectsInput").setValue("Subjects");
        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-2']").click();
        $("[for='hobbies-checkbox-3']").click();
        $x("//input[@id='uploadPicture']").uploadFile(new File(IMAGE));
        $x("//textarea[@id='currentAddress']").setValue(ADDRESS);
        $x("//div[@id='state']").click();
        $(byText(STATE)).click();
        $x("//div[@id='city']").click();
        $(byText(CITY)).click();

        $x("//button[@id='submit']").click();

        $x("//table//tr[1]//td[2]").shouldHave(text(FIRST_NAME + " " + LAST_NAME));
    }
}
