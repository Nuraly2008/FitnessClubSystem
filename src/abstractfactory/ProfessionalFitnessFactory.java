package abstractfactory;

public class ProfessionalFitnessFactory implements FitnessPlanFactory {

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new ProfessionalWorkoutPlan();
    }

    @Override
    public MealPlan createMealPlan() {
        return new ProfessionalMealPlan();
    }

    @Override
    public ProgressTracker createProgressTracker() {
        return new ProfessionalProgressTracker();
    }
}