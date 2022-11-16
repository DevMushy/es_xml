package com.example;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Studenti {
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Studente> studente = new ArrayList();

    public Studenti() {
    }

    public ArrayList<Studente> getStudente() {
        return studente;
    }

    public void setStudente(ArrayList<Studente> studente) {
        this.studente = studente;
    }

    public void add(Studente s){
        studente.add(s);
    }

}
