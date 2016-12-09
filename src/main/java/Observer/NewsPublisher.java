package Observer;

import java.util.ArrayList;

public class NewsPublisher implements Subject {
    private ArrayList<Observer> observers;

    public NewsPublisher() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(getLatestNews());
        }
    }

    private String  getLatestNews() {
        return "this is latest news";
    }
}
