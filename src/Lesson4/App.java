package Lesson4;

public class App {


    public static void main() {

        int salesDaysSmarphone = 5;
        float totalSalesSmartphone = 12153.41f;
        double dailySalesSmartphone = totalSalesSmartphone / salesDaysSmarphone;
        int salesDaysLaptop = 7;
        float dailySalesLaptop = 1498.12f;
        double totalSalesLaptop = salesDaysLaptop * dailySalesLaptop;

//        System.out.printf("""
//               Product No %d: %s,
//               total sales for %d days is EUR %.2f,
//               sales by day is EUR %.2f.
//               """, 1, "smartphone", salesDaysSmarphone, totalSalesSmartphone, dailySalesSmartphone);
//
//        System.out.printf("""
//               Product No %d: %s,
//               total sales for %d days is EUR %.2f,
//               sales by day is EUR %.2f.
//               """, 2, "laptop", salesDaysLaptop, totalSalesLaptop, dailySalesLaptop);

        //доробка з темплейтом в окремій змінній


        String template = """
               Product No %d: %s,
               total sales for %d days is EUR %.2f,
               sales by day is EUR %.2f.
               """;
        System.out.printf(template, 1, "smartphone", salesDaysSmarphone, totalSalesSmartphone, dailySalesSmartphone);
        System.out.printf(template,2, "laptop", salesDaysLaptop, totalSalesLaptop, dailySalesLaptop);

    }

}
