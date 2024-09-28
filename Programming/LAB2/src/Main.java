import myPokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args){

        Battle b = new Battle();
        Cobalion cobalion = new Cobalion("Gamer1", 1);
        Slugma slugma = new Slugma("Gamer2", 1);
        Magcargo magcargo = new Magcargo("Gamer3", 4);
        Igglybuff igglybuff = new Igglybuff("Gamer4", 2);
        Jigglypuff jigglypuff = new Jigglypuff("Gamer5", 1);
        Wigglytuff wigglytuff = new Wigglytuff("Gamer6", 1);
        b.addAlly(slugma);
        b.addAlly(igglybuff);
        b.addAlly(wigglytuff);
        b.addFoe(cobalion);
        b.addFoe(magcargo);
        b.addFoe(jigglypuff);
        b.go();

    }
}