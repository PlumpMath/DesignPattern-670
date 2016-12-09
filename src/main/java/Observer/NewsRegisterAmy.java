package Observer;

public class NewsRegisterAmy implements Observer {
    public void update(String latestNews) {
        System.out.println("Amy is getting the news ..." +latestNews);
    }
}
