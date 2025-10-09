package Lesson6;

public class App {

    static void main(String[] args) {

        var sumOfNum = 0;
        for (int i = 1; i <= 6; i++) {
            sumOfNum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sumOfNum);
        }

        System.out.println("-----------------------");
        System.out.println("Sum of numbers is " + sumOfNum);

    }
}
