package com.map4d.notifyappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    private String DeviceToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getToken();
    }
    public void getToken(){
        FirebaseMessaging.getInstance().subscribeToTopic("vnbus");
        DeviceToken = FirebaseInstanceId.getInstance().getToken();
        Log.e("ahcajc",""+DeviceToken);
    }
}
