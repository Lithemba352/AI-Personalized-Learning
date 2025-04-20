package creational_patterns.simplefactory;

import java.util.Date;

public class Report {
    private String reportId;
    private String userId;
    private Date generatedDate;
    private String status;

    public Report(String reportId, String userId) {
        this.reportId = reportId;
        this.userId = userId;
        this.generatedDate = new Date();
        this.status = "Created";
    }

    public void generateReport() {
        System.out.println("Generating report for user: " + userId);
    }

    public void downloadReport() {
        System.out.println("Downloading report...");
    }

    @Override
    public String toString() {
        return "Report{" + "reportId='" + reportId + '\'' + ", userId='" + userId + '\'' + '}';
    }
}
