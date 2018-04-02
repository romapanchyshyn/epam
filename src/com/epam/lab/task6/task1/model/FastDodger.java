package com.epam.lab.task6.task1.model;

import com.epam.lab.task6.task1.consts.StatsForUnits;

public class FastDodger extends Combatant {
    public FastDodger() {
        super(StatsForUnits.FAST_DODGER_STATS[0], StatsForUnits.FAST_DODGER_STATS[1], StatsForUnits.FAST_DODGER_STATS[2],
                StatsForUnits.FAST_DODGER_STATS[3], StatsForUnits.UNIT_NAMES[4]);
    }

    @Override
    public int attack(Combatant unit) {
        return super.attack(unit) + super.attack(unit);
    }
}
