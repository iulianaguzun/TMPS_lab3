package mediator;

public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new User("Crane", mediator);
        User user2 = new User("Steve", mediator);
        User user3 = new User("Bob", mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hi chat!");
        user2.sendMessage("Hello Crane!");
        user3.sendMessage("Hey all!");
    }
}
