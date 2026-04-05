package ChatApplication.util;

public class Validation {
    public static boolean isValid(String msg) {
        if (msg == null || msg.trim().isEmpty()) {
            System.out.println("Message cannot be empty!");
            return false;
        }
        return true;
    }
}
