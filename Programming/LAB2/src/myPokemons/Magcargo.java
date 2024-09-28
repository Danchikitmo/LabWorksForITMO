package myPokemons;

import Move.BodySlam;
import Move.Facade;
import Move.Overheat;
import Move.StoneEdge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Magcargo extends Slugma {
    public Magcargo(String name, int level){
        super(name, level);

        super.setType(Type.FIRE, Type.ROCK);
        super.setStats(60, 50, 120, 90, 80, 30);
        super.setMove(new BodySlam(), new Overheat(), new Facade(), new StoneEdge());
    }
}
