package com.example.shoppinglist2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sButton = null;
    private Context context = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sButton = findViewById(R.id.button);
        sButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(context == null){
            context = getApplicationContext();
        }

        Toast toast = Toast.makeText(context, "You clicked Save-button.", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
