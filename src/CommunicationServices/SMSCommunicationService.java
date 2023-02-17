package CommunicationServices;

import CommunicationChannel.ChannelType;

public class SMSCommunicationService extends CommunicationService{
    public SMSCommunicationService () {
        super(ChannelType.SMS);
    }

    @Override
    String display() {
        return String.format("CommunicationApp Service: Text \t Channel Type: %s", super.communicationChannel.getMedium());
    }
}
