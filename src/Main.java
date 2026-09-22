import abstractfactory.ProfessionalFitnessFactory;
import factorymethod.CardioWorkoutCreator;
import factorymethod.StrengthWorkoutCreator;
import factorymethod.WorkoutCreator;
import factorymethod.YogaWorkoutCreator;

import abstractfactory.BeginnerFitnessFactory;
import abstractfactory.FitnessClub;
import abstractfactory.FitnessPlanFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("FACTORY METHOD");

        WorkoutCreator creator;

        creator = new CardioWorkoutCreator();
        creator.startWorkout();

        creator = new StrengthWorkoutCreator();
        creator.startWorkout();

        creator = new YogaWorkoutCreator();
        creator.startWorkout();


        System.out.println();
        System.out.println("ABSTRACT FACTORY");

        FitnessPlanFactory factory = new ProfessionalFitnessFactory();

        FitnessClub fitnessClub = new FitnessClub(factory);
        fitnessClub.showPlan();
    }
}