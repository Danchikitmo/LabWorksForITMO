import java.util.Objects;

public abstract class Entity {
    private String name;
    private Integer a;
    public Entity(String name, Integer a){
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name, entity.name) && Objects.equals(a, entity.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, a);
    }

    @Override
    public String toString() {
        return "Entity ['name= ' + " + this.name + " a = " + this.a + "]";
    }
}
