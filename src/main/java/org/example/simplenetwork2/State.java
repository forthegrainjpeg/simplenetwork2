package org.example.simplenetwork2;

public class State {
    private int currentState;

    public State() {
        currentState = 0;
    }

    public int getCurrentState() {
        // returns the current state of the website
        return currentState;
    }

    public void advanceState() {
        // for each time this method is invoked, advance state
        // by 1
        currentState++;
    }

    public void resetState() {
        // resets the State back to 0,duh
        currentState = 0;
    }


}
