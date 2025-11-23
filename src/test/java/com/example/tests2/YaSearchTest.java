package com.example.tests2;
import com.codeborne.selenide.Configuration; //Настройки Selenide
import com.example.pages.YaMainPage; //Наш Page Object главной страницы
import org.junit.jupiter.api.BeforeAll; //Аннотации JUnit 5
import org.junit.jupiter.api.Test;

public class YaSearchTest {
    @BeforeAll
    static void setup() {
        Configuration.browser = "chrome"; //Определяем браузер
        Configuration.browserSize = "1920x1080"; //Определяем размер окна
    }
    @Test
    void searchAndCheckRedIcon() {
        new YaMainPage() //Создаёт Page Object главной страницы.
                .open() //Открываем сайт, указанный в YaMainPage
                .search("Проверка автотеста")       // PageObject метод из YaMainPage
                .waitForRedIcon();                  // Проверка + явное ожидание
    } //С главной страницы перешли на страницу результатов и проверяем наличие значка
} //Этот класс, который использует созданные Page Object

