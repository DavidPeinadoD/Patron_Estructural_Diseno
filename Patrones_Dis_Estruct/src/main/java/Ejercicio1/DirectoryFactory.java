package Ejercicio1;

public class DirectoryFactory {
    public static Directory createDirectory(String name) {
        return new ConcreteDirectory(name);
    }
}