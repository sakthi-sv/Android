package com.example.hp.workoutadvicer;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkoutActivity extends Activity {

    private WorkoutExpert expert=new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);

    }

    public void onClickFindWorkout(View view){
        TextView workouts=(TextView)findViewById(R.id.workout);

        Spinner workouttype=(Spinner)findViewById(R.id.workouttype);

        String workout=String.valueOf(workouttype.getSelectedItem());

      //  workouts.setText(workout);
        List<String> workoutlist = expert.getWorkouts(workout);

        StringBuilder workoutformatted =new StringBuilder();

        for(String work : workoutlist){
            workoutformatted.append(work).append('\n');
        }
        workouts.setText(workoutformatted);
    }


}
