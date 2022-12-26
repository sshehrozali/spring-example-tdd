package com.app.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    public List<Todo> getAllTodos() {
        return new ArrayList<>();
    }
}
