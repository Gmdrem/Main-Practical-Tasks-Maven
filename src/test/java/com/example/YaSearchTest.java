package com.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YaSearchTest {

    @BeforeAll
    static void setup() {
        // Задаём размер окна
        Configuration.browserSize = "1920x1080";
        // Выбираем браузер
        Configuration.browser = "chrome";
    }

    @Test
    void searchAndCheckRedIcon() {
        open("https://ya.ru");
        // Открываем сайт
        $("textarea.search3__input.mini-suggest__input")
                .setValue("Проверка автотеста")
                .pressEnter();
        //Находим поле поиска и вводим текст
        $("path[fill='#F8604A']").shouldBe(visible);
        // Проверяем, что на обновленной странице отображается красный значок
    }
}
