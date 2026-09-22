package abstractfactory;

public class FitnessClub {

    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;
    private ProgressTracker progressTracker;

    public FitnessClub(FitnessPlanFactory factory) {
        workoutPlan = factory.createWorkoutPlan();
        mealPlan = factory.createMealPlan();
        progressTracker = factory.createProgressTracker();
    }

    public void showPlan() {
        workoutPlan.showWorkoutPlan();
        mealPlan.showMealPlan();
        progressTracker.trackProgress();
    }
}