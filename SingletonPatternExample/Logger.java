/*You need to ensure that a logging utility class in your application has only one i
nstance throughout the application lifecycle to ensure consistent logging.*/
public class Logger {
    private static Logger instance;
    private Logger() {
        System.out.println("Logger instance created.");
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

