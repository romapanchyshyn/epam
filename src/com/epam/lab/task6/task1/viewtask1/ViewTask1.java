package com.epam.lab.task6.task1.viewtask1;

import com.epam.lab.task6.task1.customarray.ShipWithUnits;
import com.epam.lab.task6.task1.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ViewTask1 {
    private static final Logger LOGGER = LogManager.getLogger(ViewTask1.class);

    public void startTask1() {
        ShipWithUnits<Combatant> galleon = new ShipWithUnits<>();
        galleon.add(new Warrior());
        galleon.add(new CritWarrior());
        LOGGER.info("Galleon after start ");
        printElements(galleon);
        galleon.get(1).setHealth(500);
        galleon.add(new Supporter());
        galleon.add(new Saboteur());
        galleon.add(new FastDodger());
        galleon.add(new WarriorSon());
        LOGGER.info("Galleon after port ");
        printElements(galleon);
        ShipWithUnits<Warrior> warriorShip = new ShipWithUnits<>();
        warriorShip.add(new Warrior());
        warriorShip.add(new WarriorSon());
        LOGGER.info("Little ship only with Warriors and his sons");
        printElements(warriorShip);

    }

    private static void printElements(ShipWithUnits<? extends Combatant> army) {
        for (int i = 0; i < army.size(); i++) {
            LOGGER.info("Unit[{}]: {}", i, army.get(i).toString());
        }
    }
}
