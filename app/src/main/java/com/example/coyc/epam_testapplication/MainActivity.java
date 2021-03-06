package com.example.coyc.epam_testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.btnSayHello);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.tv_msg);

                toast = Toast.makeText(getApplicationContext(), R.string.toast_msg, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, -50);
                toast.show();
            }
        });
    }
}
