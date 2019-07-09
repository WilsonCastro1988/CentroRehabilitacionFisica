package net.codejava.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This program illustrates how to update an existing Microsoft Excel document.
 * Remove an existing sheet.
 * 
 * @author www.codejava.net
 *
 */
public class ExcelFileUpdateExample5 {


	public static void main(String[] args) {
		String excelFilePath = "JavaBooks.xls";
		
		try {
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			Workbook workbook = WorkbookFactory.create(inputStream);

	        workbook.removeSheetAt(1);	        

			FileOutputStream outputStream = new FileOutputStream("JavaBooks.xls");
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();
			
		} catch (IOException  ex) {
			ex.printStackTrace();
		}
	}

}
