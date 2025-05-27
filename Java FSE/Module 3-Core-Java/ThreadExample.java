// Thread by extending Thread class
class MessageThread extends Thread {
    private final String message;

    public MessageThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - count " + i);
            try {
                sleep(500); // Pause for 500ms for clearer output
            } catch (InterruptedException e) {
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create two threads with different messages
        MessageThread thread1 = new MessageThread("Thread 1 running");
        MessageThread thread2 = new MessageThread("Thread 2 running");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}