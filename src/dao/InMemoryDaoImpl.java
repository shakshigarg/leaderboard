package dao;

import compartor.ScoreComparator;
import db.InMemoryDb;
import models.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class InMemoryDaoImpl implements Dao{
    InMemoryDb inMemoryDb=InMemoryDb.getInstance();

    @Override
    public void registerUser(User user) {
        inMemoryDb.users.put(user.getName(),user);

    }

    @Override
    public boolean isUserExists(User user) {
        if(inMemoryDb.users.containsKey(user.getName())){
            return true;
        }
        return false;
    }

    @Override
    public void addUserInSortedList(User userOb) {
        if(!inMemoryDb.countryTopUsers.containsKey(userOb.getCountry())){
            inMemoryDb.countryTopUsers.put(userOb.getCountry(),new ArrayList<>());
        }
        inMemoryDb.countryTopUsers.get(userOb.getCountry()).add(userOb);
        Collections.sort(inMemoryDb.countryTopUsers.get(userOb.getCountry()), new ScoreComparator());
    }

    @Override
    public List getKUsersCountry(String country) {
        return inMemoryDb.countryTopUsers.get(country);
    }


}
