package homeworks.homework_29.task2_Fighting.Enemies;

public class OrcMagicDef extends Enemies {

    {
        typeEnemy = "Orc_Mage";
        resistanceMage = 4 * level;
        health = 25 * level;
        maxHealth = health;
        defense = 2 + (2 * level);
        exp = 25 * level;
    }

    public OrcMagicDef(int level) {
        super(level);
    }
}
