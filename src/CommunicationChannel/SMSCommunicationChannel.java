package CommunicationChannel;

public class SMSCommunicationChannel implements CommunicationChannel {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message = > "+message+"\nBy the medium SMS");
    }

    @Override
    public ChannelType getMedium() {
        return ChannelType.SMS;
    }
}
