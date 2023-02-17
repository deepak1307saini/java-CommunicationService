package CommunicationChannel;

public class WhatsAppCommunicationChannel implements CommunicationChannel {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message = > "+message+"\nBy the medium WhatsApp");
    }

    @Override
    public ChannelType getMedium() {
        return ChannelType.WhatsApp;
    }
}