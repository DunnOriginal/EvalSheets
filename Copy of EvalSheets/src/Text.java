import javax.swing.JPanel;


public class Text{
	protected  int noInfo;
	protected  int someInfo;
	protected  int EnoughInfo;
	protected  int tooMuchInfo;
	protected  int NA;
	protected  String name;
	protected int[] eh= {this.noInfo, someInfo, EnoughInfo, tooMuchInfo,NA};
 
	public Text(){}
	public Text(String title){
		this.name= title;
	}
	
	public Text(String title, int cat){
		this.name= title;
		this.noInfo= cat;
	}
public void makeArray(){ // this is to update the array so it matches with the new info
		
		eh[0]=this.noInfo;
		eh[1]=this.someInfo;
		eh[2]=this.EnoughInfo;
		eh[3]=this.tooMuchInfo;
		eh[4]=this.NA;
		
	}// end makearray
	
	
	
	
}
