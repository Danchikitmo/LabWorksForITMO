public class Vintik extends Entity implements AbleToBringPillow, AbleToBringPillow2 {
    public Vintik(){
        super("Винтик", 10);
    }


    @Override
    public boolean equals(Object otherObject) {
        System.out.println(super.equals(otherObject));
        return super.equals(otherObject);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 5;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void bringPillow(PillowType pillowType){
        if (pillowType == PillowType.oxygenPillow){
            System.out.println(this.getName() + " принес не ту подушку.");
        }
        if (pillowType == PillowType.rubberPillow){
            System.out.println(this.getName() + " схватил " + PillowType.rubberPillow + " и помчался в газовый отсек.");
        }
    }

    public void bringPillow2(PillowType pillowType) {
        if (pillowType == PillowType.oxygenPillow) {
            System.out.println(this.getName() + " схватил " + PillowType.oxygenPillow + " и помчался в газовый отсек.");
        }
        if (pillowType == PillowType.rubberPillow) {
            System.out.println(this.getName() + " принес не ту подушку.");
        }
    }
}
