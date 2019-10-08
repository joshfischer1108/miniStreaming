package com.gss.ch04.job;

import com.gss.ch04.api.Job;
import com.gss.ch04.api.ShuffleGrouping;
import com.gss.ch04.api.Stream;

public class NetworkMonitoringJob {

    public static void main(String[] args) {
        Job job = new Job("network_monitoring_job");

        Stream bridgeStream = job.addSource(new NetworkLogSource("network-log-source", 1, 9990));
        bridgeStream.applyOperator(new RequestOriginRetriever("booth", 1, new ShuffleGrouping()));
        bridgeStream.applyOperator(new LanguageDetector("language-detector", 1, new ShuffleGrouping()));

        System.out.println("This is a streaming job that simulates reading from a network log file");
        job.run();

    }
}
