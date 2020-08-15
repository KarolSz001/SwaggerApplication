package com.app.controller;

import com.app.model.Worker;
import com.app.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
public class WorkerController {

    private final WorkerService workerService;

    @GetMapping
    public List<Worker> getAll() {
        return workerService.getAll();
    }

    @PostMapping
    public Worker add(@RequestBody Worker worker) {
        return workerService.add(worker);
    }
}
