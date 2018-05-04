package com.imooc.repository;

import com.imooc.model.TodoItem;

import java.util.List;

/**
 * Repository
 *
 * @author xiaozefeng
 * @date 2018/5/4 下午1:03
 */
public interface TodoItemRepository {

    /**
     * findAll
     * @return
     */
    List<TodoItem> findAll();
}
