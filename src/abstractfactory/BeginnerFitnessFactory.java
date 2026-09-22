package abstractfactory;

public class BeginnerFitnessFactory implements FitnessPlanFactory {

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BeginnerWorkoutPlan();
    }

    @Override
    public MealPlan createMealPlan() {
        return new BeginnerMealPlan();
    }

    @Override
    public ProgressTracker createProgressTracker() {
        return new BeginnerProgressTracker();
    }
}