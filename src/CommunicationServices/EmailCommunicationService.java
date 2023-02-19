package CommunicationServices;

import CommunicationChannel.ChannelType;

public class EmailCommunicationService extends CommunicationService{
    public EmailCommunicationService() {
        super(ChannelType.Email);
    }

    @Override
    String display() {
        return String.format("CommunicationApp Service Channel Type: %s", super.communicationChannel.getMedium());
    }
}
