package abstractfactory;

public class ProfessionalMealPlan implements MealPlan {

    @Override
    public void showMealPlan() {
        System.out.println("Professional meal plan: high-performance diet");
    }
}
