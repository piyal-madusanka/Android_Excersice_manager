package com.example.workoutadviser;


import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {

    List<String> getWorkouts(String workoutTypes){

        List <String> newWorkouts=new ArrayList<String>();
        if(workoutTypes.equals("Chest")){
            newWorkouts.add("Bench press");
            newWorkouts.add("push ups");
        }else if(workoutTypes.equals("Biceps")){
            newWorkouts.add("Bicep ext");
            newWorkouts.add("bicep push ups");
        }else if(workoutTypes.equals("Shoulder")){
            newWorkouts.add("Shoulder press");
        }else if(workoutTypes.equals("legs")){
            newWorkouts.add("leg press");
        }
return newWorkouts;
}


}
