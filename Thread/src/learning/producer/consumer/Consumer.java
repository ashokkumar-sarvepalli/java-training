package learning.producer.consumer;

public class Consumer implements Runnable {

	private MessageProducerConsumer mpc;

	public Consumer(MessageProducerConsumer mpc) {
		this.mpc = mpc;
	}

	@Override
	public void run() {
		mpc.consume();

	}

}
