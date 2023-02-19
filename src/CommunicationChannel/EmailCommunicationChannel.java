package CommunicationChannel;

public class EmailCommunicationChannel implements CommunicationChannel {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message = > "+message+"\tBy the medium Email");
    }

    @Override
    public ChannelType getMedium() {
        return ChannelType.Email;
    }
}
