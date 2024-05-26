package db;

import models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class InMemoryDb {
    public HashMap<String, User> users = new HashMap<>();
    public HashMap<String, List<User>> countryTopUsers = new HashMap<>();
    private static InMemoryDb inMemoryDb = new InMemoryDb();

    private InMemoryDb() {

    }

    public static InMemoryDb getInstance() {
        return inMemoryDb;
    }


}
