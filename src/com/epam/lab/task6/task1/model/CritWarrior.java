package com.epam.lab.task6.task1.model;

import com.epam.lab.task6.task1.consts.StatsForUnits;

public class CritWarrior extends Combatant {
    public CritWarrior() {
        super(StatsForUnits.CRIT_WARRIOR_STATS[0], StatsForUnits.CRIT_WARRIOR_STATS[1], StatsForUnits.CRIT_WARRIOR_STATS[2],
                StatsForUnits.CRIT_WARRIOR_STATS[3], StatsForUnits.UNIT_NAMES[1]);
    }

    @Override
    public int attack(Combatant unit) {
        if ((int) (Math.random() * 101) <= 50) {
            return super.attack(unit);
        } else return critAttack(unit);
    }

    private int critAttack(Combatant unit) {
        int critStrength = this.getStrength() * (2 + (int) (Math.random() * 3));// 50% chance for critical attack(200-400%)
        int damage = critStrength - (critStrength * unit.getDefense() / 100);
        unit.setHealth(unit.getHealth() - damage);
        return damage;
    }
}
