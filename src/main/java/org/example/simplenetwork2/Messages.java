package org.example.simplenetwork2;

import java.util.ArrayList;
import java.util.Random;

public class Messages {


    private final ArrayList<String> messages;

    public Messages() {
        messages = new ArrayList<>();
        /*
        messages.add("HelloWorld!");
        messages.add("Welcome");
        messages.add("Good Morning");
         */
        messages.add("issa is cute");

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
