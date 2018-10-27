package com.example.android.playingwithdesigner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.android.playingwithdesigner.R.layout.note_layout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(note_layout);
    }
}
