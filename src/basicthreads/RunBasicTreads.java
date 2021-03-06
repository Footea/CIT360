package basicthreads;

/**
 * Aaron Foote
 * runs thread pool checking system time, checks mail and calendar in event pool
 */

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;


public class RunBasicTreads  {

    public static void main(String[] args){

    addThreadsToPool();

    }//end of static void main

    public static void addThreadsToPool() {

        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(7);

        eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 1, 3, SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 2, 4, SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Facebook"), 3, 5, SECONDS);

        System.out.println("Number of Threads: " + Thread.activeCount());
        Thread[] listOfThreads = new Thread[Thread.activeCount()];

        Thread.enumerate(listOfThreads);

        for(Thread i : listOfThreads) {
            System.out.println(i.getName());
        } //end for listOfThreads



        // This allows the above threads to run for approximately 20 seconds

        try{
            Thread.sleep(20000);
        }
        catch(InterruptedException e)
        {}

        // Shuts down all threads in the pool
         eventPool.shutdown();


    }//end of addThreadsToPool()
}//end of class RunBasicTreads
