package com.app.service;

import com.app.model.Worker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerService {
    private final List<Worker> workers = new ArrayList<>();

    public Worker add(Worker worker) {
        workers.add(worker);
        return worker;
    }

    public List<Worker> getAll() {
        return workers;
    }

    public Worker getOne(String name) {
        return workers
                .stream()
                .filter(worker -> worker.getName().equals(name))
                .findFirst()
                .orElseThrow();
    }
}
