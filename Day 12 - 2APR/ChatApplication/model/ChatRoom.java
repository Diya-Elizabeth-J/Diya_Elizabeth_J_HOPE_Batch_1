package ChatApplication.model;

import java.util.ArrayList;

public class ChatRoom {
    private String roomName;
    private ArrayList<Message> messages = new ArrayList<>();
    public ChatRoom(String roomName) {
        this.roomName = roomName;
    }
    public void addMessage(Message m) {
        messages.add(m);
    }
    public void showMessages() {
        System.out.println("Chat Room: " + roomName);
        for (Message m : messages) {
            m.display();
        }
    }
}
