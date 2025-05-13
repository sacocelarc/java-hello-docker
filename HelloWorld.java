public class HelloWorld {
    public static void main(String[] args) {
        while (true) {
            System.out.println("👋 Hello from Java in Docker!");
            try {
                Thread.sleep(5000); // wait 5 seconds
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
