package se.lexicon.dao;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.lexicon.config.AppConfig;
import se.lexicon.model.AppUser;

@RunWith(SpringJUnit4ClassRunner.class) //Indicates that the class should use Spring’s JUnit facilities
@ContextConfiguration(classes = {AppConfig.class}) //Indicates which resources to configure the ApplicationContext with
public class AppUserDaoTest {

    @Autowired
    AppUserDao testObject;


    @Test
    public void test_save() {
        AppUser expected = new AppUser(1, "Test", "test.test@test.se", "12345", "Vaxjo");
        AppUser actual = testObject.saveOrUpdate(new AppUser("Test", "test.test@test.se", "12345", "Vaxjo"));
        assertEquals(expected, actual);
    }

    @Test
    public  void test_findById(){
       AppUser createdUser = testObject.saveOrUpdate(new AppUser("Test", "test.test@test.se", "12345", "Vaxjo"));
       AppUser createdUser2 = testObject.saveOrUpdate(new AppUser("Test", "test.test@test.se", "12345", "Vaxjo"));
        int actualId = createdUser.getUserId();
        int actualId2 = createdUser2.getUserId();
        int expectedId = 1;
        int expectedId2 = 2;
        assertEquals(actualId,expectedId);
        assertEquals(actualId2,expectedId2);
    }

    // implements test for all methods

}
