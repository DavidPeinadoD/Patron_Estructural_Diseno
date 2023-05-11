package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        FileFactory fileFactory = new FileFactory();
        DirectoryFactory directoryFactory = new DirectoryFactory();

        File archivo1 = fileFactory.createFile("Archivo 1", 100);
        File archivo2 = fileFactory.createFile("Archivo 2", 200);
        File archivo3 = fileFactory.createFile("Archivo 3",  150);
        File enlace1 = fileFactory.createFile("Enlace 1", archivo1);
        File enlace2 = fileFactory.createFile("Enlace 2", archivo2);

        Directory carpeta1 = directoryFactory.createDirectory("Carpeta 1");
        Directory carpeta2 = directoryFactory.createDirectory("Carpeta 2");

        carpeta1.addFile(archivo1);
        carpeta1.addFile(archivo2);
        carpeta1.addFile(enlace1);
        carpeta2.addFile(archivo3);
        carpeta2.addFile(enlace2);
        carpeta1.addFile(carpeta2);

        carpeta1.print();
        System.out.println("Tamaño total de la carpeta 1: " + carpeta1.getSize());
        System.out.println("Tamaño total de la carpeta 2: " + carpeta2.getSize());
    }
}

