package com.example.memoryleaksimulator.tasks;

import com.example.memoryleaksimulator.services.MemoryLeakService;
import org.springframework.stereotype.Component;

@Component
public class MemoryLeakTask {

    private final MemoryLeakService memoryLeakService;

    public MemoryLeakTask(MemoryLeakService memoryLeakService) {
        this.memoryLeakService = memoryLeakService;
    }

    public void triggerMemoryLeak() {
        new Thread(memoryLeakService::processpayment).start();
    }
}
