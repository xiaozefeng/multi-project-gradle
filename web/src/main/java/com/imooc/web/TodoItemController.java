package com.imooc.web;

import com.imooc.repository.TodoItemRepository;

/**
 * @author xiaozefeng
 * @date 2018/5/4 下午1:06
 */
public class TodoItemController  {

    private TodoItemRepository todoItemRepository;

    public TodoItemRepository getTodoItemRepository() {
        return todoItemRepository;
    }

    public void setTodoItemRepository(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }
}
