package com.vedruna.lectordetxt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        lecturaFichero("C:\\carpetaejemplo\\hola.txt");
    }

    public static void lecturaFichero(String url) { // excepcion usando java.IO
        try{
        Path file = Path.of(url); // ruta al fichero
        String content = Files.readString(file); // el contenido del fichero a String con el método readString
        System.out.println(content); // imprime el contenido 
        }catch(IOException e){
            System.out.println("El archivo no ha sido encontrado");
        }
    }
}