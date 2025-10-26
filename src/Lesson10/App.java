package Lesson10;
/*
Створіть Java програму з використанням методів, яка виконує наступні завдання:
Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з букв цього рядка у зворотньому порядку.
Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
Приклад:
Copy code
1. Введіть ціле число: 5
  Квадрат числа 5 дорівнює 25.
2. Об'єм циліндра з радіусом 3.5 і висотою 10.0 дорівнює 384.81334713945307.
3. Масив чисел: [10, 20, 30, 40, 50]
  Сума всіх елементів масиву дорівнює 150.
4. Введіть рядок: Hello, World!
  Рядок в зворотньому порядку: !dlroW ,olleH
5. Введіть a: 2
  Введіть b: 3
  Результат 2^3 дорівнює 8.
6. Введіть ціле число n: 4
  Введіть текстовий рядок: Java програмування
  Java програмування
  Java програмування
  Java програмування
  Java програмування
 */
import java.util.Arrays;
import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    public int toThePowerOf2() {
        System.out.println("Введіть ціле число: ");
        int a = scanner.nextInt();
        int result = a * a;
        System.out.println("Квадрат числа " + a + " дорівнює " + result + ".");
        scanner.nextLine();
        return result;
    }

    public double cylinderVolume(double r, double h) {
        double piValue = Math.PI;
        double cylinderVolumeCalcResult = piValue * r * r * h;
        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює: %.14f\n", r, h, cylinderVolumeCalcResult);
        return cylinderVolumeCalcResult;
    }

    public int arraySum(int[] arrayInQuestion) {
        int sumOfElems = 0;
        for (int elem : arrayInQuestion) {
            sumOfElems += elem;
        }
        String arrayForPrint = Arrays.toString(arrayInQuestion);
        System.out.printf("""
                Масив чисел: %s
                """, arrayForPrint);
        System.out.printf("""
                Сума всіх елементів масиву дорівнює %d.
                """, sumOfElems);
        return sumOfElems;
    }

    public String reverseString() {
        System.out.println("Введіть рядок: ");
        String stringInQuestion = scanner.nextLine();

        char[] charArray = stringInQuestion.toCharArray();
        int n = charArray.length;
        for (int i = 0; i < n / 2; i++) {
            char temp1 = charArray[i];
            charArray[i] = charArray[n - 1 - i];
            charArray[n - 1 - i] = temp1;
        }
        String reversedString = new String(charArray);
        System.out.printf("Рядок в зворотньому порядку: %s\n", reversedString);
        return reversedString;
    }

    public double toThePowerOfInput() {
        System.out.println("Введіть a: ");
        int a = scanner.nextInt();
        System.out.println("Введіть b: ");
        int b = scanner.nextInt();

        double toThePowerOfInputResult = Math.pow(a, b);
        System.out.printf("Результат %d^%d дорівнює %2f.\n", a, b, toThePowerOfInputResult);
        scanner.nextLine();
        return toThePowerOfInputResult;
    }

    public void printStringTimesArg() {
        System.out.println("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть текстовий рядок: ");
        String lineToPrint = scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println(lineToPrint);
        }
    }


    public static void main(String[] args) {
        App launch = new App();

        launch.toThePowerOf2();

        double radius = 3.5;
        double height = 10.0;
        launch.cylinderVolume(radius, height);

        int arrayForCalculation[] = new int[]{10, 20, 30, 40, 50};
        launch.arraySum(arrayForCalculation);

        launch.reverseString();

        launch.toThePowerOfInput();

        launch.printStringTimesArg();
    }
}

