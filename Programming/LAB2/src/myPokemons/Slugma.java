package myPokemons;

import Move.BodySlam;
import Move.Facade;
import Move.Overheat;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slugma extends Pokemon {
    public Slugma(String name, int level){
        super(name, level);

        super.setType(Type.FIRE);
        super.setStats(40, 40, 40, 70, 40, 20);
        super.setMove(new BodySlam(), new Overheat(), new Facade());
    }
}
