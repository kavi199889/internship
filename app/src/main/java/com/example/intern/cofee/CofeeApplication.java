package com.example.intern.cofee;

import android.app.Application;
/** A subclass of the Application class to hold a single instance of the Repo class */
public class CofeeApplication extends Application {
    CofeeRepository repo = new CofeeRepository(this);

    public CofeeRepository getRepo() {
        return repo;
    }
}
