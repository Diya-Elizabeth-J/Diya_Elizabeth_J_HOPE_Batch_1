package ChatApplication.main;

import ChatApplication.model.ChatRoom;
import ChatApplication.model.User;
import ChatApplication.service.MessageSender;
import ChatApplication.util.Validation;

import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChatRoom room = new ChatRoom("General");
        User u1 = new User(1, "Person 1");
        User u2 = new User(2, "Person 2");
        MessageSender send = new MessageSender();
        while (true) {
            System.out.println("\nEnter sender (1-Person1, 2-Person2, 0-Exit):");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) {
                break;
            }
            System.out.println("Enter message:");
            String msg = sc.nextLine();
            if (!Validation.isValid(msg)) {
                continue;
            }
            switch (choice) {
                case 1:
                    send.sendMessage(u1, room, msg);
                    break;

                case 2:
                    send.sendMessage(u2, room, msg);
                    break;
                  case 3:
                     System.out.println("\n--- Chat History ---");
                     room.showMessages();
                     break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}