package CommunicationServices;

import CommunicationChannel.ChannelType;
import CommunicationChannel.CommunicationChannel;
import CommunicationChannel.CommunicationChannelFactory;

public abstract class CommunicationService {
    protected CommunicationChannel communicationChannel;

    protected CommunicationService(ChannelType channelType) {
        this.communicationChannel = CommunicationChannelFactory.createChannel(channelType);
    }

    public void sendMessage(String message) {
        this.communicationChannel.sendMessage(message);
    }

    abstract String display();
}
