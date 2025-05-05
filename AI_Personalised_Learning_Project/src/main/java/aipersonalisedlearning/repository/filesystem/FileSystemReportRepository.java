package aipersonalisedlearning.repository.filesystem;

import aipersonalisedlearning.creational_patterns.simplefactory.Report;
import aipersonalisedlearning.repository.ReportRepository;
import java.util.*;

public class FileSystemReportRepository implements ReportRepository {

    @Override
    public Report save(Report entity) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public Report findById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public List<Report> findAll() {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("File system storage not implemented yet.");
    }
}
