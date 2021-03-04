package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		Client cl = new Client("Display device", Common.BROKERHOST, Common.BROKERPORT);
		
		// - connect to the broker
		cl.connect();
		
		// - create the temperature topic on the broker
		cl.createTopic(Common.TEMPTOPIC);
		
		// - subscribe to the topic
		cl.subscribe(Common.TEMPTOPIC);
		
		// - receive messages on the topic
		for(int i = 0; i < COUNT; i++) {
			PublishMsg recieved = (PublishMsg) cl.receive();
			System.out.println("\nThe temperature recieved from broker: " + recieved.getMessage() + "\n");
		}
		
		// - unsubscribe from the topic
		cl.unsubscribe(Common.TEMPTOPIC);
		// - disconnect from the broker
		cl.disconnect();
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
		
	}
}
