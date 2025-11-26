package com.example.boxtest;

import java.util.ArrayList; //Интерфейс коллекции
import java.util.Iterator; //Реализация динамического массива
import java.util.List; //Итератор

public class BoxFilterExample {

    public static void moveBigBoxes(List<Box> source, List<Box> destination) {
        Iterator<Box> iterator = source.iterator(); //Итератор позволяет удалять элементы из списка

        while (iterator.hasNext()) { //Начинаем перебирать все коробки
            Box box = iterator.next(); //Перебирает каждую коробку, с текущей
            if (box.getWidth() > 30) { //Если ширина > 30
                destination.add(box); //Перемещаем коробки в список, где хранятся коробки > 30
                iterator.remove();   // удаляем из исходной коллекции
            }
        }
    }     // Метод, использующий итератор

    public static void main(String[] args) {

        List<Box> boxes = new ArrayList<>(); // Создается список, где хранится основная коллекция коробок
        boxes.add(new Box(29.5, 20, 30));
        boxes.add(new Box(30.1, 31, 20));
        boxes.add(new Box(29, 30, 10));
        boxes.add(new Box(30.5, 32, 50));
        boxes.add(new Box(29.9, 30, 10));
        boxes.add(new Box(31, 32, 50));
        boxes.add(new Box(30.01, 32, 50));
        // Добавляем семь объектов, с разными пороговыми значениями,
        // чтобы сразу протестировать граничные условия

        System.out.println("Все коробки до фильтрации:");   //Вывод всех коробок
        boxes.forEach(System.out::println);

        System.out.println();
        // Коллекция для больших коробок
        List<Box> bigBoxes = new ArrayList<>();

        moveBigBoxes(boxes, bigBoxes); //Выполняем метод moveBigBoxes

        System.out.println("Коробки > 30 см шириной:"); //Вывод коробок больше 30
        bigBoxes.forEach(System.out::println);

        System.out.println("\nОставшиеся коробки:"); //Вывод остальных коробок
        boxes.forEach(System.out::println);
    }
}
