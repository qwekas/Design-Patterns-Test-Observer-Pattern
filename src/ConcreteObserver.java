import java.util.concurrent.atomic.AtomicInteger;

public class ConcreteObserver implements Observer {
	private static final AtomicInteger observerIdCounter = new AtomicInteger(0);
	private int observerId;
	
	public ConcreteObserver() {
		this.observerId = observerIdCounter.incrementAndGet();
	}
	@Override
	public void update(String message) {
		System.out.println("Observer " + observerId + ": " + message);
	}
}
