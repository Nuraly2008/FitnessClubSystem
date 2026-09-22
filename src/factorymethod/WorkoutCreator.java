package factorymethod;

public abstract class WorkoutCreator {

    public abstract Workout createWorkout();

    public void startWorkout() {
        Workout workout = createWorkout();
        workout.start();
    }
}
