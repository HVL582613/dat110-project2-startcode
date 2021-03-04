package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {
	
	private String subscribe;
	
	

	public SubscribeMsg(String user, String subscribe) {
		super(MessageType.SUBSCRIBE, user);
		this.subscribe = subscribe;
	}



	public String getSubscribe() {
		return subscribe;
	}



	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	
	@Override
	public String toString() {
		return super.toString() + " subscribed to: " + this.subscribe;
	}

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
		
}
