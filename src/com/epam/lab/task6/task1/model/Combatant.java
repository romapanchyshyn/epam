package com.epam.lab.task6.task1.model;

import java.io.Serializable;

public abstract class Combatant implements Serializable {
    private int health;
    private int strength;
    private int defense;
    private int cost;
    private String name;
    private transient boolean status;

    public Combatant(int health, int strenght, int defense, int cost, String name) {
        this.health = health;
        this.strength = strenght;
        this.defense = defense;
        this.cost = cost;
        this.status = true; // that means the unit is alive;
        this.name = name;
    }

    public int attack(Combatant unit) {
        int damage = this.getStrength() - (this.getStrength() * unit.getDefense() / 100);
        unit.setHealth(unit.getHealth() - damage);
        return damage;
    }

    public boolean checkStatus() {
        if (getHealth() <= 0) {
            System.out.printf("%s died!", getName());
            return this.status = false;
        } else return true;
    }

    public int getCost() {
        return cost;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d", getName(), getHealth(), getStrength(), getDefense(), getCost());
    }
}
