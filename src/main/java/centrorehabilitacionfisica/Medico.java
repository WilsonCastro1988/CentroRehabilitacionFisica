/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrorehabilitacionfisica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author USUARIO
 */
public class Medico {

    private int hora = 7;
    private int hora2 = 8;
    private String nombre;
    private String ocupacion;
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

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

   
    public int hora() {
        return (int) Math.random() * 18 + 8;
    }

    public void nombre() {

        if ("FISIOTERAPIA".equals(getOcupacion())) {
            setNombre("Licenciad a Adriana Añamisi");
        }
        if ("NUTRICION".equals(getOcupacion())) {
            setNombre("Licenciada Joselyn Segovia");
        }
        if ("MEDICINA GENERAL".equals(getOcupacion())) {
            setNombre("Dr.Josefa Martínez");
        }
        if ("TERAPIA OCUPACIONAL".equals(getOcupacion())) {
            setNombre("Dr.Josefa Martínez");
        }

    }
}
//pm
