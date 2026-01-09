package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserFromSource() {
        return "User fetched from Database";
    }
}
