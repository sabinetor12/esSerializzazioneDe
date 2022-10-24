package it.fi.itismeucci.ndoja;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App {
    public static void main(String[] args) {
        Alunno flavio = new Alunno("flavio", "ndoja", new Date(2004, 12, 31));
        Alunno riccardo = new Alunno("riccardo", "fantacci", new Date(2004, 7, 29));
        Alunno niccolo = new Alunno("niccolo", "sartorio", new Date(2004, 8, 31));

        ArrayList<Alunno> lista = new ArrayList<>();
        lista.add(niccolo);
        lista.add(flavio);
        lista.add(riccardo);

        Classe classe = new Classe("5", "inf", "laggiù", lista);
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File("classe.xml"),classe);
        } catch (Exception e) {}
    }
}
