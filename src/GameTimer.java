import observer.IObservable;
import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class GameTimer implements IObserver {

    private boolean isRunning;

    List<IObservable> iObservables;

    public GameTimer() {
        iObservables = new ArrayList<>();
        startTimer();
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

    private void startTimer(){
        isRunning = true;

        Thread run = new Thread(() -> {
            while (isRunning) {
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

    public void loseGame() {
        isRunning = false;
    }
}
