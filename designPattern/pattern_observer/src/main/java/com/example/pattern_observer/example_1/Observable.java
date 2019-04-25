package com.example.pattern_observer.example_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 仿照Java Observable
 */
public class Observable {
    private List<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }

    public synchronized void addObserver(Observer observer) {
        if (observer == null) {
            return;
        }
        if (observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    public synchronized void deleteObserver(Observer observer) {
        if (observer == null) {
            return;
        }
        observers.remove(observer);
    }

    public void notifyObserver(Object obj) {
        Object[] temp;
        synchronized (this) {
            temp = observers.toArray();
        }

        for (int i = temp.length - 1; i >= 0; i--) {
            ((Observer) temp[i]).update(this, obj);
        }
    }

}
