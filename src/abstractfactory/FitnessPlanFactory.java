package abstractfactory;

public interface FitnessPlanFactory {
    WorkoutPlan createWorkoutPlan();
    MealPlan createMealPlan();
    ProgressTracker createProgressTracker();
}
