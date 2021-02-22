package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.dao.AppUserDao;
import se.lexicon.dao.AppUserDaoImpl;

@Configuration
public class AppConfig {

    @Bean("appUserDao")
    public AppUserDao appUserDao(){
        return new AppUserDaoImpl();
    }

}
