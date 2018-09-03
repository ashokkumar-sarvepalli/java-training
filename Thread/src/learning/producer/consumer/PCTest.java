package learning.producer.consumer;

public class PCTest {

	public static void main(String[] args) {
		Message message = new Message();
		MessageProducerConsumer mpc = new MessageProducerConsumer(message);
		
		Producer p = new Producer(mpc);
		Consumer c = new Consumer(mpc);
		
		Thread t1 = new Thread(p,"Producer");
		Thread t2 = new Thread(c,"consumer");
		
		t1.start();
		t2.start();

	}

}
