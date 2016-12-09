package Observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new NewsPublisher();
        Observer jack = new NewsRegisterJack();
        Observer amy = new NewsRegisterAmy();
//        notify when nobody is subscribed.
        subject.notifyObservers();
//        notify when both user is subscribed.
        subject.registerObserver(jack);
        subject.registerObserver(amy);
        subject.notifyObservers();
//        notify when amy is unsubscribed.
        subject.removeObserver(amy);
        subject.notifyObservers();
    }
}

