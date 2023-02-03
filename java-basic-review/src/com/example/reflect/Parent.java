package com.example.reflect;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class Parent {
    public String publicField = "parent_publicField";
    protected String protectField = "parent_protectField";
    String defaultField = "parent_defaultField";
    private String privateField = "parent_privateField";

}

class Son extends Parent {
}