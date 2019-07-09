/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrorehabilitacionfisica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Willy
 */
public class Archivo {

    private String doctor;
    private String especialidad;
    private String paciente;
    private String cedula;
    private String direccion;
    private Date fecha;
    private String confirmacion;

    public Archivo() {
    }

    public Archivo(String doctor, String especialidad, String paciente, String cedula, String direccion, Date fecha, String confirmacion) {
        this.doctor = doctor;
        this.especialidad = especialidad;
        this.paciente = paciente;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fecha = fecha;
        this.confirmacion = confirmacion;
    }

    public void escribirArchivo() {
        String excelFilePath = "C:\\Ficheros-Excel\\Inventario.xls";

        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = WorkbookFactory.create(inputStream);

            Sheet sheet = workbook.getSheetAt(0);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fechaCalendar = formatter.format(this.fecha);
            Object[][] bookData = {
                {this.doctor, this.especialidad, this.paciente, this.cedula, this.direccion, fechaCalendar, this.confirmacion},};

            int rowCount = 0;
            if (sheet.getPhysicalNumberOfRows() == 0) {
                rowCount = -1;
            } else {
                rowCount = sheet.getLastRowNum();

            }
            for (Object[] aBook : bookData) {
                Row row = sheet.createRow(++rowCount);

                int columnCount = 0;

                Cell cell = row.createCell(columnCount);
                cell.setCellValue(rowCount);

                for (Object field : aBook) {
                    cell = row.createCell(++columnCount);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }

            }

            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream("C:\\Ficheros-Excel\\Inventario.xls");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String[][] leerArchivo() {
        String nombreArchivo = "Inventario.xls";
        String rutaArchivo = "C:\\Ficheros-Excel\\" + nombreArchivo;
        String hoja = "Hoja1";

        String[][] matriz;

        try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
            // leer archivo excel
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            //obtener la hoja que se va leer
            XSSFSheet sheet = worbook.getSheetAt(0);
            //obtener todas las filas de la hoja excel
            Iterator<Row> rowIterator = sheet.iterator();

            int filas = sheet.getPhysicalNumberOfRows();
            matriz = new String[filas][8];

            Row row = null;

            for (int x = 0; x < filas; x++) {
                row = sheet.getRow(x);
                int columnas = row.getPhysicalNumberOfCells();
                for (int y = 0; y < columnas; y++) {
                    Cell cell = row.getCell(y);
                    if (cell.getCellType().ordinal() == 1) {
                        matriz[x][y] = Double.toString(cell.getNumericCellValue());
                    } else {
                        matriz[x][y] = cell.getStringCellValue();
                    }
                }
            }
            return matriz;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void eliminarRegistro(int fila) {

        String excelFilePath = "C:\\Ficheros-Excel\\Inventario.xls";
        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = WorkbookFactory.create(inputStream);

            Sheet sheet = workbook.getSheetAt(0);

            int lastRowNum = sheet.getLastRowNum();
            if (fila >= 0 && fila < lastRowNum) {
                sheet.shiftRows(fila + 1, lastRowNum, -1);
            }
            if (fila == lastRowNum) {
                Row removingRow = sheet.getRow(fila);
                if (removingRow != null) {
                    sheet.removeRow(sheet.getRow(fila));
                }
            }

            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream("C:\\Ficheros-Excel\\Inventario.xls");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void actualizarCelda(int fila, int columna, String valor) {
        String excelFilePath = "C:\\Ficheros-Excel\\Inventario.xls";
        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = WorkbookFactory.create(inputStream);

            Sheet sheet = workbook.getSheetAt(0);

            Cell cell2Update = sheet.getRow(fila).getCell(columna);
            cell2Update.setCellValue(valor);

            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream("C:\\Ficheros-Excel\\Inventario.xls");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
