package org.example.simplenetwork2;

import java.util.ArrayList;
import java.util.Random;

public class Messages {


    private final ArrayList<String> messages;

    public Messages() {
        messages = new ArrayList<>();


        messages.add("good!");
        messages.add("me too!");

        messages.add("yay!!!");
        messages.add("According to all known laws of aviation, " +
                "there is no way a bee should be able to fly. " +
                "Its wings are too small to get its fat little body off the ground. " +
                "The bee, of course, flies anyway because bees don't care what humans think is impossible.");
        //im so sorry
    }

    public String createMessage() {
        // at some point would let the user create a new message
        // to store in the Messages arrayList
        return "finish method";
    }

    public String defaultMessages() {
        // creates the first five default messages that
        // are hard coded in
        return "finish method";
    }

    public String removeMessage() {
        // allows the user to remove a message from the
        // Messages arrayList



        return "finish method";
    }

    public String getRandomMessage() {
        // method for returning a random message from the
        // Messages arrayList

        int listLength;
        String random;
        Random rand = new Random();

        listLength = messages.size();
        random = messages.get(rand.nextInt(listLength));

        return random;

    }
}
