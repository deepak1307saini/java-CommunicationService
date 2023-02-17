import CommunicationChannel.ChannelType;
import org.junit.Test;

import java.util.Arrays;

public class TestCase {
    CommunicationApp communicationApp;



    void printUsers(User user1, User user2) {
        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);

    }

    @Test
    public void simpleTest() {
        communicationApp=new CommunicationApp();
        User user1 = User.builder().Id(1L).name("Deepak").age(21).phone("7742765654").build();
        User user2 = User.builder().Id(2L).name("Ram").build();
        printUsers(user1,user2);

        try {
            communicationApp.registerUser(user1, Arrays.asList(ChannelType.WhatsApp, ChannelType.Call));
            communicationApp.registerUser(user2, Arrays.asList(ChannelType.SMS, ChannelType.Call));
        }catch (Exception e)
        {
            System.out.println(e);
        }

        communicationApp.sendMessage(user1, user2, "Hi");

    }
}