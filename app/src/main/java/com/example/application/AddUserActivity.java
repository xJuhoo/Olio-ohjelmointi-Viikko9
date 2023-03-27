package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private String degreeProgram;
    private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstName = findViewById(R.id.firstNameInput);
        lastName = findViewById(R.id.lastNameInput);
        email = findViewById(R.id.emailInput);
    }

    public void addUser(View view) {
        RadioGroup rgDegreeProgramType = findViewById(R.id.degreeProgramInput);

        switch (rgDegreeProgramType.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                degreeProgram = "Tietotekniikka";
                break;
            case R.id.rbTuotantotalous:
                degreeProgram = "Tuotantotalous";
                break;
            case R.id.rbLaskennallinenTekniikka:
                degreeProgram = "Laskennallinen tekniikka";
                break;
            case R.id.rbSahkotekniikka:
                degreeProgram = "Sähkötekniikka";
                break;
        }

        RadioGroup rgProfilePictureType = findViewById(R.id.profilePictureInput);

        switch (rgProfilePictureType.getCheckedRadioButtonId()) {
            case R.id.rbFireIcon:
                image = R.drawable.fire_icon;
                break;
            case R.id.rbStarIcon:
                image = R.drawable.star_icon;
                break;
            case R.id.rbDiamondIcon:
                image = R.drawable.diamond_icon;
                break;
        }
        User user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degreeProgram, image);
        UserStorage.getInstance().addUser(user);
    }
}