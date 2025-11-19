package com.example.pages;
import com.codeborne.selenide.SelenideElement; //Объект Selenide, представляющий HTML-элемент
import static com.codeborne.selenide.Selenide.$; //Метод для поиска элемента по CSS-селектору
public class YaMainPage {
    private final SelenideElement searchInput =
            $("textarea.search3__input.mini-suggest__input"); // Поле поиска как Page Element

    public YaMainPage open() {
        com.codeborne.selenide.Selenide.open("https://ya.ru");
        return this; //Возвращает сам объект страницы
    }
    public YaSearchResultsPage search(String text) {
        searchInput.shouldBe(com.codeborne.selenide.Condition.visible) // Явное ожидание
                .setValue(text) //Ввод строки
                .pressEnter(); //Имитация нажатия Enter
        return new YaSearchResultsPage(); // После поиска попадает на страницу результатов, возвращаем Page Object
    }
}
