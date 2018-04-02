package com.epam.lab.task6.task1.model;

import com.epam.lab.task6.task1.consts.StatsForUnits;

public class Dodger extends Combatant {
    public Dodger() {
        super(StatsForUnits.DODGER_STATS[0], StatsForUnits.DODGER_STATS[1], StatsForUnits.DODGER_STATS[2],
                StatsForUnits.DODGER_STATS[3], StatsForUnits.UNIT_NAMES[3]);
    }
}
