package Collections;

import sun.plugin.javascript.navig.Link;

public class queuedemo {

    public interface Queue<E> //a simplified form of the interface in the standard library
    {
        void add(E element);
        E remove();
        int size();
    }
    public class CircluarArrayQueue<E> implements Queue<E> //not an actual library class
    {
        private int head;
        private int tail;

        CircluarArrayQueue(int capacity) {}
        public void add(E element) {}
        public E remove() {}
        public int size() {}
        private E[] elements;
    }

    public class LinkedListQueue<E> implements Queue<E> //not an actual library class
    {
        private Link head;
        private Link tail;

        LinkedListQueue() {}
        public void add(E element) {}
        public E remove() {}
        public int size() {}
    }
}
