import creational_patterns.simplefactory.Report;
import creational_patterns.simplefactory.ReportFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReportFactoryTest {

    @Test
    public void testReportCreation() {
        Report report = ReportFactory.createReport("R01", "U01");
        assertNotNull(report);
    }

    @Test
    public void testReportMethods() {
        Report report = ReportFactory.createReport("R02", "U02");
        assertDoesNotThrow(report::generateReport);
        assertDoesNotThrow(report::downloadReport);
    }
}
