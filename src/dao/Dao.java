package dao;

import models.User;

import java.util.List;

public interface Dao {

    void registerUser(User user);
    boolean isUserExists(User user);

    void addUserInSortedList(User userOb);

    List getKUsersCountry(String country);
}
