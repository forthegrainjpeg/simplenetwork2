package org.example.simplenetwork2;

import java.util.ArrayList;
import java.util.Random;

public class Messages {


    private final ArrayList<String> messages;
    private final ArrayList<String> noMessages;
    public int noClickCounter = 0;
    private State state;

    public Messages() {

        state = new State();

        System.out.println(state.getCurrentState());

        messages = new ArrayList<>();
        noMessages = new ArrayList<>();

        noMessages.add("Wait really?");
        noMessages.add("stop you are joking!!");
        noMessages.add("Okay this isnt funny anymore!!!");
        noMessages.add("Okay, i see how you feel :(");

        messages.add("good!");
        messages.add("me too!");
        messages.add("yay!!!");
        messages.add("Somebody once told me the world is gonna roll me\n" +
                "I ain't the sharpest tool in the shed\n" +
                "She was looking kind of dumb with her finger and her thumb\n" +
                "In the shape of an \"L\" on her forehead\n" +
                "Well, the years start comin' and they don't stop comin'\n" +
                "Fed to the rules and I hit the ground runnin'\n" +
                "Didn't make sense not to live for fun\n" +
                "Your brain gets smart, but your head gets dumb\n" +
                "So much to do, so much to see\n" +
                "So, what's wrong with taking the backstreets?\n" +
                "You'll never know if you don't go (go)\n" +
                "You'll never shine if you don't glow\n" +
                "Hey now, you're an all-star\n" +
                "Get your game on, go play\n" +
                "Hey now, you're a rock star\n" +
                "Get the show on, get paid\n" +
                "(And all that glitters is gold)\n" +
                "Only shootin' stars break the mold\n" +
                "It's a cool place, and they say it gets colder\n" +
                "You're bundled up now, wait 'til you get older\n" +
                "But the meteor men beg to differ\n" +
                "Judging by the hole in the satellite picture\n" +
                "The ice we skate is gettin' pretty thin\n" +
                "The water's gettin' warm, so you might as well swim\n" +
                "My world's on fire, how 'bout yours?\n" +
                "That's the way I like it, and I'll never get bored\n" +
                "Hey now, you're an all-star\n" +
                "Get your game on, go play\n" +
                "Hey now, you're a rock star\n" +
                "Get the show on, get paid\n" +
                "(All that glitters is gold)\n" +
                "Only shootin' stars break the mold\n" +
                "Go for the moon\n" +
                "(Go, go, go) go for the moon\n" +
                "(Go, go, go) go for the moon\n" +
                "Go (go), go for the moon\n" +
                "Hey now, you're an all-star\n" +
                "Get your game on, go play\n" +
                "Hey now, you're a rock star\n" +
                "Get the show on, get paid\n" +
                "(And all that glitters is gold)\n" +
                "Only shooting stars\n" +
                "Somebody once asked, \"Could I spare some change for gas?\n" +
                "I need to get myself away from this place\"\n" +
                "I said, \"Yep, what a concept, I could use a little fuel myself\n" +
                "And we could all use a little change\"\n" +
                "Well, the years start comin' and they don't stop comin'\n" +
                "Fed to the rules and I hit the ground runnin'\n" +
                "Didn't make sense not to live for fun\n" +
                "Your brain gets smart, but your head gets dumb\n" +
                "So much to do, so much to see\n" +
                "So, what's wrong with taking the backstreets?\n" +
                "You'll never know if you don't go (go!)\n" +
                "You'll never shine if you don't glow\n" +
                "Hey now, you're an all-star\n" +
                "Get your game on, go play\n" +
                "Hey now, you're a rock star\n" +
                "Get the show on, get paid\n" +
                "(And all that glitters is gold)\n" +
                "Only shootin' stars break the mold\n" +
                "Only shootin' stars break the mold\n" +
                "Go for the moon\n" +
                "Go for the moon\n" +
                "Go for the moon\n" +
                "This is how we do it");
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

//    public String getNextNoMessage() {    depreciated
//        String returnMessage = "";
//
//        while (true) {
//            if (noClickCounter < 4) {
//                returnMessage = noMessages.get(noClickCounter);
//                ++noClickCounter;
//                return returnMessage;
//            }
//            if (noClickCounter == 4) {
//                noClickCounter = 0;
//                return "okay, lets try this again.";
//            }
//        }
//    }
//
    public String getNextStateMessage() {
        /*
        changes both the state and the message that is linked to the state, note the
        print statements for testing what state the user is currently in
         */

        String returnMessage = "";

        while (true) {
            if (state.getCurrentState() < 4) {
                returnMessage = noMessages.get(state.getCurrentState());
                state.advanceState();
                System.out.println(state.getCurrentState());
                return returnMessage;
            }
            if (state.getCurrentState() == 4) {
                state.resetState();
                System.out.println(state.getCurrentState());
                return "okay, lets try this again.";
            }
        }
    }



}
