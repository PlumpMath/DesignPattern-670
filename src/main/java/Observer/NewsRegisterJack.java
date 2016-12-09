package Observer;

public class NewsRegisterJack implements Observer {
    public void update(String latestNews) {
        System.out.println("Jack is getting the news ..." +latestNews);
    }
}
