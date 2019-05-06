package com.xxm.entity.po;

/**
 * ClassName Test
 * Deseription 测试mybatis
 * Autor wangpengxiang
 * Date 2019/5/6 22:57
 */
public class Test {
    private Long id;
    private String test1;
    private String test2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public Test(Long id, String test1, String test2) {
        this.id = id;
        this.test1 = test1;
        this.test2 = test2;
    }

    public Test() {
    }
}
