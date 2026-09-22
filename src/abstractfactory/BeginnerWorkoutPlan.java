package abstractfactory;

public class BeginnerWorkoutPlan implements WorkoutPlan {

    @Override
    public void showWorkoutPlan() {
        System.out.println("Beginner workout plan: light exercises");
    }
}