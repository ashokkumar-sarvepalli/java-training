package learning.producer.consumer;

public class MessageProducerConsumer {

	private Message message;

	private boolean isConsumed;

	public MessageProducerConsumer(Message message) {
		this.message = message;
	}

	public void produce() {

		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				while(isConsumed==true){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				message.setId(i);
				message.setMessage("Message " + i);
				System.out.println("Produce produced message number " + i);
				isConsumed = true;
				notify();

			}
		}

	}

	public synchronized void consume() {

		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				while(isConsumed==false){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("Consumer consumed message number " + message.getId());
				System.out.println(message.getId());
				System.out.println(message.getMessage());
				isConsumed=false;
				notify();
			}
		}

	}

}
