package com.example.pages;
import com.codeborne.selenide.SelenideElement; //Объект Selenide, представляющий HTML-элемент
import static com.codeborne.selenide.Selenide.$; //Метод для поиска элемента по CSS-селектору

public class YaSearchResultsPage {
    private final SelenideElement redIcon = $("path[fill='#F8604A']");  // Красный значок #F8604A

    public YaSearchResultsPage waitForRedIcon() {
        redIcon.shouldBe(com.codeborne.selenide.Condition.visible); // Явное ожидание
        return this; //Ждем появления красного значка на странице и возвращаем объект
    }
}
