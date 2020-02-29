package basicthreads;
/**
 * Aaron Foote
 * peforms check for mail and calendar
 */

import java.util.concurrent.locks.ReentrantLock;


public class PerformSystemCheck implements Runnable {

    private String checkWhat;

    ReentrantLock lock = new ReentrantLock();

    public PerformSystemCheck(String checkWhat) {

    this.checkWhat = checkWhat;

    } //end of PerformSystemCheck()

    public void run() {
    lock.lock();

    System.out.println("Checking " + this.checkWhat);

    lock.unlock();

    }//end void run()


}//end of class PerformSystemCheck
