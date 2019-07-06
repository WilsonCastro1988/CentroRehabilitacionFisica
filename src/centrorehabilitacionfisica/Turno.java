/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrorehabilitacionfisica;


/**
 *
 * @author USUARIO
 */
public class Turno {

    public Turno() {
    }
    
    public boolean tomarCita(int dia){
        if(dia%2==0){
            return true;
        }else{
            return false;
        }
        
    }
    
    public int datos(String nombre){
        int op=0;
        switch(nombre){
            case "FISIOTERAPIA":
                op=1;
                break;
            case "NUTRICION":
                op=2;
                break;
            case "MEDICINA GENERAL":
                op=3;
                break;
            case "TERAPIA OCUPACIONAL":
                op=4;
                break;
        }
        return op;
    }
    
}
