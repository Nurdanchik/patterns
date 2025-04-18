package twoPrinciples.mediator;

public abstract class User {
    protected ChatRoom.ChatMediator mediator;
    protected String name;

    public User(ChatRoom.ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
