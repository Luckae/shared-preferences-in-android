package com.books.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    public static final String MyPrefs = "mypref";
    String USERNAME;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        sharedPreferences =getSharedPreferences(MyPrefs, Context.MODE_PRIVATE);

        textView = findViewById(R.id.txt);

        textView.setText("Your username is " +sharedPreferences.getString(USERNAME, ""));
    }
}
