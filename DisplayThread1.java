public class Main {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    static class Thread1 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Thread1");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }
    }

    static class Thread2 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Thread2");
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
            }
        }
    }
}
