package Lesson14;

public class App {

    public static void main(String[] args) {

        Printer printer = new PrinterImp();

        Message msg1 = new Message("текст_повідомлення_з_відправником", "Відправник_1");
        printer.print(msg1);


        Message msg2 = new Message("текст_повідомлення_без_відправника", null);
        printer.print(msg2);

        Message msg3 = new Message("текст_повідомлення_з_порожнім_відправником", " ");
        printer.print(msg3);

        Message msg4 = new Message("", null);
        printer.print(msg4);
    }
}
