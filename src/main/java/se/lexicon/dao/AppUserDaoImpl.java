package se.lexicon.dao;

import se.lexicon.dao.sequencer.AppUserSequencer;
import se.lexicon.model.AppUser;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class AppUserDaoImpl implements AppUserDao{

    private Set<AppUser> appUsers= new HashSet<>();

    @Override
    public AppUser saveOrUpdate(AppUser appUser) {
        if (appUser.getUserId() == 0){
            appUser.setUserId(AppUserSequencer.nextAppUserId());
            appUsers.add(appUser);
        }else{
            AppUser original = findById(appUser.getUserId());
            original.setName(appUser.getName());
            original.setPassword(appUser.getPassword());
            original.setEmail(appUser.getEmail());
            original.setAddress(appUser.getAddress());
        }
        return appUser;
    }

    @Override
    public AppUser findById(int id) {
        if (id == 0){
            throw  new IllegalArgumentException("Id should not be null");
        }
       /*Optional<AppUser> result = appUsers.stream().filter(appUser -> appUser.getUserId() == id).findFirst();
        if (result.isPresent()){
            return result.get();
        }else {
            return null;
        }
        */
        return appUsers.stream().filter(appUser -> appUser.getUserId() == id).findFirst().orElse(null);
    }

    @Override
    public boolean delete(int id) {
        return appUsers.removeIf(appUser -> appUser.getUserId() == id);
    }

    @Override
    public Set<AppUser> findAll() {
        return appUsers;
    }
}
