package com.example.demo.core.mybatis.base;

import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;

public class XkBaseEntity implements Serializable {

    @TableField(exist = false)//必须要加上不然会被子类当作字段继承去
    private static final long serialVersionUID = 1L;

}
