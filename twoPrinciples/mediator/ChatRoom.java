package twoPrinciples.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatRoom.ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(sender.name + ": " + message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    public static interface ChatMediator {
        void sendMessage(String message, User sender);
        void addUser(User user);
    }
}