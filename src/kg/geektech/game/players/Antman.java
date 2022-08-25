package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Antman extends Hero{
    public Antman(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.MOUSE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean razmer= RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (razmer == true){
                this.setHealth(getHealth() + 50);
                this.setDamage(getDamage()+ 50);
                System.out.println(this.getName()+": Ant man increased");
                break;
            }else if (razmer == false){
                this.setHealth(getHealth() - 50);
                this.setDamage(getDamage() - 50);
                System.out.println(this.getName()+": Ant man decreased");
                break;
            }
        }
    }
}
