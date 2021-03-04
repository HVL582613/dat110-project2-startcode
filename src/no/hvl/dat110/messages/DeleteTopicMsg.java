package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
	
	private String deleteTopic; 
	
	

	public DeleteTopicMsg(String user, String deleteTopic) {
		super(MessageType.DELETETOPIC, user);
		this.deleteTopic = deleteTopic;
	}



	public String getDeletedTopic() {
		return deleteTopic;
	}



	public void setDeleteTopic(String deleteTopic) {
		this.deleteTopic = deleteTopic;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " topic deleted: " + this.deleteTopic;
	}

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

}
