package ChatApplication.service;

import ChatApplication.model.ChatRoom;
import ChatApplication.model.Message;
import ChatApplication.model.User;

public class MessageSender {
    public void sendMessage(User user, ChatRoom room, String msg) {
        Message message = new Message(user, msg);
        room.addMessage(message);
    }
}
