package Ejercicio1;

public class NormalFile extends File {
    private int size;

    public NormalFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println("Archivo Normal: " + name);
        System.out.println("Tamaño: " + getSize());
    }
}