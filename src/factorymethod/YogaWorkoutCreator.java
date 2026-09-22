package factorymethod;

public class YogaWorkoutCreator extends WorkoutCreator {

    @Override
    public Workout createWorkout() {
        return new YogaWorkout();
    }
}