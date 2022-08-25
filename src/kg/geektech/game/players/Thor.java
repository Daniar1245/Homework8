package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.LIGHTNING);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean round = RPG_Game.random.nextBoolean();
        if(this.getHealth()>0&&round==true){
            boss.setDamage(0);
            System.out.println(this.getName()+": Thor stunned the boss");
        }
        else {
            boss.setDamage(50);
            System.out.println(this.getName()+": Thor didn't stunned the boss" );
        }
    }
    }
