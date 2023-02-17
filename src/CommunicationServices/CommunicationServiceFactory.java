package CommunicationServices;

import CommunicationChannel.ChannelType;

public class CommunicationServiceFactory {

        public static CommunicationService createCommunicationService(ChannelType channelType) {
            switch(channelType) {
                case Email:
                    return new EmailCommunicationService();
                case SMS:
                    return new SMSCommunicationService();
                case Call:
                    return new CallCommunicationService();
                case WhatsApp:
                    return new WhatsAppCommunicationService();
                default:
                    return null;
            }
        }

}
