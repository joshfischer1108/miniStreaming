package com.gss.ch04.job;


import com.gss.ch04.api.IGroupingStrategy;
import com.gss.ch04.api.Event;
import com.gss.ch04.api.Operator;

import java.util.List;

public class RequestOriginRetriever extends Operator {

    public RequestOriginRetriever(String name, int parallelism, IGroupingStrategy grouping) {
        super(name, parallelism, grouping);
    }

    @Override
    public void setupInstance(int instance) {

    }

    @Override
    public void apply(Event event, List<Event> eventCollector) {

    }
}
