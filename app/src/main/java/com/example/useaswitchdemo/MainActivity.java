package com.example.useaswitchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View btn_show_hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch onOffSwitch = (Switch) findViewById(R.id.on_off_switch);
        btn_show_hide   = findViewById(R.id.btn_show_hide);
        onOffSwitch.setChecked(true);
    //    btn_show_hide.setVisibility(View.VISIBLE);

        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){

                  btn_show_hide.setVisibility(View.VISIBLE);

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "The Button is Visible",
                            Toast.LENGTH_LONG);
                    toast.show();
                }else{

                    btn_show_hide.setVisibility(View.INVISIBLE);

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "The Button is Invisible",
                            Toast.LENGTH_LONG);
                    toast.show();
                }

            }

        });
    }
}
