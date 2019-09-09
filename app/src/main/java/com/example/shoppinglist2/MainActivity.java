package com.example.shoppinglist2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sButton = null;
    private Context context = null;
    private List shoppinglist = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sButton = findViewById(R.id.button);
//        sButton.setOnClickListener(this);
        // Save
        findViewById(R.id.button).setOnClickListener(this);
        // Done
        findViewById(R.id.button2).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        EditText eEditText = findViewById(R.id.editText2);
        int textlength = eEditText.getText().length();

        if(context == null){
            context = getApplicationContext();
        }

        if (id == R.id.button) {
            if (textlength < 3 || textlength > 15) {
                Toast toast = Toast.makeText(context, "Text length should be between 3 and 15 characters.", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
            else {
                shoppinglist.add(eEditText.getText());
                Toast toast = Toast.makeText(context, eEditText.getText() + " added to shoppinglist.", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }

        }
        if (id == R.id.button2) {

        }
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
