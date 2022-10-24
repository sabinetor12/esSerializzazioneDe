package it.fi.itismeucci.ndoja;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {

    public static void main( String[] args )
    {
        ObjectMapper objectMapper = new ObjectMapper();
    try {
    Classe classe = objectMapper.readValue(new File("classe.json"), Classe.class);
    System.out.println(classe.getAula());
    } catch (Exception e) {}
    }
}
