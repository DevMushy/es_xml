package com.example;

public class Studente {

private int id;
private String cognome;
private String nome;
private String dataNascita;
private int votoEsame;

public Studente() {
}

public Studente(int id, String cognome, String nome, String dataNascita, int votoEsame) {
    this.id = id;
    this.cognome = cognome;
    this.nome = nome;
    this.dataNascita = dataNascita;
    this.votoEsame = votoEsame;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getCognome() {
    return cognome;
}

public void setCognome(String cognome) {
    this.cognome = cognome;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getDataNascita() {
    return dataNascita;
}

public void setDataNascita(String dataNascita) {
    this.dataNascita = dataNascita;
}

public int getVotoEsame() {
    return votoEsame;
}

public void setVotoEsame(int votoEsame) {
    this.votoEsame = votoEsame;
}



}