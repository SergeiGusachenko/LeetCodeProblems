package MyLinkedList;

package com.sgusache;

class MyLinkedList {

    public class Node {
        int val;
        Node next;
        Node prev;

        Node(){}
        Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
        Node( int val, Node next, Node prev) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    int size;
    int value;
    Node tail;
    Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        tail = new Node();
        head = new Node();
        head.next = tail;
        tail.prev = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int result = -1;
        Node p = head.next;
        while(p != tail){
            if(index == 0)
                return p.val;
            p = p.next;
            index = index - 1;
        }
        return result;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;
        head.next = node;
        node.prev = head;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        Node tail_prev = tail.prev;
        node.prev = tail_prev;
        tail_prev.next = node;
        tail.prev = node;
        node.next = tail;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node p = head.next;
        if(index > size)
            return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        while(p.next != tail ){
            if(index == 1)
            {
                Node node = new Node(val);
                Node tmp = p.next;
                p.next = node;
                node.prev =p;
                node.next = tmp;
                tmp.prev = node;
                size++;
                return;
            }
            p = p.next;
            index--;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node p = head.next;
        while(p.next != null){
            if(index == 0){
                Node next_node = p.next;
                Node prev_node = p.prev;
                next_node.prev = p.prev;
                prev_node.next = p.next;
                size--;
                return;
            }
            index--;
            p = p.next;
        }

    }
}