package Lesson14;

public class App {

    public interface Printer {
        void print(PrinterImp.Message message);
    }

    public static class PrinterImp implements Printer {

        public static class Message {
            private String text;
            private String sender;

            public Message(String text, String sender) {
                this.text = (text == null || text.trim().isEmpty()) ? null : text.trim();
                this.sender = (sender == null || sender.trim().isEmpty()) ? null : sender.trim();
            }

            public String getText() {
                return text;
            }

            public String getSender() {
                return sender;
            }

            public void setText(String text) {
                this.text = (text == null || text.trim().isEmpty()) ? null : text.trim();
            }

            public void setSender(String sender) {
                this.sender = (sender == null || sender.trim().isEmpty()) ? null : sender.trim();
            }
        }

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

    public static void main(String[] args) {
        Printer printer = new PrinterImp();

        PrinterImp.Message msg1 = new PrinterImp.Message("текст_повідомлення_з_відправником", "Відправник_1");
        printer.print(msg1);

        PrinterImp.Message msg2 = new PrinterImp.Message("текст_повідомлення_без_відправника", null);
        printer.print(msg2);

        PrinterImp.Message msg3 = new PrinterImp.Message("текст_повідомлення_з_порожнім_відправником", " ");
        printer.print(msg3);

        PrinterImp.Message msg4 = new PrinterImp.Message("", null);
        printer.print(msg4);
    }
}
