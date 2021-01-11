import java.util.LinkedHashMap;
import java.util.Map;


// first version using LinkedHashMap;
class LRUCache {

    public LinkedHashMap<Integer, Integer> pairs;
    public LRUCache(int capacity) {
        pairs = new LinkedHashMap<Integer, Integer>(capacity, 1, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
       return pairs.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        pairs.put(key,value);
    }
}

// Second version using double linked list for ordering and HashMap for O(1) "get" and "put" operations.

package com.sgusache;
import java.util.HashMap;

class LRUCache {
    public class Node {
        int val;
        int key;

        Node next;
        Node prev;

        Node(){}




        Node(int key, int val, Node next, Node prev) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;
    public int capacity;
    public HashMap<Integer, Node> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        map = new HashMap<Integer, Node>(capacity);

    }

    public int get(int key) {
        int result = -1;
        Node node = map.get(key);
        if(node != null){
            result = node.val;
            remove(node);
            add(node);
        }
        return result;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(node != null){
            remove(node);
            node.val = value;
            add(node);
        }else{
            if(map.size() == capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;
            map.put(key, new_node);
            add(new_node);
        }
    }

    public void add(Node node){
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void remove(Node node){
        Node next_node = node.next;
        Node prev_node = node.prev;
        next_node.prev = node.prev;
        prev_node.next = node.next;
    }
}