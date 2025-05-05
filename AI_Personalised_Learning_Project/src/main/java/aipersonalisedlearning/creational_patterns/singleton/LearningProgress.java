package aipersonalisedlearning.creational_patterns.singleton;

public class LearningProgress {
    private static LearningProgress instance;

    private LearningProgress() {}

    public static synchronized LearningProgress getInstance() {
        if (instance == null) {
            instance = new LearningProgress();
        }
        return instance;
    }

    public void trackProgress(String userId) {
        System.out.println("Tracking learning progress for user: " + userId);
    }
}
