package com.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexSearchTest {

    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080"; //Разрешение вкладки браузера
        Configuration.browser = "chrome"; //Браузер
    }

    @Test
    void searchAndCheckRedIcon() {
        open("https://yandex.ru");
        // Открываем сайт
        $("input.input__control.mini-suggest__input")
                .shouldBe(visible)
                .setValue("Проверка автотеста");
        //Находим поле поиска и вводим текст
        $("button.arrow__button").click();
        // Нажимаем кнопку "Найти"
        $("path[fill='#F8604A']").shouldBe(visible);
        //Проверяем появление красного значка
    }
}
