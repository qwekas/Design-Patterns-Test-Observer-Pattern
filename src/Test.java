
public class Test {
	public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers("Test message");
        subject.removeObserver(observer1);
        subject.notifyObservers("Test message 2");
	}
}
