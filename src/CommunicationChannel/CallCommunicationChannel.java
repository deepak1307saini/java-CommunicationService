package CommunicationChannel;

public class CallCommunicationChannel implements CommunicationChannel {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message = > "+message+"\tBy the medium Call");
    }
}
