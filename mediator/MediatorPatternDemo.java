package mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);

        user1.sendMessage("Hi Bob!");
        user2.sendMessage("Hey Alice, how are you?");
    }
}