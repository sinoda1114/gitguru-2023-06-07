import java.util.HashMap;

public class SensitiveDataExposure {
    // This HashMap should represent user data including sensitive data like password
    private HashMap<String, String> userData = new HashMap<>();

    public SensitiveDataExposure(String username, String password) {
        this.userData.put("username", username);
        this.userData.put("password", password);
    }

    public String getPassword() {
        return this.userData.get("password");
    }
}
