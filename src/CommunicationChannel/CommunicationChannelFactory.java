package CommunicationChannel;

public class CommunicationChannelFactory {
    public static CommunicationChannel createChannel(ChannelType channelType) {
        switch(channelType) {
            case Email:
                return new EmailCommunicationChannel();
            case SMS:
                return new SMSCommunicationChannel();
            case Call:
                return new CallCommunicationChannel();
            case WhatsApp:
                return new WhatsAppCommunicationChannel();
            default:

                return null;
        }
    }
}
