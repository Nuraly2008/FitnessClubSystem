package factorymethod;

public class CardioWorkoutCreator extends WorkoutCreator {

    @Override
    public Workout createWorkout() {
        return new CardioWorkout();
    }
}
