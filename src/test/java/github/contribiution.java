package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class contribiution {
    @Test
    void contr() {
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(byText("Contributors")).closest(".BorderGrid-cell").$$("ul li").first().hover();
        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));
        sleep(5000);

    }
}
