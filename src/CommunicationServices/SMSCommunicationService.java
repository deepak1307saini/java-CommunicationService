package CommunicationServices;

import CommunicationChannel.ChannelType;

public class SMSCommunicationService extends CommunicationService{
    public SMSCommunicationService () {
        super(ChannelType.SMS);
    }
}
