package com.app.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class TodoController {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    private TodoService todoService;

    @Test
    @DisplayName("Should return list of all todos")
    void shouldReturnAllTodos() {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("Lunch", "Get lunch at 2PM"));

        when(todoService.getAllTodos()).thenReturn(todoList);
    }
}
