package com.epam.lab.task6.task1.model;

import com.epam.lab.task6.task1.consts.StatsForUnits;

public class Supporter extends Combatant {

    public Supporter() {
        super(StatsForUnits.SUPORTER_STATS[0], StatsForUnits.SUPORTER_STATS[1], StatsForUnits.SUPORTER_STATS[2],
                StatsForUnits.SUPORTER_STATS[3], StatsForUnits.UNIT_NAMES[6]);
    }

    public int giveDefence(Combatant unit) {
        int bonuseDefence = StatsForUnits.SUPORTER_STATS[4] * unit.getDefense() / 100;
        unit.setDefense(unit.getDefense() + bonuseDefence);
        return bonuseDefence;
    }
}
