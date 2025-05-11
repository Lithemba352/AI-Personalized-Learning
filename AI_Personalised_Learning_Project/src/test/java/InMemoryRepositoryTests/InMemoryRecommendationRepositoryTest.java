// package InMemoryRepositoryTests;

// import aipersonalisedlearning.repository.inmemory.InMemoryRecommendationRepository;
// import aipersonalisedlearning.creational_patterns.prototype.Recommendation;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// public class InMemoryRecommendationRepositoryTest {

//     @Test
//     public void testSaveAndFind() {
//         InMemoryRecommendationRepository repo = new InMemoryRecommendationRepository();
//         Recommendation recommendation = new Recommendation("R01", "Based on Java interest", "U01");
//         repo.save(recommendation);
//         assertEquals(recommendation, repo.findById("R01"));
//     }

//     @Test
//     public void testDelete() {
//         InMemoryRecommendationRepository repo = new InMemoryRecommendationRepository();
//         Recommendation recommendation = new Recommendation("R01", "Based on Java interest", "U01");
//         repo.save(recommendation);
//         repo.deleteById("R01");
//         assertNull(repo.findById("R01"));
//     }
// }
