package com.imooc.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class TodoItemTest {

    @Test
    public void test(){
        TodoItem todoItem = new TodoItem();
        todoItem.setName("eat");
        todoItem.setHasDone(false);
        log.info("{}",todoItem);
    }
}