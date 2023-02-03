package com.example.oop;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yuanyao
 * @Date 2022/9/16
 */
public class HashMapTest {
    public static void main(String[] args) {
        Result error = new Result("400", "error");
        System.out.println(error);
    }
}

class Result extends HashMap<String, Object> {

    public Result(String code, String message, Object o) {
        super.put("code", code);
        super.put("message", message);
        super.put("data", o);

    }

    public Result(String code, String message) {
        super.put("code", code);
        super.put("message", message);
    }
}

class Node<K, V> implements Map.Entry<K, V> {

    final int hash;
    final K key;
    V value;
    Node<K, V> next;

    public Node(int hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        return this.value = value;
    }
}