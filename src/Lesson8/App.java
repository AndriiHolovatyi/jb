package Lesson8;
/*
Створіть Java програму, яка виконує наступні завдання, використовуючи одновимірний масив:

Створіть масив цілих чисел з 15 елементами.
Заповніть масив випадковими цілими числами в діапазоні від 1 до 100.
Виведіть початковий вигляд масиву.
Відсортуйте масив за допомогою алгоритму сортування вставкою (Insertion Sort) в порядку зростання.
Виведіть відсортований масив.
Попросіть користувача ввести число для пошуку в масиві.
Використовуючи алгоритм бінарного пошуку, знайдіть і виведіть індекс введеного користувачем числа у відсортованому масиві або повідомте, якщо числа немає.
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
Приклад:

Початковий вигляд масиву: [45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91]
Відсортований масив: [2, 7, 12, 23, 32, 34, 41, 45, 55, 65, 67, 78, 88, 91, 98]
Введіть число для пошуку: 34 Індекс числа 34 у відсортованому масиві: 5
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static int find(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main() {
        int arraySize = 15;
        int minArrayValue = 1;
        int maxArrayValue = 100;

        int[] randomArray = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt(maxArrayValue - minArrayValue + 1) + minArrayValue;
        }
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(randomArray));

        int n = randomArray.length;
        for (int i = 1; i < n; i++) {
            int key = randomArray[i];
            int j = i - 1;
            while (j >= 0 && randomArray[j] > key) {
                randomArray[j + 1] = randomArray[j];
                j--;
            }
            randomArray[j + 1] = key;
        }
        System.out.println("Відсортований масив: " + Arrays.toString(randomArray));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int numberToSearch = scanner.nextInt();

        int resultIndex = find(randomArray, numberToSearch);

        if (resultIndex != -1) {
            System.out.println("Індекс числа " + numberToSearch + " у відсортованому масиві: " + resultIndex);
        } else {
            System.out.println("Число " + numberToSearch + " не знайдено у відсортованому масиві.");
        }
    }
}
