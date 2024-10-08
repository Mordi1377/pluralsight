public class ForLoop {
        public static void main(String[] args) {
            try {
                for (int i = 10; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000); // Pause for 1 second
                }
                System.out.println("Launch!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

