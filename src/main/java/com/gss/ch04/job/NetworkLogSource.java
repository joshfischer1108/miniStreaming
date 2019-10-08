package com.gss.ch04.job;

import com.gss.ch04.api.Event;
import com.gss.ch04.api.Source;

import java.util.List;

public class NetworkLogSource extends Source {

    public NetworkLogSource(String name, int parallelism, int port) {
        super(name,parallelism);
    }


    @Override
    public void setupInstance(int instance) {

    }

    @Override
    public void getEvents(List<Event> eventCollector) {

    }
}
