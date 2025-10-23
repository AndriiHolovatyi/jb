package Lesson9;

/*
Створіть Java програму, яка виконує наступні завдання, використовуючи двовимірний масив (матрицю):

- Створіть двовимірний масив цілих чисел розмірністю 4x4.
- Заповніть матрицю випадковими цілими числами в діапазоні від 1 до 50.
- Виведіть матрицю на екран у вигляді таблиці.
- Знайдіть суму всіх елементів в парних рядках (рядок 0, 2) та суму всіх елементів в непарних рядках (рядок 1, 3).
- Знайдіть добуток всіх елементів в парних стовпцях (стовпцях 0, 2) та добуток всіх елементів в непарних стовпцях (стовпцях 1, 3).
- Виведіть результати сум та добутків для парних і непарних рядків та стовпців.
- Перевірте, чи матриця є магічним квадратом. Магічний квадрат - це квадратна матриця, в якій суми всіх рядків, стовпців та діагоналей рівні між собою.
- Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.

Матриця 4x4:
23 45 12 37
50 11 42 20
33 27 19 48
8   39  6  4

Сума елементів у парних рядках (рядок 0, 2): 224
Сума елементів у непарних рядках (рядок 1, 3): 180
Добуток елементів у парних стовпцях (стовпець 0, 2): 17443641600
Добуток елементів у непарних стовпцях (стовпець 1, 3): 74057068800

Матриця не є магічним квадратом.
 */

import java.util.Random;

public class App {

    private static final int MATRIX_SIZE = 4;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 50;

    public static void main(String[] args) {

        int[][] mtx = createAndFillArray();

        printMatrix(mtx);

        System.out.println();

        calculateRowSums(mtx);
        System.out.println();

        calculateColumnProducts(mtx);
        System.out.println();

        checkIfMagicSquare(mtx);
    }


    private static int[][] createAndFillArray() {
        int[][] mtx = new int[MATRIX_SIZE][MATRIX_SIZE];
        Random random = new Random();

        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                mtx[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
        return mtx;
    }


    private static void printMatrix(int[][] mtx) {
        for (int[] row : mtx) {
            for (int col : row) {
                System.out.printf("%4d", col);
            }
            System.out.println();
        }
    }

    private static void calculateRowSums(int[][] mtx) {
        long totalEvenRowsSum = 0;
        long totalOddRowsSum = 0;

        for (int i = 0; i < mtx.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < mtx[i].length; j++) {
                currentRowSum += mtx[i][j];
            }

            if (i % 2 == 0) { // Парні (0, 2)
                totalEvenRowsSum += currentRowSum;
            } else { // Непарні (1, 3)
                totalOddRowsSum += currentRowSum;
            }
        }

        System.out.println("Сума елементів у парних рядках (0, 2): " + totalEvenRowsSum);
        System.out.println("Сума елементів у непарних рядках (1, 3): " + totalOddRowsSum);
    }


    private static void calculateColumnProducts(int[][] mtx) {
        long totalEvenColsProduct = 1;
        long totalOddColsProduct = 1;

        long[] columnProducts = new long[MATRIX_SIZE];
        for (int k = 0; k < MATRIX_SIZE; k++) {
            columnProducts[k] = 1;
        }

        for (int j = 0; j < MATRIX_SIZE; j++) {
            for (int i = 0; i < MATRIX_SIZE; i++) {
                columnProducts[j] *= mtx[i][j];
            }
        }

        for (int j = 0; j < MATRIX_SIZE; j++) {
            if (j % 2 == 0) {
                totalEvenColsProduct *= columnProducts[j];
            } else {
                totalOddColsProduct *= columnProducts[j];
            }
        }


        System.out.println("Добуток елементів у парних стовпцях (0, 2): " + totalEvenColsProduct);
        System.out.println("Добуток елементів у непарних стовпцях (1, 3): " + totalOddColsProduct);
    }


    private static void checkIfMagicSquare(int[][] mtx) {

        int expectedSum = 0;
        boolean isMagic = true;

        for (int j = 0; j < MATRIX_SIZE; j++) {
            expectedSum += mtx[0][j];
        }


        for (int i = 1; i < MATRIX_SIZE; i++) {
            int rowSum = 0;
            for (int j = 0; j < MATRIX_SIZE; j++) {
                rowSum += mtx[i][j];
            }
            if (rowSum != expectedSum) {
                System.out.println("Не магічний: Сума рядка " + i + " = " + rowSum + ", очікувана: " + expectedSum);
                isMagic = false;
                break;
            }
        }

        if (!isMagic) {
            System.out.println("Матриця НЕ є магічним квадратом.");
            return;
        }

        for (int j = 0; j < MATRIX_SIZE; j++) {
            int colSum = 0;
            for (int i = 0; i < MATRIX_SIZE; i++) {
                colSum += mtx[i][j];
            }
            if (colSum != expectedSum) {
                System.out.println("Не магічний: Сума стовпця " + j + " = " + colSum + ", очікувана: " + expectedSum);
                isMagic = false;
                break;
            }
        }

        if (!isMagic) {
            System.out.println("Матриця НЕ є магічним квадратом.");
            return;
        }

        int primaryDiagonalSum = 0;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            primaryDiagonalSum += mtx[i][i];
        }
        if (primaryDiagonalSum != expectedSum) {
            System.out.println("Не магічний: Сума головної діагоналі = " + primaryDiagonalSum + ", очікувана: " + expectedSum);
            isMagic = false;
        }

        if (!isMagic) {
            System.out.println("Матриця НЕ є магічним квадратом.");
            return;
        }

        int secondaryDiagonalSum = 0;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            secondaryDiagonalSum += mtx[i][MATRIX_SIZE - 1 - i];
        }
        if (secondaryDiagonalSum != expectedSum) {
            System.out.println("Не магічний: Сума другої діагоналі = " + secondaryDiagonalSum + ", очікувана: " + expectedSum);
            isMagic = false;
        }

        if (isMagic) {
            System.out.println("Матриця є МАГІЧНИМ КВАДРАТОМ з сумою: " + expectedSum);
        } else {
            System.out.println("Матриця НЕ є магічним квадратом.");
        }
    }
}
