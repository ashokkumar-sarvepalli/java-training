package learning.producer.consumer;

public class Producer implements Runnable{
	
	private MessageProducerConsumer mpc;
	
	public Producer(MessageProducerConsumer mpc){
		this.mpc = mpc;
	}

	@Override
	public void run() {
		mpc.produce();
		
	}

}
