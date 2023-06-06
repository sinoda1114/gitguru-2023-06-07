import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    private static final Logger logger = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        String userInput = args.length > 0 ? args[0] : "";

        logger.info("User input is: " + userInput);
    }
}
