package Lesson6;

public class App {

    static void main(String[] args) {

        var iterationLimit = 6;
        var iterationTemplate = "%d) Num is %d, sum is %d";
        var sumTemplate = "Sum of numbers is %d";
        var separator = "-----------------------";
        var sumOfNum = 0;
        for (int i = 1; i <= 6; i++) {
            sumOfNum += i;
            System.out.println(iterationTemplate.formatted(i, i, sumOfNum));
        }

        System.out.println(separator);
        System.out.println(sumTemplate.formatted(sumOfNum));

    }
}
