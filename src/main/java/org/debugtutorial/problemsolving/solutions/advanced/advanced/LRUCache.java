package org.debugtutorial.problemsolving.solutions.advanced.advanced;

import java.util.HashMap;

class Entry {
    int value;
    int key;
    Entry left;
    Entry right;
}

public class LRUCache {

    HashMap<Integer, Entry> hashmap;
    Entry start, end;
    int LRU_SIZE = 4; // Here LRU_SIZE size set 4 for test purpose
    public LRUCache() {
        hashmap = new HashMap<Integer, Entry>();
    }

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
            if (hashmap.size() > LRU_SIZE) // We have reached maxium size so need to make room for new element.
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
    public void addAtTop(Entry node) {
        node.right = start;
        node.left = null;
        if (start != null)
            start.left = node;
        start = node;
        if (end == null)
            end = start;
    }

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
    public static void main(String[] args) throws Exception {
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
