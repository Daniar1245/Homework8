package kg.geektech.game.players;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.LIGHTNING);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean isTrue=true;

    }
}
