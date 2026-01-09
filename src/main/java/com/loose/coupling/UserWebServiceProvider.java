package com.loose.coupling;

public class UserWebServiceProvider implements UserDataProvider{

    @Override
    public String getUserFromSource() {
        return "User fetched from Web Service";
    }
}
