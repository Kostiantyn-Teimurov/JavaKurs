package homeworks.homework_29.task2_Fighting.Heroes;

public class Archer extends GameCharacter {

    {
        typeCharacter = "Archer";
        typeWeapon = "Bow";
        bowSkill = 1.1;
    }

    public Archer() {
        super();
    }

//    public Archer(int level, int attackPower, int bowSkill) {
//        super(level, attackPower);
//        this.bowSkill = bowSkill;
//    }

    @Override
    public void attack() {
        System.out.printf("%s attacks with a %s\n", typeCharacter, typeWeapon);
    }

}
