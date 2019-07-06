/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrorehabilitacionfisica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Medico {

    private int hora = 7;
    private int hora2=8;
    private String nombre;
    private String ocupacion;

    public Medico() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public void escribir(String fichero,String especialidad,String hora) throws IOException {
        FileWriter fw = new FileWriter(fichero+".csv");
        fw.write("\n"+fichero+";"+especialidad+";"+hora);
        fw.close();
    }
    
    
    public void nombre(){
        
        if("FISIOTERAPIA".equals(getOcupacion())){
            setNombre("Licenciad a Adriana Añamisi");
        }
        if("NUTRICION".equals(getOcupacion())){
            setNombre("Licenciada Joselyn Segovia");
        }
        if("MEDICINA GENERAL".equals(getOcupacion())){
            setNombre("Dr.Josefa Martínez");
        }
        if("TERAPIA OCUPACIONAL".equals(getOcupacion())){
            setNombre("Dr.Josefa Martínez");
        }
        
    }
   
    public int hora(){
        return (int) Math.random()*18+8;
    }
    
    
    
    
}
//pm
