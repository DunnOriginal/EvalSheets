import java.io.*;

// http://www.homeandlearn.co.uk/java/write_to_textfile.html
public class WriteFile {
	protected String path;
	
	public WriteFile(String string){
		this.path=string;
	}//end path
public void writeToFile(String text) throws IOException{
	FileWriter write = new FileWriter(path+".txt",false);
	//write.write(text);
	//write.close();
	PrintWriter printLine = new PrintWriter(write);
	//printLine.printf("%s" + "%n", text);
	printLine.println(text);
	printLine.close();
}

}
