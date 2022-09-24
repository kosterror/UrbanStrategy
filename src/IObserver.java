public interface IObserver {

    void registerObservable(IObservable observable);

    void unregisterObservable(IObservable observable);

    void notifyObservable();

}
