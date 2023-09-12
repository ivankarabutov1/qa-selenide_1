package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        open("https://github.com/");
        $(".header-search-button").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("div.Box-sc-g0xbh4-0 div").get(30).click();
        sleep(5000);
    }

}
