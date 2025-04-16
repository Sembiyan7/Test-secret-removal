public class HelloWorld {

    // Method to print a greeting message
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    public void saySecret() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Message: " + i);
        }
        String secret = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println("This is a secret message: " + secret);
    }
}
