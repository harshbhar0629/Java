package MultiThreading;

public class MultiThreading01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started");
        Thread.sleep(2000); // Main thread sleeping for 2s
        Thread th = Thread.currentThread();
        System.out.println(th.getName()); // main
        System.out.println(th.getPriority()); // 5 default priority in java

        // changing the name and priority
        th.setName("Harsh");
        th.setPriority(4);
        System.out.println(th.getName()); // harsh
        System.out.println(th.getPriority()); //  4
        System.out.println("Application Ended");
    }
}
