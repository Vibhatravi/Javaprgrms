class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i <= 15; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        
        System.out.println("Starting Thread1...");
        thread1.start();
        
        System.out.println("Starting Thread2...");
        thread2.start();
        
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Both threads have had some time to execute.");
    }
}