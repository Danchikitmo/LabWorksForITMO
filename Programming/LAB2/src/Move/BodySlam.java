package Move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BodySlam extends PhysicalMove {
    public BodySlam(){
        super(Type.NORMAL, 85, 100);
    }
    @Override
    public String describe(){
        return "Использует BodySlam";
    }
}
