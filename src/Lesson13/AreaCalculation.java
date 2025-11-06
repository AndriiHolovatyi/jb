package Lesson13;
/*
Створити порожній проект в IntelliJ
Створити базовий інтерфейс для геометричної фігури, в якому є метод, який повертає площу фігури.
Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат.
Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */

public class AreaCalculation {


    public static double calculateTotalArea(Figure[] figures) {
        double totalArea = 0.0;

        for (Figure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {

        Figure[] shapes = new Figure[3];

        shapes[0] = new Circle(4.451);
        shapes[1] = new Triangle(4, 7, 8);
        shapes[2] = new Square(15.1212);

        double totalArea = calculateTotalArea(shapes);

        System.out.println("Overall area is: " + totalArea);
    }
}
