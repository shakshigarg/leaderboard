package service;

import dao.Dao;
import dao.InMemoryDaoImpl;
import exceptions.UserAlreadyExists;
import models.User;

import java.util.List;

public class LeaderBoardService {
    Dao daoImpl=new InMemoryDaoImpl();

    public void registerUser(String user, String country, int score) throws UserAlreadyExists {
        User userOb= new User(score, user, country);
        if(!daoImpl.isUserExists(userOb)){
            daoImpl.registerUser(userOb);
            daoImpl.addUserInSortedList(userOb);
            return;
        }
        throw new UserAlreadyExists("User Already Registered!");
    }

    public void getUserCountry(String country, int k) {
        List users=daoImpl.getKUsersCountry(country);
        for(int i=0;i<k && i<users.size();i++){
            System.out.println(users.get(i));
        }
    }
}


