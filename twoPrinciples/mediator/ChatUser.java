package twoPrinciples.mediator;

public class ChatUser extends User {
    public ChatUser(ChatRoom.ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("✉️ " + name + " отправляет: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("📩 " + name + " получил сообщение: " + message);
    }
}