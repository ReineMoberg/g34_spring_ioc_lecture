package se.lexicon.dao;

import se.lexicon.model.AppUser;

import java.util.Set;

public interface AppUserDao {

    AppUser saveOrUpdate(AppUser appUser);

    AppUser findById(int id);

    boolean delete(int id);

    Set<AppUser> findAll();


}
