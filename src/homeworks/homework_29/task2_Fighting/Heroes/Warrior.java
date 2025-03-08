package homeworks.homework_29.task2_Fighting.Heroes;

public class Warrior extends GameCharacter {

    {
        typeCharacter = "Warrior";
        typeWeapon = "Sword";
        oneHandSkill = 1.1;
    }

    public Warrior() {
        super();
    }

//    public Warrior(int level, int attackPower, int swordSkill) {
//        super(level, attackPower);
//        this.swordSkill = swordSkill;
//    }

    @Override
    public void attack() {
        System.out.printf("%s attacks with a %s\n", typeCharacter, typeWeapon);
    }


}
