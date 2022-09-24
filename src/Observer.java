import observer.IObservable;
import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Observer implements IObserver {

    List<IObservable> iObservables;

    public Observer() {
        iObservables = new ArrayList<>();
        startUpdating();
    }

    @Override
    public void registerObservable(IObservable iObservable) {
        iObservables.add(iObservable);
    }

    @Override
    public void unregisterObservable(IObservable observable) {
        iObservables.remove(observable);
    }

    @Override
    public void notifyObservable() {
        for (IObservable iObservable : iObservables) {
            iObservable.update();
        }
    }

    private void startUpdating(){
        Thread run = new Thread(() -> {
            while (true) {
                notifyObservable();
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        run.start();
    }

}
