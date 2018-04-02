package com.epam.lab.task6.task2;

import com.epam.lab.task6.task1.model.*;
import com.epam.lab.task6.task1.viewtask1.ViewTask1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ViewTask2 {
    private static final Logger LOGGER = LogManager.getLogger(ViewTask1.class);

    public void startTask2() {
        MyLinkedList<Combatant> galleon = new MyLinkedList<>();
        galleon.addFirst(new Warrior());
        galleon.addFirst(new CritWarrior());
        galleon.getFirst().setHealth(500);
        galleon.addLast(new Supporter());
        LOGGER.info("Galleon after start!");
        showAllElements(galleon);
        galleon.add(3, new FastDodger());
        galleon.add(3, new Dodger());
        galleon.add(4, new Warrior());
        galleon.set(0, new Saboteur());
        LOGGER.info("Galleon after visiting the port!");
        showAllElements(galleon);
        galleon.removeLast();
        galleon.removeFirst();
        galleon.remove(1);
        LOGGER.info("Galleon after ship battle!");
        showAllElements(galleon);

    }

    public void showAllElements(MyLinkedList<? extends Combatant> ship) {
        for (int i = 0; i < ship.getSize(); i++) {
            LOGGER.info("Unit[{}]: {}", i, ship.get(i).toString());
        }
    }
}
