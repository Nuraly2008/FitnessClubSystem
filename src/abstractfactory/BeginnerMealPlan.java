package abstractfactory;

public class BeginnerMealPlan implements MealPlan {

    @Override
    public void showMealPlan() {
        System.out.println("Beginner meal plan: balanced basic diet");
    }
}
