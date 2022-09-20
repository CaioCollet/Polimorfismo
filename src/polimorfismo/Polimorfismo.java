/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author caio.collet
 */
public class Polimorfismo {
    
    public static void main(String[] args) {
        
    
 
    Gato gato = new Gato();
    Cachorro cachorro = new Cachorro();
    Pato pato = new Pato();

    gato.comunicar();
    cachorro.comunicar();
    pato.comunicar();

}

}

