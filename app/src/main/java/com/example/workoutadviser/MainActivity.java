package com.example.workoutadviser;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private WorkoutExpert obj=new WorkoutExpert();
    public void WorkoutOnClick(View wiew){
        TextView workout=(TextView) findViewById(R.id.textview);
        Spinner worktype=(Spinner) findViewById(R.id.worktype);
        String work=String.valueOf(worktype.getSelectedItem());
        List <String> works=obj.getWorkouts(work);
        StringBuilder format=new StringBuilder();
        for(String workli:works){
            format.append(workli).append("\n");
        }
        workout.setText(format);
    }
}
