package uacExercise;

public abstract class Message {
//	pakai protected supaya hanya bisa di akses dari dalam class dan subclass (meskipun beda package)
//	protected cocok untuk inheritance
    protected ILogin login;
    protected String sender;
    protected String recipient;
    protected String content;

    public Message(ILogin login, String sender, String recipient, String content) {
        this.login = login;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public abstract void send(String username, String password);
}
