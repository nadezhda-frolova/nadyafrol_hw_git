import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class NewTest {
    @Test
    void newTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
        System.out.println("внесены изменения для имитации конфликта");
    }
}
