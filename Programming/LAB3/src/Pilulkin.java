public class Pilulkin extends Entity implements ArtificialRespiration, Helping, Checking, AbleToHeard, Continued, AbleToOrder {
    public Pilulkin(){
        super("Доктор Пилюлкин", 50);
    }

    @Override
    public boolean equals(Object otherObject) {
        return super.equals(otherObject);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 8;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void artificialRespiration(Characters characters){
        if (characters == Characters.Незнайка) {
            System.out.println(this.getName() + " принялся делать " + Characters.Незнайка + " искусственное дыхание.");
        }
        else {
            System.out.println(this.getName() + " принился не тому делать искусственное дыхание.");
        }
    }
    public void checking(Characters characters){
        if (characters == Characters.Незнайка){
            System.out.println(this.getName() + " ритмически поднимал руки " + Characters.Незнайка + " кверху и тут же опускал их вниз, плотно прижимая к груди.");
        }
        else {
            System.out.println(this.getName() + " не того проверял.");
        }
    }
    public void helping(){
        System.out.println(this.getName() + " по временам на минуточку останавливался и старался уловить биение сердца, после чего продолжал делать искусственное дыхание.");
    }

    public void heard(Characters characters){
        if (characters == Characters.Незнайка){
            System.out.println("Наконец " + this.getName() + " послышалось, будто " + Characters.Незнайка + " вздохнул.");
        }
        else {
            System.out.println(this.getName() + "ничего не послышлось.");
        }
    }

    public void continued(Characters characters){
        if (characters == Characters.Незнайка){
            System.out.println(this.getName() + " насторожился, но продолжал поднимать и опускать руки " + Characters.Незнайка + ". Увидев, что");
        }
        else {
            System.out.println(this.getName() + " нчиего не делал.");
        }
    }

    public void order(){
        System.out.println(this.getName() + " велел понемногу выпускать кислород из трубочки около рта больного.");
    }


}
