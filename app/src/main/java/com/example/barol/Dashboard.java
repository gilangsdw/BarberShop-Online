package com.example.barol;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    TextView usernameView, namaView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }
}