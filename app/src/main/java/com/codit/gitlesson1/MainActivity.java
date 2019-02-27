package com.codit.gitlesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameText;
    TextView surnameText;
    TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        nameText = findViewById(R.id.name_text);
        surnameText = findViewById(R.id.surname_text);
        ageText = findViewById(R.id.age_text);
    }
}
