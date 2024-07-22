package com.example.memoryleaksimulator.controllers;

import com.example.memoryleaksimulator.tasks.MemoryLeakTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoryLeakController {

    private final MemoryLeakTask memoryLeakTask;

    public MemoryLeakController(MemoryLeakTask memoryLeakTask) {
        this.memoryLeakTask = memoryLeakTask;
    }

    @GetMapping("/memory-leak")
    public String triggerMemoryLeak() {
        memoryLeakTask.triggerMemoryLeak();
        return "Memory leak task started.";
    }
}
