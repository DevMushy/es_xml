package com.example;
import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{
    public static int id;

    public static void main( String[] args ) throws Exception 
    {
        Studenti studenti = new Studenti();     

        System.out.println("------------");
        XmlMapper xmlMapper = new XmlMapper();
        Studente s1 = new Studente(1,"duka","gabriele","2004,11,1",60);
        Studente s2 = new Studente(1,"duka","gabriele","2004,11,1",60);
        Studente s3 = new Studente(1,"duka","gabriele","2004,11,1",60);
        Studente s4 = new Studente(1,"duka","gabriele","2004,11,1",60);

        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        studenti.add(s4);

        // Serializzazione        
        xmlMapper.writeValue(new File("test.xml"), studenti);
        String myXml = xmlMapper.writeValueAsString(studenti);
        System.out.println("Oggetto serializzato:" + myXml);
            
        //Deserializzazione 
        
        Studenti s5 = xmlMapper.readValue(myXml, Studenti.class);
        System.out.println("Oggetto deserializzato da stringa:" + s5.getStudente().get(0).getNome());
        Studenti s6 = xmlMapper.readValue(new File("test.xml"), Studenti.class);
        System.out.println("Oggetto deserializzato da file: " + s6.getStudente().get(0).getNome());
        
    }
}