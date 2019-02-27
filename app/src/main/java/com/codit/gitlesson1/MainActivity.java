package com.codit.gitlesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.codit.gitlesson1.model.Person;

public class MainActivity extends AppCompatActivity {

    Person person;
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

        person = new Person("Mykola", "Bykhkalo", 20);

        nameText.setText(person.getName());
        surnameText.setText(person.getSurname());
        ageText.setText(String.valueOf(person.getAge()));
    }
}
