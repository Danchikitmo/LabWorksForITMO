public class Korotishki extends Entity implements AbleToTracking, AbleToNoticed {
    public Korotishki(){
        super("Коротышки", 40);
    }

    @Override
    public boolean equals(Object otherObject) {
        return  super.equals(otherObject);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 7;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void tracking(){
        System.out.println(this.getName() + ", собравшиеся у дверей каюты, с тревогой следили как");
    }

    public void noticed(){
        System.out.println(this.getName() + " с облегчением заметили, как страшная бледность стала исчезать с лица Незнайки");
    }
}