import creational_patterns.singleton.LearningProgress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LearningProgressTest {

    @Test
    public void testSingletonInstance() {
        LearningProgress instance1 = LearningProgress.getInstance();
        LearningProgress instance2 = LearningProgress.getInstance();
        assertSame(instance1, instance2, "Singleton instances should be the same");
    }

    @Test
    public void testTracking() {
        LearningProgress tracker = LearningProgress.getInstance();
        assertDoesNotThrow(() -> tracker.trackProgress("U001"));
    }
}
