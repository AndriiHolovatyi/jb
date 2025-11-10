package Lesson14;

public class PrinterImp implements Printer {

    @Override
    public void print(Message message) {

        if (message.getText() == null && message.getSender() == null) {

            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message m) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };

            anonymousPrinter.print(message);
            return;
        }

        String messageText = message.getText() != null ? message.getText() : "<текст повідомлення відсутній>";
        String senderName = message.getSender();

        if (senderName == null) {
            System.out.printf("Анонімний користувач відправив повідомлення: %s%n", messageText);
        } else {
            System.out.printf("Користувач %s відправив повідомлення: %s%n", senderName, messageText);
        }
    }
}
