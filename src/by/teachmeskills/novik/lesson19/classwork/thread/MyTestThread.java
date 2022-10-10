package by.teachmeskills.novik.lesson19.classwork.thread;

public class MyTestThread extends Thread{
    //you can make streams amount (of streams) of nucleus +1

    @Override
    public void run() { //alt insert, run
      //  this.setName("My super thread");
        System.out.println("Our thread started!!!!!!!!!! " + this.getName()); //name of steam, or thread
        try {
            Thread.sleep(2000); //help to keep threads in a row
        } catch (InterruptedException e) {

        }
        System.out.println("Our thread finished!!!!!!!!!! " + this.getName());
    }
}
