package mediator;

class ChatRoom implements ChatMediator {
    public void showMessage(User user, String message) {
        System.out.println("[" + user.getName() + "] : " + message);
    }
}