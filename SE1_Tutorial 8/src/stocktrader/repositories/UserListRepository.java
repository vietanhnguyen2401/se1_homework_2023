package stocktrader.repositories;

import java.util.ArrayList;

import stocktrader.model.entities.User;

public class UserListRepository {
    private ArrayList<User> users;

    public ArrayList<User> getUserList() {
        return users;
    }

    public boolean StoreUserList() {
        if (users.isEmpty() || users == null)
            return false;
        return true;
    }
}
