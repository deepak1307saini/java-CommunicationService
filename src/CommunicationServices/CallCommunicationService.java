package CommunicationServices;

import CommunicationChannel.ChannelType;

public class CallCommunicationService extends CommunicationService{
    public CallCommunicationService() {
        super(ChannelType.Call);
    }

    @Override
    String display() {
        return String.format("CommunicationApp Service Channel Type: %s", super.communicationChannel.getMedium());
    }
}
