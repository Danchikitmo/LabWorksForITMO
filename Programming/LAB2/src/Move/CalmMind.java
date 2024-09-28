package Move;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class CalmMind extends StatusMove {
    public CalmMind(){

        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected String describe(){
        return "Использует CalmMind";
    }
}
