package com.nicballesteros.message.server;

public class Message {
    private String message;
    private int from;
    private int to;

    Message(String message, int from, int to){
        this.message = message;
        this.from = from;
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public boolean involves(int firstID, int secondID){
        if((from == firstID && to == secondID) || (to == firstID && from == secondID)){
            return true;
        }
        else{
            return false;
        }
    }
}
