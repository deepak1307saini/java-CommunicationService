package CommunicationChannel;

public class CallCommunicationChannel implements CommunicationChannel {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message = > "+message+"\nBy the medium Call");
    }

    @Override
    public ChannelType getMedium() {
        return ChannelType.Call;
    }
}
