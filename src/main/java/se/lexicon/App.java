package se.lexicon;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.lexicon.dao.AppUserDao;
import se.lexicon.dao.AppUserDaoImpl;
import se.lexicon.model.AppUser;

public class App {
    public static void main(String[] args) {

        // load xml file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        AppUserDao dao = context.getBean("appUserDao",AppUserDao.class);

        AppUser createdAppUser1 = dao.saveOrUpdate(new AppUser("Test","test.test@test.se","123456","Vaxjo"));
        System.out.println("createdAppUser = " + createdAppUser1);
        AppUser createdAppUser2 = dao.saveOrUpdate(new AppUser("Mehrdad","mehrdad.javan@lexicon.se","123456","Vaxjo"));
        System.out.println("createdAppUser = " + createdAppUser2);
        System.out.println("-------------------------");
        dao.findAll().forEach(System.out::println);
        System.out.println("-------------------------");


    }
}
