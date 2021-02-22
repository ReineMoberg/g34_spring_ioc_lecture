package se.lexicon;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.AppConfig;
import se.lexicon.dao.AppUserDao;
import se.lexicon.model.AppUser;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppUserDao dao = context.getBean("appUserDao", AppUserDao.class);

        AppUser createdAppUser = dao.saveOrUpdate(new AppUser("Test","test.test@test.se","12345","vaxjo"));
        System.out.println("createdAppUser = " + createdAppUser);

    }
}
