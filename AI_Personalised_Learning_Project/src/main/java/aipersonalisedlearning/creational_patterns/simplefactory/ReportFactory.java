package aipersonalisedlearning.creational_patterns.simplefactory;

public class ReportFactory {
    public static Report createReport(String reportId, String userId) {
        return new Report(reportId, userId);
    }
}
