package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String stockState;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void changeStockState(String newState) {
        this.stockState = newState;
        System.out.println("StockAgent: The stock market state has changed to " + newState);
        notifyObservers(newState);
    }
}
