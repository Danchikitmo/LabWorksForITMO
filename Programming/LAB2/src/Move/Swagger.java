package Move;

import ru.ifmo.se.pokemon.*;

public class Swagger extends SpecialMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.confuse(p);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double v) {
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.ATTACK, 2);

        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "использует Swagger";
    }
}
