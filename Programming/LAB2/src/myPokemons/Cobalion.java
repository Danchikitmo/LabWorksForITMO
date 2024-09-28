package myPokemons;

import Move.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cobalion extends Pokemon {
    public Cobalion(String name, int level){
        super(name, level);

        super.setType(Type.STEEL, Type.FIGHTING);
        super.setStats(91, 90, 129, 90, 72, 108);

        super.setMove(new X_Scissor(), new Swagger(), new CalmMind(), new Thunder_Wave());

    }
}
