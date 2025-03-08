package homeworks.homework_29.task2_Fighting;

import homeworks.homework_29.task2_Fighting.Enemies.OrcMagicDef;
import homeworks.homework_29.task2_Fighting.Enemies.OrcPhysDef;
import homeworks.homework_29.task2_Fighting.Heroes.Warrior;
import homeworks.homework_29.task2_Fighting.Weapon.Sword;

public class AppHW {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Sword sword = new Sword();
        warrior.changeWeapon(sword);
        System.out.println(warrior.getWeapon().getTypeWeapon());
        System.out.println(warrior.getLevel());
        System.out.println(warrior.getAttackPower());
        System.out.println(warrior.getTypeCharacter());
        warrior.attack();

        OrcPhysDef orcPhysDef = new OrcPhysDef(1);
        System.out.println(orcPhysDef.getTypeEnemy());

        OrcMagicDef orcMagicDef = new OrcMagicDef(1);
        System.out.println(orcMagicDef.getTypeEnemy());

    }
}
