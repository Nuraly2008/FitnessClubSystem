package factorymethod;

public class StrengthWorkoutCreator extends WorkoutCreator {

    @Override
    public Workout createWorkout() {
        return new StrengthWorkout();
    }
}