package Move;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Overheat extends SpecialMove {
    public Overheat(){
        super(Type.FIRE, 130, 90);
    }

    @Override
    public String describe(){
        return "Использует Overheat";
    }
}
