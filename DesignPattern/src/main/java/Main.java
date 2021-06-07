public class Main {
    public static void main(String[] args)
    {
        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree messageSubscriberThree = new MessageSubscriberThree();

        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(messageSubscriberOne);
        messagePublisher.attach(messageSubscriberTwo);

        messagePublisher.notifyUpdate(new Message(" First Message"));   //s1 and s2 will receive the update

        messagePublisher.detach(messageSubscriberOne);
        messagePublisher.attach(messageSubscriberThree);

        messagePublisher.notifyUpdate(new Message(" Second Message")); //s2 and s3 will receive the update
    }
}
