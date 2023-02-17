package CommunicationChannel;

public interface CommunicationChannel {
    void sendMessage(String message);
    ChannelType getMedium();
}
