package CommunicationServices;

import CommunicationChannel.ChannelType;

public class CallCommunicationService extends CommunicationService{
    public CallCommunicationService() {
        super(ChannelType.Call);
    }
}
