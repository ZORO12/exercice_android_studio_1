package com.example.myexercice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText inputName;
    TextView resultMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.inputName);
        resultMessage = findViewById(R.id.resultText);
    }

    public void sayHello(View view) {
        String name = inputName.getText().toString().trim();

        if (!name.isEmpty()) {
            String feedback = "Hello Back " + name;
            resultMessage.setText(feedback);
        } else {
            resultMessage.setText("Please enter your name.");
        }
    }
}
