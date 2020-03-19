package observer;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcreteSubject implements Subject<String> {

    private Set<Observer<String>> observers =
            new CopyOnWriteArraySet<Observer<String>>();

    public void registerObserver(Observer<String> observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer<String> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(final String event) {
        observers.forEach(observer -> observer.observe(event));
    }
}
