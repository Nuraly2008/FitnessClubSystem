package abstractfactory;

public class ProfessionalWorkoutPlan implements WorkoutPlan {

    @Override
    public void showWorkoutPlan() {
        System.out.println("Professional workout plan: intensive training");
    }
}
