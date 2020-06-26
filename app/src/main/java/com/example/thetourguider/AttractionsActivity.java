package com.example.thetourguider;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new AttractionsFragment()).commit();
    }
}
