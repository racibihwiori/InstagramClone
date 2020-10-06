package com.example.instagramclone;

import android.app.Application;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class ParseApplication extends Application {


     @Override
     public void onCreate() {
         super.onCreate();
         // Register your parse models
         ParseObject.registerSubclass(Post.class);
         Parse.initialize(new Parse.Configuration.Builder(this)
                 .applicationId(getString(R.string.back4app_app_id))
                 // if defined
                 .clientKey(getString(R.string.back4app_client_key))
                 .server(getString(R.string.back4app_server_url))
                 .build()
         );

     }

 }
