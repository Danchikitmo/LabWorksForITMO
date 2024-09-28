import java.util.Objects;

public class Nesnaika extends Entity implements AbleToOpen{

    public Nesnaika(){
        super("Незнайка", 20);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
    @Override
    public void open(){
        System.out.println("Наконец " + this.getName() + " oткрыл глаза.");
    }
}
