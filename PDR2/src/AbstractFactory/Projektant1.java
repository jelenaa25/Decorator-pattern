/* Projektant1.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 06.11.2017
 */

package AbstractFactory;

import ConcreteDecorators.KonkretniDekoratorKontroleraB;
import ConcreteDecorators.KonkretniDekoratorKontroleraA;
import Component.Kontroler;
import AbstractProductA.*;
import AbstractProductB.*;
import ConcreteComponent.*;

// Promenljivo!!!
public class Projektant1 implements Projektant {
        
    @Override
    public EkranskaForma kreirajEkranskuFormu() {
        Panel pan = new Panel1(); // Promenljivo!!!
        EkranskaForma2 ip = new EkranskaForma2(); // Promenljivo!!!
        ip.setPanel(pan);
        return ip;
    }   
    
    @Override
    public BrokerBazePodataka kreirajBrokerBazePodataka () 
      { BrokerBazePodataka dbbr = new BrokerBazePodataka1(); // Promenljivo!!!
        return dbbr;}  
    
    @Override
    public Kontroler kreirajKontroler (EkranskaForma ef,BrokerBazePodataka dbbr) {
        Kontroler kon = new Kontroler1(ef,dbbr); // Promenljivo!!!
        KonkretniDekoratorKontroleraA kdka = new KonkretniDekoratorKontroleraA(kon);
        KonkretniDekoratorKontroleraB kdkb = new KonkretniDekoratorKontroleraB(kdka,kon); 
                
        return kdkb;
    }
        
   
}

