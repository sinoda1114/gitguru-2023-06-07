import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jVulnerabilityExample {
    private static final Logger logger = LogManager.getLogger(Log4jVulnerabilityExample.class);

    public static void main(String[] args) {
        String userInput = args.length > 0 ? args[0] : "";

        // Logging user input without proper validation or sanitization
        logger.info(userInput);
    }
}
