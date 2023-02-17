import CommunicationChannel.ChannelType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Preference {

       private static HashMap<Long, List<ChannelType>> preferencesData=new HashMap<>();

       public void addPreference(long userId, List<ChannelType> channelTypes){
              preferencesData.put(userId,channelTypes);
       }

       public void optIn(User user,ChannelType channelType){
              if (preferencesData.containsKey(user.getId())){
                     preferencesData.get(user.getId()).add(channelType);
              }else {
                     preferencesData.put(user.getId(), Arrays.asList(channelType));
              }
       }

       public void optOut(User user,ChannelType channelType){
              long userId=user.getId();
              if(preferencesData.containsKey(userId)){
                     preferencesData.get(userId).remove(channelType);
              }
       }

       public List<ChannelType> getPreferences(User user){
              long userId = user.getId();
              if(preferencesData.containsKey(userId)) {
                     return preferencesData.get(userId);
              } else {
                     return new ArrayList<>();
              }
       }
}
