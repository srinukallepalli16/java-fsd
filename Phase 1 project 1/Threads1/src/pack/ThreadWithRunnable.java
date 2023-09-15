package pack;



class ImplementRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread using implements: " + i);
        }
    }
    
    public static void main(String[] args) {
        ImplementRunnable runnable = new ImplementRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}


