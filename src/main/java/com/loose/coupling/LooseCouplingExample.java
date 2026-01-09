package com.loose.coupling;

public class LooseCouplingExample {
    static void main() {

        UserDataProvider userDataProviderFromWebService = new UserWebServiceProvider();
        UserManager userManagerFromWebService = new UserManager(userDataProviderFromWebService);

        UserDataProvider userDataProviderFromDatabase = new UserDatabaseProvider();
        UserManager userManagerFromDatabase = new UserManager(userDataProviderFromDatabase);

        System.out.println(userManagerFromWebService.getUserInfo());
        System.out.println(userManagerFromDatabase.getUserInfo());
    }
}
