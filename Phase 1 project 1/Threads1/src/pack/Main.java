package pack;
class Main1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread using extends: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Main1 thread = new Main1();
        thread.start();
    }
}
