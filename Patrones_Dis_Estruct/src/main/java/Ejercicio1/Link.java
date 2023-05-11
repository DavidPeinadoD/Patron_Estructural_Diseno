package Ejercicio1;

public class Link extends File {
    private File target;

    public Link(String name, File target) {
        this.name = name;
        this.target = target;
    }

    public int getSize() {
        return target.getSize();
    }

    public void print() {
        System.out.println("Enlace: " + name);
        System.out.println("Tamaño: " + getSize());
    }
}
