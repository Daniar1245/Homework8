package kg.geektech.game.players;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.TAKE_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damageBoss =boss.getDamage()/5 ;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()> 0) {
                boss.setHealth(boss.getHealth() - damageBoss);
                System.out.println(this.getName()+": Received one fifth of the damage");
                break;
            }
        }

    }
}

