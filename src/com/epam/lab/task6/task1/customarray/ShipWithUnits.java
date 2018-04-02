package com.epam.lab.task6.task1.customarray;

import com.epam.lab.task6.task1.model.Combatant;

import java.io.Serializable;
import java.util.Arrays;

public class ShipWithUnits<E extends Combatant> implements Serializable {
    private int capacity = 16;
    private Combatant[] array;
    private int size = 0;

    public ShipWithUnits() {
        array = new Combatant[capacity];
    }

    public void add(E unit) {
        checkAndResize();
        array[size] = unit;
        size++;
    }

    public E get(int index) {
        rangeCheck(index);
        return (E) array[index];
    }

    public int size() {
        return size;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(String.format("Size: %d Index %d", size, index));
    }

    private void checkAndResize() {
        if (checkSize()) {
            resizeArray();
        }
    }

    private boolean checkSize() {
        return size == capacity;
    }

    private void resizeArray() {
        capacity = capacity * 2;
        array = Arrays.copyOf(array, capacity);
    }
}

