package Lesson14;

public class Message {
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
