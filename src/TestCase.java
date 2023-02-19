import CommunicationChannel.ChannelType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestCase {
    private static CommunicationApp communicationApp;
    private static User user1;
    private static User user2;

   @BeforeEach
    void init() {
        communicationApp = new CommunicationApp();

        user1 = User.builder().Id(1l).name("Deepak").age(21).phone("7742765654").address("Bandikui").build();
        user2 = User.builder().Id(2l).name("Ashish").build();
        communicationApp.registerUser(user1, new ArrayList<ChannelType>(){{add(ChannelType.Call); add(ChannelType.Email);}});
        communicationApp.registerUser(user2, new ArrayList<ChannelType>(){{add(ChannelType.Call); add(ChannelType.SMS);}});
    }

    void printUsers(User user1, User user2) {
        System.out.println("User 1: " + user1+"\tPreferences : "+communicationApp.getPreferences(user1));
        System.out.println("User 2: " + user2+"\tPreferences : "+communicationApp.getPreferences(user2));

    }

    @Order(1)
    @Test

    public void simpleTest() {
        printUsers(user1,user2);
        communicationApp.sendMessage(user1, user2, "How are you?");
        communicationApp.sendMessage(user2,user1,"I'm fine or you?");
    }

    @Order(2)
    @Test
    public void removePreference(){

        System.out.println("SMS preference removed from User2 : "+user2.getName());
        communicationApp.optOut(user2,ChannelType.SMS);
        printUsers(user1,user2);
        communicationApp.sendMessage(user1, user2, "How are you?");
        communicationApp.sendMessage(user2,user1,"I'm fine or you?");
    }

    @Order(3)
    @Test
    public void addPreference(){
        System.out.println("Email preference added to User2 : "+user2.getName());
        communicationApp.optIn(user2,ChannelType.Email);
        printUsers(user1,user2);
        communicationApp.sendMessage(user1, user2, "How are you?");
        communicationApp.sendMessage(user2,user1,"I'm fine or you?");
    }
}