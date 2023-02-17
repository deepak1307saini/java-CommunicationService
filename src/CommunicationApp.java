import CommunicationChannel.ChannelType;
import CommunicationServices.CommunicationService;
import CommunicationServices.CommunicationServiceFactory;

import java.util.ArrayList;
import java.util.List;

public class CommunicationApp {
    Preference preferences;

    public CommunicationApp() {
        preferences = new Preference();
    }

    public void registerUser(User user, List<ChannelType> channelTypes) {
        preferences.addPreference(user.getId(),channelTypes);
    }
    public void registerUser(User user){
        preferences.addPreference(user.getId(), new ArrayList<>());
    }

    public void optIn(User user,ChannelType channelType){
        preferences.optIn(user,channelType);
    }

    public void optOut(User user,ChannelType channelType){
        preferences.optOut(user, channelType);
    }

    public void sendMessage(User sender, User receiver, String message) {
        List<ChannelType> receiverPreferences=preferences.getPreferences(receiver);

        if (receiverPreferences.isEmpty()){
            System.out.println("User "+receiver.getName()+" not having registered for any service.");
        }
        else {
            for(ChannelType channelType: receiverPreferences) {
                CommunicationService communicationService = CommunicationServiceFactory.createCommunicationService(channelType);
                if(communicationService != null) {
                    communicationService.sendMessage(message);
                }
            }

            System.out.println(sender.getName()+" sent a message to "+receiver.getName()+" by "+receiverPreferences+ " mediums");
        }
    }
}
