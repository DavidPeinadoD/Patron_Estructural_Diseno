package Ejercicio1;

public class FileFactory {
    public File createFile(String name, Object... args) {
        if (args.length > 0 && args[0] instanceof File) {
            return new Link(name, (File) args[0]);
        } else if (args.length > 0 && args[0] instanceof Integer) {
            return new NormalFile(name, (int) args[0]);
        } else {
            throw new IllegalArgumentException("Argumento no válido.");
        }
    }
}