package Ejercicio1;

public abstract class File {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract int getSize();

    public abstract void print();
}