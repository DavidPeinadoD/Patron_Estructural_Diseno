package Ejercicio1;

import java.util.ArrayList;
import java.util.List;



public abstract class Directory extends File {
    protected List<File> files;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public File getFile(String name) {
        for (File file : files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }
        return null;
    }

    public int getSize() {
        int size = 0;
        for (File file : files) {
            size += file.getSize();
        }
        return size;
    }

    public void print() {
        System.out.println("Directorio: " + name);
        System.out.println("Tamaño: " + getSize());
        System.out.println("Archivos:");
        for (File file : files) {
            file.print();
        }
    }
}