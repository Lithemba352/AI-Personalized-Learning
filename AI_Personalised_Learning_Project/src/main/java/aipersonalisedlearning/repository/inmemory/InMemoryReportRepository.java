package aipersonalisedlearning.repository.inmemory;

import aipersonalisedlearning.creational_patterns.simplefactory.Report;
import aipersonalisedlearning.repository.ReportRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryReportRepository implements ReportRepository {
    private final Map<String, Report> storage = new HashMap<>();

    @Override
    public Report save(Report entity) {
        storage.put(entity.getReportId(), entity); // Requires getReportId()
        return entity;
    }

    @Override
    public Report findById(String id) {
        return storage.get(id);
    }

    @Override
    public List<Report> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void deleteById(String id) {
        storage.remove(id);
    }
}
