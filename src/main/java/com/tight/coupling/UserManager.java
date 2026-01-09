package com.tight.coupling;

public class UserManager {

//    UserDatabaseProvider userDatabaseProvider = new UserDatabaseProvider();
    UserWebServiceProvider userWebServiceProvider = new UserWebServiceProvider();

    public String getUserInfo(){
//        return userDatabaseProvider.getUserFromDatabase();
        return userWebServiceProvider.getUserFromWebService();
    }
}
