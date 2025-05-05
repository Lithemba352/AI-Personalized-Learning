import aipersonalisedlearning.creational_patterns.prototype.Recommendation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecommendationTest {

    @Test
    public void testCloneRecommendation() {
        Recommendation original = new Recommendation("R01", "U01", "C01");
        Recommendation clone = original.clone();

        // Print both objects
        System.out.println("Original Recommendation: " + original);
        System.out.println("Cloned Recommendation:   " + clone);

        // Validate clone integrity
        assertNotSame(original, clone); // different memory locations
        assertEquals(original.getContentId(), clone.getContentId()); // same data
    }
}