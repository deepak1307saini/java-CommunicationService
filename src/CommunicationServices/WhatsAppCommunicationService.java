package CommunicationServices;

import CommunicationChannel.ChannelType;

public class WhatsAppCommunicationService extends CommunicationService{
    public WhatsAppCommunicationService() {
        super(ChannelType.WhatsApp);
    }

    @Override
    String display() {
        return String.format("CommunicationApp Service: Text \t Channel Type: %s", super.communicationChannel.getMedium());
    }
}
