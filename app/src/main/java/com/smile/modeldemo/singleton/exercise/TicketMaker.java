package com.smile.modeldemo.singleton.exercise;

/**
 * Created by Administrator on 2018/2/7    14:31
 */

public class TicketMaker {
    private int ticket = 1000;

    private TicketMaker() {
    }

    private static TicketMaker ticketMaker = new TicketMaker();

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

}
