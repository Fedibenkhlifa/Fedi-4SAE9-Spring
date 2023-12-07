package tn.esprit.tpuniversite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TpUniversiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpUniversiteApplication.class, args);
        
    }
}
