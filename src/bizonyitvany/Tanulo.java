/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bizonyitvany;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jager.balazs
 */
public class Tanulo {
    
    private String nev;
    private int magyar;
    private int matek;
    private int tori;
    private int angol;
    private int info;

    //getter-setter

    public String getNev() {
        return nev;
    }

    public int getMagyar() {
        return magyar;
    }

    public int getMatek() {
        return matek;
    }

    public int getTori() {
        return tori;
    }

    public int getAngol() {
        return angol;
    }

    public int getInfo() {
        return info;
    }
    
    
    
    
    public Tanulo(String nev, int magyar, int matek, int tori, int angol, int info) {
        this.nev = nev;
        this.magyar = magyar;
        this.matek = matek;
        this.tori = tori;
        this.angol = angol;
        this.info = info;
    }
    
    
    public float atlag(){
        
        float output = (float)(magyar+matek+tori+angol+info)/5;
        return output;
        
    }
    
    public static ArrayList<Tanulo> Beolvasas() throws FileNotFoundException, IOException{
        
        ArrayList<Tanulo> output = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("tanulo.txt"));
        
        String sor;
         while((sor = br.readLine()) != null){ 
             
             String[] tempTomb = sor.split(";");
             output.add(new Tanulo(tempTomb[0], Integer.parseInt(tempTomb[1]) , Integer.parseInt(tempTomb[2]), Integer.parseInt(tempTomb[3]), Integer.parseInt(tempTomb[4]), Integer.parseInt(tempTomb[5])));
             
         }        
         br.close(); 
        return output;
    }
    
    
}
