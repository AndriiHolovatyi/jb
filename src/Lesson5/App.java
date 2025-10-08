package Lesson5;

import java.util.Scanner;

/*
Доходи оподатковуются за прогресивною шкалою оподаткування:

від 0 до 10000, включно, за ставкою 2,5%.
від 10000, виключно, до 25000, включно, за ставкою 4,3%.
більше 25000, за ставкою 6,7%.
Необхідно розрахувати суму податку від певної суми доходу. Сума податку дорівнює відсотку від суми доходу.
 */

public class App {

    public static void main(String[] args) {

//дуже багато зайвого коду //дуже багато зайвого коду //дуже багато зайвого коду //дуже багато зайвого коду


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введіть суму доходу у форматі 00.00");
//        float profitSum = sc.nextFloat();
//        float lowProfitTaxRate = 2.5f;
//        float moderateProfitTaxRate = 4.3f;
//        float highProfitTaxRate = 6.7f;
//
//        String template = """
//            Ставка податку на дохід становить %.1f.
//            Сума до сплати - %.2f.
//            """;
//        if (profitSum > 0.00 & profitSum <= 10_000.00) { //уникати "магічних чисел" - виносити в окрему змінну
//            double taxAmount = profitSum * lowProfitTaxRate / 100;
//            System.out.printf(template, lowProfitTaxRate, taxAmount);
//        } else if (profitSum > 10_000.00 & profitSum <= 25_000.00) { //уникати "магічних чисел" - виносити в окрему змінну
//            double taxAmount = profitSum * moderateProfitTaxRate / 100;
//            System.out.printf(template, moderateProfitTaxRate, taxAmount);
//        } else if (profitSum > 25_000.00) { //уникати "магічних чисел" - виносити в окрему змінну
//            double taxAmount = profitSum * highProfitTaxRate / 100;
//            System.out.printf(template, highProfitTaxRate, taxAmount);
//        } else {
//            System.out.println("Введіть суму доходу у форматі 00.00");


// зменшуємо кількість коду // зменшуємо кількість коду // зменшуємо кількість коду // зменшуємо кількість коду


            var lowProfitTaxRate = 2.5;
            var moderateProfitTaxRate = 4.3;
            var highProfitTaxRate = 6.7;

            var firstTaxGroupLimit = 10_000;
            var secondTaxGroupLimit = 25_000;

            var oneHundred = 100;

            var scanner = new Scanner(System.in);
            System.out.println("Введіть суму доходу у форматі 00.00");
            var profitSum = scanner.nextDouble();

            double resolvedRate;

            if (profitSum <= firstTaxGroupLimit) {
                resolvedRate = lowProfitTaxRate; //виносимо формулу в окрему змінну, а в умову додаємо тільки змінну частину
            } else if (profitSum <= secondTaxGroupLimit) { //якщо не попаде в if -> попаде в else if і так далі
                resolvedRate = moderateProfitTaxRate;
            } else {
                resolvedRate = highProfitTaxRate;
            }

            var taxAmount = (profitSum * resolvedRate) / oneHundred;

            System.out.println("Tax amount is " + taxAmount);



    }
}



//чи можливо поставити захист від падіння якщо вводять не по вказаному формату або з "," замість "."?