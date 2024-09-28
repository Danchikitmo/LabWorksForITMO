package Move;

import ru.ifmo.se.pokemon.*;

public class Thunder_Wave extends StatusMove {
    public Thunder_Wave() {
        super(Type.ELECTRIC, 0, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = (new Effect()).condition(Status.PARALYZE);
        p.setCondition(effect);
    }
    @Override
    protected String describe(){
        return "Использует Thunder Wave";
    }
}
