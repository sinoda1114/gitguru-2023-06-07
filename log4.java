import org.apache.log4j.Logger;

public class Log4jVulnerability {
    static final Logger logger = Logger.getLogger(Log4jVulnerability.class);

    public static void main(String[] args) {
        String userSuppliedString = args.length > 0 ? args[0] : "";

        // This line could potentially execute malicious code
        logger.info("User supplied string: " + userSuppliedString);
    }
}
