package com.epam.lab.task6.task2;

import com.epam.lab.task6.task1.model.Combatant;

public class MyLinkedList<E extends Combatant> {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public void addLast(E element) {
        MyLinkedList.Node<E> l = last;
        MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(l, element, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public void addFirst(E element) {
        MyLinkedList.Node<E> f = first;
        MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(null, element, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.previous = newNode;
        }
        size++;
    }

    public void removeLast() {
        checkSize();
        last = last.previous;
        size--;
    }

    public void removeFirst() {
        checkSize();
        first = first.next;
        size--;
    }

    public void remove(int index) {
        checkSize(index);
        Node<E> temp = findNode(index);
        if (findNode(index).previous == null) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            size--;
        }
    }

    public void add(int index, E element) {
        checkSize(index - 1);
        Node<E> temp = findNode(index);
        if (findNode(index).previous == null) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node<E> newNode = new Node<>(temp.previous, element, temp);
            temp.previous.next = newNode;
            temp.previous = newNode;
            size++;
        }
    }

    public void set(int index, E element) {
        findNode(index).element = element;
    }


    public E getFirst() {
        checkSize();
        return this.first.element;
    }

    public E getLast() {
        checkSize();
        return this.last.element;
    }

    public E get(int index) {
        checkSize(index);
        return findNode(index).element;
    }

    public int getSize() {
        return size;
    }

    private Node<E> findNode(int index) {
        Node<E> el;
        if (index < size / 2) {
            el = first;
            for (int i = 0; i < index; i++) {
                el = el.next;
            }
        } else {
            el = last;
            for (int i = 1; i < size - index; i++) {
                el = el.previous;
            }
        }
        return el;
    }


    public void checkSize() {
        if (size == 0) {
            throw new IndexOutOfBoundsException(String.format("Size of Linked List: %d", size));
        }
    }

    public void checkSize(int index) {
        if (size <= index) {
            throw new IndexOutOfBoundsException(String.format("Size of Linked List: %d", size));
        }
    }

    private static class Node<E extends Combatant> {
        public Node<E> next;
        public Node<E> previous;
        public E element;

        public Node(Node<E> previous, E element, Node<E> next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }
}
