package it.fi.itismeucci.ndoja;

import java.util.ArrayList;

public class Classe {
    public String numero;
    public String sezione;
    public String aula;
    public ArrayList<Alunno> listaAlunni;

    public Classe() {
    }

    public Classe(String numero, String sezione, String aula, ArrayList<Alunno> listaAlunni) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.listaAlunni = listaAlunni;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return this.sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getListaAlunni() {
        return this.listaAlunni;
    }

    public void setListaAlunni(ArrayList<Alunno> listaAlunni) {
        this.listaAlunni = listaAlunni;
    }

}
