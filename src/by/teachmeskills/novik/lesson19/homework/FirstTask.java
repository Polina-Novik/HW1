package by.teachmeskills.novik.lesson19.homework;

public class FirstTask  {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
        t3.start();
        try {
            t3.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        try {
            t3.join();
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}

    class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Starting " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ending " + Thread.currentThread().getName());
        }
    }

