import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


/*so in the class you can make the data into a excel sheet,
 *It only works with the arrays that are going to be sent down from the interface  */

//http://www.javaworld.com/article/2074940/learn-java/java-app-dev-reading-and-writing-excel-spreadsheets.html
//http://www.vogella.com/tutorials/JavaExcel/article.html
public class ExcelWriter {
	
	FileChooser file = new FileChooser(); // Joption helps choose file
	
	
	public void writeExcel(Text[] Array) throws IOException{	
		try{
			// File path and name
			String fileName = file.chooseFile()+".xls";
			WritableWorkbook workbook= Workbook.createWorkbook(new File(fileName));
			WritableSheet sheet = workbook.createSheet("Sheet1", 0); 
			
			//adding label
			// The arguments on the label class go by row, col, "String"
			Label label1 = new Label (1,0,"No Info");
			sheet.addCell(label1);
			Label label2 = new Label (2,0,"Some Info");
			sheet.addCell(label2);
			Label label3 = new Label (3,0,"Enough Info");
			sheet.addCell(label3);
			Label label4 = new Label (4,0,"Too Much");
			sheet.addCell(label4);
			Label label5 = new Label (5,0,"N/A");
			sheet.addCell(label5);
			
			for(int x = 0; x < Array.length;x++){
				Label label = new Label (0,x+1,Array[x].name);
				sheet.addCell(label);
				Array[x].makeArray();
				for( int y =0; y< Array[x].eh.length;y++){
					Number number1 = new Number(y+1,x+1,Array[x].eh[y]);
					sheet.addCell(number1);
				}//end for
			
			}// for loop
	//		Number number = new Number(0,1,3.1459);
	//		sheet.addCell(number);
			
			//Number number1 = new Number(0,4,3);
			
			
			//sheet.addCell(number1);
			
			
			
			
			
			workbook.write();
			workbook.close();
			
			
		}// try
		catch (WriteException e){}
		
	
		
		
		
		
	}// end writeExcel

}// end class