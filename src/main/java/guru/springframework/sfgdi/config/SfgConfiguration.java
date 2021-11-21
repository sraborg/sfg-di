package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("guru")
@Configuration
public class SfgConfiguration {

    private String username;
    private String password;
    private String JDBCUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJDBCUrl() {
        return JDBCUrl;
    }

    public void setJDBCUrl(String JDBCUrl) {
        this.JDBCUrl = JDBCUrl;
    }
}
