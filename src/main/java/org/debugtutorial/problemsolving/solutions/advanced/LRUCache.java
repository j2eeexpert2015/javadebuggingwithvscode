package org.debugtutorial.problemsolving.solutions.advanced;

import java.util.HashMap;

/**
 * Basic Data Structure for each entry for LRU Cache
 */
class Entry {
    int value;
    int key;
    Entry left;
    Entry right;
}

/**
 * Following class implements LRU cache using HashMap and doubly linked list.
 * Here the HashMap will hold the keys and address of the nodes of doubly linkedList and doubly linked list will
 * hold the values of keys.
 * To keep track of recently used entries, the code would remove element from bottom and add element on start of linked list
 * Whenever any entry is accessed , it will be moved to top,so that recently used entries will be on top and Least used will be on Bottom.
 */
public class LRUCache {

    HashMap<Integer, Entry> hashmap;
    Entry start, end;
    // LRU_SIZE size is set as 4
    int LRU_SIZE = 4;
    public LRUCache() {
        hashmap = new HashMap<Integer, Entry>();
    }

    /**
     * Method to get item from the LRUCache if available else return -1
     * @param key
     * @return
     */
    public int get(int key) {
        if (hashmap.containsKey(key))
        {
            Entry entry = hashmap.get(key);
            removeNode(entry);
            addAtTop(entry);
            return entry.value;
        }
        return -1;
    }

    /**
     * Method to store item  inside the LRUCache
     * @param key
     * @param value
     */
    public void put(int key, int value) {
        // If key already present, update the value and move it to top
        if (hashmap.containsKey(key))
        {
            Entry entry = hashmap.get(key);
            entry.value = value;
            removeNode(entry);
            addAtTop(entry);
        } else {
            Entry newnode = new Entry();
            newnode.left = null;
            newnode.right = null;
            newnode.value = value;
            newnode.key = key;
            if (hashmap.size() > LRU_SIZE) // We have reached maxinum size so need to make room for new element.
            {
                hashmap.remove(end.key);
                removeNode(end);
                addAtTop(newnode);

            } else {
                addAtTop(newnode);
            }

            hashmap.put(key, newnode);
        }
    }

    /**
     * Whenever any item is accessed make item node at the top
     * as it is most recently accessed
     * @param node
     */
    public void addAtTop(Entry node) {
        node.right = start;
        node.left = null;
        if (start != null)
            start.left = node;
        start = node;
        if (end == null)
            end = start;
    }

    /**
     *
     * @param node
     */
    public void removeNode(Entry node) {

        if (node.left != null) {
            node.left.right = node.right;
        } else {
            start = node.right;
        }

        if (node.right != null) {
            node.right.left = node.left;
        } else {
            end = node.left;
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        // Create LRUCache
        LRUCache lrucache = new LRUCache();
        lrucache.put(1, 1);
        lrucache.put(2, 15);
        lrucache.put(3, 10);
        lrucache.put(4, 16);
        lrucache.put(5, 15);
        lrucache.put(6, 10);
        lrucache.put(7, 16);

        System.out.println(lrucache.get(1));
        System.out.println(lrucache.get(2));
        System.out.println(lrucache.get(3));

    }
}
