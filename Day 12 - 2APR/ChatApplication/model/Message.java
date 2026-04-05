package ChatApplication.model;

public class Message {
    private User sender;
    private String content;
    public Message(User sender, String content) {
        this.sender = sender;
        this.content = content;
    }
    public void display() {
        System.out.println(sender.getName() + ": " + content);
    }
}
