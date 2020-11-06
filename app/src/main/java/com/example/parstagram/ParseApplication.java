package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vjk3tCO1CrTYdpX7z9TNjaHeWvShJ7bATY1HqcAV")
                .clientKey("nOHAIXk35iYu1ILzv0qobSMuQmSeAC1lLVQimS6f")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
