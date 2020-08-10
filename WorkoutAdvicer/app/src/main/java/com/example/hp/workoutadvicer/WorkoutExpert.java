package com.example.hp.workoutadvicer;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List <String> getWorkouts(String workouttypes){
        List<String> workout=new ArrayList<String>();

        if(workouttypes.equals("Chest")){
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if(workouttypes.equals("Biceps")){
             workout.add("Bicep curls");
             workout.add("Cable Flys");
        }
        if(workouttypes.equals("triceps")){
            workout.add("Tricep Ext");
            workout.add("Tricep Pushdown");
        }
        if(workouttypes.equals("Shoulder")){
            workout.add("Shoulder Press");
            workout.add("Cable Flys");
        }
        return workout;
    }
}
