package no.hvl.dat110.messages;

/**
 * Author Espen (har fult ansvar hvis det oppstår problemer i koden) og Tobias (Prosjektleder, oraniserer, Unittester, Admin, Avdelingsleder)
 */

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic
    String topic;
    public SubscribeMsg(String user, String topic) {
        super(MessageType.SUBSCRIBE, user);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "SubscribeMsg{" +
                "topic='" + topic + '\'' +
                '}';
    }
    // TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
}
