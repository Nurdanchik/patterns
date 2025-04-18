package twoPrinciples.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User alice = new ChatUser(chat, "Alice");
        User bob = new ChatUser(chat, "Bob");
        User charlie = new ChatUser(chat, "Charlie");

        chat.addUser(alice);
        chat.addUser(bob);
        chat.addUser(charlie);

        alice.send("Привет, ребята!");
        bob.send("Привет, Алиса!");
    }
}