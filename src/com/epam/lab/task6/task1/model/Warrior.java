package com.epam.lab.task6.task1.model;

import com.epam.lab.task6.task1.consts.StatsForUnits;

public class Warrior extends Combatant {
    public Warrior() {
        super(StatsForUnits.WARRIOR_STATS[0], StatsForUnits.WARRIOR_STATS[1], StatsForUnits.WARRIOR_STATS[2],
                StatsForUnits.WARRIOR_STATS[3], StatsForUnits.UNIT_NAMES[0]);
    }
}