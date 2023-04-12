package Belajar.java.now.data;

public class Application {

    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses class application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
