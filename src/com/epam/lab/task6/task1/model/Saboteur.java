package com.epam.lab.task6.task1.model;

import com.epam.lab.task6.task1.consts.StatsForUnits;

public class Saboteur extends Combatant {
    public Saboteur() {
        super(StatsForUnits.SABOTEUR_STATS[0], StatsForUnits.SABOTEUR_STATS[1], StatsForUnits.SABOTEUR_STATS[2],
                StatsForUnits.SABOTEUR_STATS[3], StatsForUnits.UNIT_NAMES[7]);
    }

    public int reductionProtection(Combatant unit) {
        int redDefence = unit.getDefense() * StatsForUnits.SABOTEUR_STATS[4] / 100;
        unit.setDefense(unit.getDefense() - redDefence);
        return redDefence;
    }
}
