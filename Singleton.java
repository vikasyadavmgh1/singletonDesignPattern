import java.io.Serializable;

public class Singleton implements Serializable{

    public static final Singleton INSTANCE = new Singleton();
    int value;

    private Singleton() {
    }

    public void setValue(int x) {
        this.value = x;
    }

    public int getValue() {
        return this.value;
    }


    protected Object readResolve() {
        return INSTANCE;
    }

}