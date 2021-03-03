package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aoPYsxAjlur8crKrrLVeKX14YZlPQ0qtiYdoxfXN")
                .clientKey("TPRRmhIwyhM9q7Mb6Hb1goT5nAz31Cwq0dakc32O")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
