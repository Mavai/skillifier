package rage.skills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkillsApplication {

    public static void main(String[] args) {
        //System.getProperties().put( "server.port", 3200 );
        SpringApplication.run(SkillsApplication.class, args);
    }
}
