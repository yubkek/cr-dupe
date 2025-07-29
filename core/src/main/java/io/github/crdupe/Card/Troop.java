package io.github.crdupe.Card;

import com.badlogic.gdx.graphics.Texture;

public abstract class Troop {
    private int hp;
    private int dmg;
    private double hitSpeed;
    private double moveSpeed;

    public Troop(int hp, int dmg, double hitSpeed, double moveSpeed) {
        this.hp = hp;
        this.dmg = dmg;
        this.hitSpeed = hitSpeed;
        this.moveSpeed = moveSpeed;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public double getHitSpeed() {
        return hitSpeed;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void takeDamage(int dmg) {
        this.hp -= dmg;
    }

}
