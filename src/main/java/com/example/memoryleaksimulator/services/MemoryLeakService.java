package com.example.memoryleaksimulator.services;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class MemoryLeakService {

    private final Map<String, String> map = new HashMap<>();

    public void createMemoryLeak() {
        while (true) {
            map.put(generateRandomString(), generateRandomString());
            // Optional: Add some delay to control the speed of memory allocation
           /* try {
                Thread.sleep(30); // Delay for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
           
        }
    }

    private String generateRandomString() {
        // Generate a random string of large size
        return UUID.randomUUID().toString() + "-" + UUID.randomUUID().toString();
    }
}   
