package com.epam.lab.task6.task1.model;


import com.epam.lab.task6.task1.consts.StatsForUnits;

public class Medic extends Combatant {

    public Medic() {
        super(StatsForUnits.MEDIC_STATS[0], StatsForUnits.MEDIC_STATS[1], StatsForUnits.MEDIC_STATS[2],
                StatsForUnits.MEDIC_STATS[3], StatsForUnits.UNIT_NAMES[8]);
    }

    public int giveHeal(Combatant unit) {
        unit.setHealth(unit.getHealth() + StatsForUnits.MEDIC_STATS[4]);
        return StatsForUnits.MEDIC_STATS[4];
    }
}
