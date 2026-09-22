package abstractfactory;

public class BeginnerProgressTracker implements ProgressTracker {

    @Override
    public void trackProgress() {
        System.out.println("Tracking beginner progress");
    }
}
