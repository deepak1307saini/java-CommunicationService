package CommunicationChannel;

public class WhatsAppCommunicationChannel implements CommunicationChannel {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message = > " + message + "\tBy the medium WhatsApp");
    }

}
