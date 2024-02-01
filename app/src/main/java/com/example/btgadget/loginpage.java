package com.example.btgadget;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btgadget.HomeFragment;
import com.example.btgadget.R;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        // Assuming you have a login button with the id "loginButton"
        Button loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to MainActivity and HomeFragment
                navigateToMainActivity();
            }
        });
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(loginpage.this, MainActivity.class);
        startActivity(intent);
        finish(); // Close the login page so it's not in the back stack
    }
}
