package InMemoryRepositoryTests;

import repository.inmemory.InMemoryReportRepository;
import creational_patterns.simplefactory.Report;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryReportRepositoryTest {

    @Test
    public void testSaveAndFind() {
        InMemoryReportRepository repo = new InMemoryReportRepository();
        Report report = new Report("REP01", "U01"); //
        repo.save(report);
        assertEquals(report, repo.findById("REP01"));
    }

    @Test
    public void testDelete() {
        InMemoryReportRepository repo = new InMemoryReportRepository();
        Report report = new Report("REP01", "U01");
        repo.save(report);
        repo.deleteById("REP01");
        assertNull(repo.findById("REP01"));
    }
}

