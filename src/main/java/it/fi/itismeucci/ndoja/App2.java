package it.fi.itismeucci.ndoja;

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {

    public static void main( String[] args )
    {
    XmlMapper xmlMapper = new XmlMapper();
    try {
    Classe classe = xmlMapper.readValue(new File("classe.xml"), Classe.class);
    System.out.println(classe.getAula());
    } catch (Exception e) {}
    }
}
