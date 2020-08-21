/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

import java.util.*;

/**
 *
 * @author gabriell
 */
public class JavaSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa vittoria = new Pessoa("Vittória");
        Pessoa anderson = new Pessoa("Anderson");
        Curintiana laura = new Curintiana("Laura");
        vittoria.dizerOla(anderson);
        vittoria.dizerOla(laura);
    }
    
    
    
}
