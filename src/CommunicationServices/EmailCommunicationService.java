package CommunicationServices;

import CommunicationChannel.ChannelType;

public class EmailCommunicationService extends CommunicationService{
    public EmailCommunicationService() {
        super(ChannelType.Email);
    }
}
