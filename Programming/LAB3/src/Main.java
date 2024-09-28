public class Main {
    public static void main(String[] args){
        Shpuntic shpu = new Shpuntic();
        shpu.bringPillow(PillowType.rubberPillow);

        Vintik vint = new Vintik();
        vint.bringPillow(PillowType.oxygenPillow);

        Pilulkin pil = new Pilulkin();
        pil.artificialRespiration(Characters.Незнайка);

        Korotishki kor = new Korotishki();
        kor.tracking();

        pil.checking(Characters.Незнайка);
        pil.helping();

        System.out.println("Никто не мог сказать, сколько прошло времени.");
        System.out.println("Всем казалось, что очень много.");

        pil.heard(Characters.Незнайка);
        pil.continued(Characters.Незнайка);

        vint.bringPillow2(PillowType.rubberPillow);
        shpu.bringPillow2(PillowType.oxygenPillow);

        pil.order();

        kor.noticed();

        Nesnaika nes = new Nesnaika();
        nes.open();

    }
}