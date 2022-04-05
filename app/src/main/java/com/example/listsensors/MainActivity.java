package com.example.listsensors;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.text1);
        sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> mlist=sensorManager.getSensorList(Sensor.TYPE_ALL);
        for(int i=1;i<mlist.size();i++)
        {textView.append("\n"+mlist.get(i).getName());

        }
    }
}