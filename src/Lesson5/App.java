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
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму доходу у форматі 00.00");
        float profitSum = sc.nextFloat();
        float lowProfitTax = 2.5f;
        float moderateProfitTax = 4.3f;
        float highProfitTax = 6.7f;
        String template = """
            Ставка податку на дохід становить %.1f.
            Сума до сплати - %.2f.
            """;
        if (profitSum > 0.00 & profitSum <= 10_000.00) {
            double taxAmount = profitSum * lowProfitTax / 100;
            System.out.printf(template, lowProfitTax, taxAmount);
        } else if (profitSum > 10_000 & profitSum <= 25_000.00) {
            double taxAmount = profitSum * moderateProfitTax / 100;
            System.out.printf(template, moderateProfitTax, taxAmount);
        } else if (profitSum > 25_000) {
            double taxAmount = profitSum * highProfitTax / 100;
            System.out.printf(template, highProfitTax, taxAmount);
        } else {
            System.out.println("Введіть суму доходу у форматі 00.00");
        }
    }
}
//чи можливо поставити захист від падіння якщо вводять не по вказаному формату або з "," замість "."?