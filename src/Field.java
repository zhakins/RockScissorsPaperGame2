import java.util.Objects;

public class Field {
    private String p1Figure;
    private String p2Figure;

    //getter
    //setter

    public Field() {
    }

    public Field(String p1Figure, String p2Figure) {
        this.p1Figure = p1Figure;
        this.p2Figure = p2Figure;
    }

    public String getP1Figure() {
        return p1Figure;
    }

    public void setP1Figure(String p1Figure) {
        this.p1Figure = p1Figure;
    }

    public String getP2Figure() {
        return p2Figure;
    }

    public void setP2Figure(String p2Figure) {
        this.p2Figure = p2Figure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Objects.equals(p1Figure, field.p1Figure) && Objects.equals(p2Figure, field.p2Figure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1Figure, p2Figure);
    }
}
