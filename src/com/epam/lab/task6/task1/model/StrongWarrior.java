package com.epam.lab.task6.task1.model;

import com.epam.lab.task6.task1.consts.StatsForUnits;

public class StrongWarrior extends Combatant {
    public StrongWarrior() {
        super(StatsForUnits.STRONG_WARRIOR_STATS[0], StatsForUnits.STRONG_WARRIOR_STATS[1], StatsForUnits.STRONG_WARRIOR_STATS[2],
                StatsForUnits.STRONG_WARRIOR_STATS[3], StatsForUnits.UNIT_NAMES[2]);
    }
}
