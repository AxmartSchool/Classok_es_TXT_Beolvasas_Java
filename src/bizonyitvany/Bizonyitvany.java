/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bizonyitvany;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jager.balazs
 */
public class Bizonyitvany {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Tanulo> Tanulok;
    public static void main(String[] args) throws IOException {
        
        Tanulok = Tanulo.Beolvasas();
        
        for(Tanulo tanulo : Tanulok){
        
            System.out.println(tanulo.getNev()+"\t"+tanulo.getAngol()+"\t"+tanulo.atlag());
        
        }
        
        LegrosszabbTanulo();
        
    }

    private static void LegrosszabbTanulo() {
        
        System.out.print("A legrosszabb tanulo atlaga: ");
        float legrosszabbAtlag = 5;
        for(Tanulo tanulo : Tanulok){
            if( tanulo.atlag() < legrosszabbAtlag){
                legrosszabbAtlag = tanulo.atlag();
            }
            
            
        }
        
        System.out.println(legrosszabbAtlag);
        
    }
    
}
