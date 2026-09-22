package factorymethod;

public class CardioWorkout implements Workout {

    @Override
    public void start() {
        System.out.println("Starting cardio workout");
    }
}