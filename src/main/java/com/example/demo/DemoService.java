package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class DemoService {
    public String getFrameworkName() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Spring Boot");
        arrayList.add("Laravel");
        arrayList.add("NestJs");
        arrayList.add("Django");

        Random random = new Random();

        int randomItem = random.nextInt(arrayList.size());
        return arrayList.get(randomItem);
    }
}
