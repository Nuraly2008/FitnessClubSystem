package abstractfactory;

public class ProfessionalProgressTracker implements ProgressTracker {

    @Override
    public void trackProgress() {
        System.out.println("Tracking professional progress");
    }
}