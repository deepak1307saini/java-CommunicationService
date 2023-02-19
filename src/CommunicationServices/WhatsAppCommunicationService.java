package CommunicationServices;

import CommunicationChannel.ChannelType;

public class WhatsAppCommunicationService extends CommunicationService{
    public WhatsAppCommunicationService() {
        super(ChannelType.WhatsApp);
    }
}
