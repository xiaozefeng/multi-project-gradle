package com.imooc.model;

import lombok.Data;
import lombok.Getter;

/**
 *
 * @author xiaozefeng
 * @date 2018/5/4 下午1:00
 */
@Data
public class TodoItem {
    private String name;

    private boolean hasDone;

}
