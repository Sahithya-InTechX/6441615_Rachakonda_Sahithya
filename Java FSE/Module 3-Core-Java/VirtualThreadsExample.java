public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println("Hello from virtual thread: " + Thread.currentThread());

        Thread vThread = Thread.startVirtualThread(task);

        vThread.join();
    }
}
