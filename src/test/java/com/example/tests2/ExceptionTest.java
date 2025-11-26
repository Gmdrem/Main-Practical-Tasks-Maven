package com.example.tests2;
import org.junit.jupiter.api.Assertions; //Класс из библиотеки JUnit 5
import org.junit.jupiter.api.Test; //Аннотация, которая говорит, что метод нужно запускать как тест

public class ExceptionTest {
    @Test
    void exception() {
        try {
            String str = null; //Определяем переменную как null
            System.out.println(str.length()); // Попытка вызвать метод приводит к исключению NullPointerException
        } catch (Exception e) {
            System.out.println("Исключение перехвачено: " + e.getMessage()); //catch перехватывает исключение
        } finally {
            System.out.println("Тест был продолжен после перехвата исключения");
        } //Выполняется всегда, независимо ни от чего, в любом случае
        Assertions.assertTrue(true); //Метод, который проверяет, что условие внутри блока = true
    }
}