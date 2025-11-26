package com.example.boxtest;

public class Box {
    private double width;
    private double height;
    private double depth;
    // Определяю класс коробки с заданными переменными его размеров

    public Box(double width, double height, double depth) {
        this.width = width; //Ширина
        this.height = height; //Высота
        this.depth = depth; // Глубина
    } //Конструктор, который создает коробку,
      //использую this, чтобы указать Java, что обращаемся к полю объекта, а не к параметру

    public double getWidth() {
        return width;
    } //Геттер позволяет получить ширину коробки, нужен для определения ширины

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    } //Тут настраиваю вывод текста в читабельный вид
}
