package Lesson7;
/*
Створіть Java програму, яка виконує наступні завдання:

Створіть масив цілих чисел з 20 елементами.
Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
Знайдіть та виведіть кількість парних і непарних чисел в масиві.
Знайдіть найбільший та найменший елементи масиву та їхні індекси.
Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого від'ємного числа у масиві (або повідомте, якщо від'ємних чисел немає).
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
Приклад:

Елементи масиву: [34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8]
Сума від'ємних чисел: -138
Кількість парних чисел: 11
Кількість непарних чисел: 9
Найменший елемент: -50 (з індексом 12)
Найбільший елемент: 99 (з індексом 14
Середнє арифметичне чисел після першого від'ємного числа: 20.39

працювати від результата
*/


import java.util.Arrays;
import java.util.Random;

public class App {


    public static void main(String[] args) {


/*
//Мануальне створення массиву

        System.out.println("Please, enter an array size using int type");
        var scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int newArray[] = new int[size];

        System.out.println("Please, fill the array with int type");

        int counter = 0;
        for(int elem : newArray){
            System.out.println("Element " + (counter+1) + ": ");
            newArray[counter] = scanner.nextInt();
            counter++;
        }
        System.out.println(Arrays.toString(newArray));
*/

        int arraySize = 20;
        int minArrayValue = -100;
        int maxArrayValue = 100;

        int[] randomArray = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
// Формула для отримання випадкового цілого числа в діапазоні [min, max]: random.nextInt(max - min + 1) + min
            randomArray[i] = random.nextInt(maxArrayValue - minArrayValue + 1) + minArrayValue;
        }
        System.out.println(Arrays.toString(randomArray));


//Сума від'ємних чисел

        int negativeSum = 0;
        for (int elem : randomArray) {
            if (elem < 0) {
                negativeSum += elem;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);


//Кількість парних чисел
        int evenSum = 0;
        for (int a = 0; a < randomArray.length; a++) {
            if (randomArray[a] % 2 == 0) {
                evenSum++;
            }
        }
        System.out.println("Кількість парних чисел:  " + evenSum);


//Кількість непарних чисел
        int oddSum = 0;
        for (int b = 0; b < randomArray.length; b++) {
            if (Math.abs(randomArray[b]) % 2 == 1) {
                oddSum++;
            }
        }
        System.out.println("Кількість непарних чисел: " + oddSum);


//Найбільший елемент
        int maxValue = randomArray[0];
        for (int elem = 0; elem < randomArray.length; elem++) {
            if (randomArray[elem] > maxValue) {
                maxValue = randomArray[elem];
            }
        }


//Індекс найбільшого елемента
        int maxIndex = 0;
        for (int c = 0; c < randomArray.length; c++) {
            if (randomArray[maxIndex] < randomArray[c]) {
                maxIndex = c;
            }
        }


        String maxValueAndIndex = "Найбільший елемент: %d (з індексом %d)";
        System.out.println(maxValueAndIndex.formatted(maxValue, maxIndex));


//Найменший елемент
        int minValue = randomArray[0];
        for (int d = 0; d < randomArray.length; d++) {
            if (randomArray[d] < minValue) {
                minValue = randomArray[d];
            }
        }


//Індекс найменшого елемента
        int minIndex = 0;
        for (int f = 0; f < randomArray.length; f++) {
            if (randomArray[minIndex] > randomArray[f]) {
                minIndex = f;
            }
        }

        String minValueAndIndex = "Найменший елемент: %d (з індексом %d)";
        System.out.println(minValueAndIndex.formatted(minValue, minIndex));


//Середнє арифметичне чисел в масиві після першого від'ємного числа масива
        int firstNegativeIndex = -1;
        for (int h = 0; h < randomArray.length; h++) {
            if (randomArray[h] < 0) {
                firstNegativeIndex = h;
                break;
            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("В масиві немає від'ємних чисел");
        }

        int startIndex = firstNegativeIndex + 1;


        if (startIndex >= randomArray.length) {
            System.out.println("Немає чисел після першого від'ємного елемента");
        }

        double sum = 0;
        int count = 0;

        for (int j = startIndex; j < randomArray.length; j++) {
            sum += randomArray[j];
            count++;
        }

        double avg = sum / count;
        System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f".formatted(avg));
    }
}