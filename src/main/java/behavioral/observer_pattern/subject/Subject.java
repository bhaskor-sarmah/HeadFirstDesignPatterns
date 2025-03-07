package behavioral.observer_pattern.subject;

import behavioral.observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

  List<Observer> observers = new ArrayList<>();

  public abstract void addObserver(final Observer observer);

  public abstract void removeObserver(final Observer observer);

  public abstract void updateMeasurements(final long temperature, final long humidity);

  protected abstract void notifyObserver();
}
