import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Frame;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.AWTEventListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Component;

import javax.swing.SwingConstants;

import java.awt.Dimension;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.*;
import javax.swing.JTextArea;




/* This program was made by Evan Dunn - starting at 2016 may 15.
 * It might not be the greatest, I know, but im still quite proud of what I did.
 * If you want to edit this and make it better, be my guest!
 * I only ask that you credit your self somewhere in comments, because you helped out with this program
 * too.*/

//I know I shouldnt had everything in the interface, my bad 

// I said extends Frame Implemets AwtListentener so it can detect keys pressed.
public class Interface extends Frame implements AWTEventListener {
		
	private JPanel TextPan;
	
		
		private JLabel Label;
		private JLabel label1;
		private JLabel label2;
		private JLabel label3;
		private JLabel label4;
		private JLabel label5;
		private JLabel startlable;
		
		
		
		private JButton btnNoInfo;
		
		
		private JFrame frame;
		
		
		
		/* SO what you are doing to make an array of all the different question. 
		 * each question is a different object, at the end each question will add up all
		 * the answers they each got. */ 
		
		private int x=0;
		private Text[] textArray = {new Text("NSCC is an Adult Learning Environment."),
				new Text("What a typical week in my program will look like."),
				new Text("The courses in your program."),
				new Text("Your program requirements, milestones, checklists."),
				new Text("The workload in your program."),
				new Text("How you will be evaluated in your program."),
				new Text("Discussion of faculty teaching style."),
				new Text("Textbooks, Equipment & Tools - how and when to buy them."),
				new Text("What is expected in a portfolio for your program."),
				new Text("Did you find out about Student Services at NSCC?"),
				new Text("Did you find out about work in your field after your program?"),
				new Text("The importance of checking your email & MyNSCC for college communication & important documents"),
				new Text("Your first term fee due dates."),
				new Text("You must pass ALL courses to complete your program."),
				new Text("Attendance is extremely important to succeed."),
				new Text("Involving yourself in campus activites like the Student Association."),
				new Text("Money is important and you should plan a budget."),
				new Text("NSCC has Student Awards you can apply for during the year.")};
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Interface window = new Interface();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
		/**
		 * Create the application.
		 */
		public Interface() {
			initialize();

			this.getToolkit().addAWTEventListener(this, AWTEvent.KEY_EVENT_MASK); // to listen for keys pressed
		}// end interface
		
		
		
	
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			
			
			frame = new JFrame();
			frame.setBounds(100, 100, 609, 483);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(new CardLayout(0, 0));
			
			JPanel StartUp = new JPanel();
			frame.getContentPane().add(StartUp, "name_631409656623582");
			StartUp.setLayout(null);
			
			String greet = "Hello my name is Evan Dunn and I made this program in the summmer of 2016"// Text used to greet people
					+ " to count as my work experince.\n <br>"
					+ "This program is used to help collate data from the small survey that students took at the end of Get Started"
					+ "<br> <br>How to use this program: <br> ---You can click on the area where the student has marked as an answer (Then "
					+ "it will atoumaticly go to the next question.)<br>"
					+ "---If you made a mistake you can take go back to the previous question and hit the little minus under the add"
					+ "button to subtract the answer by one<br>"
					+ "---You can also use the numbers on the keyboard to select the answers. \"1\" being for the first answer, "
					+ "\"2\" for secound and so on<br>"
					+ "---This program also lets you save the infomation stright to an Excel sheet file";
			JLabel StartScreen = new JLabel("<html>"+greet+"</html>");
			StartScreen.setVerticalAlignment(SwingConstants.TOP);
			StartScreen.setBounds(10, 0, 573, 249);
			StartUp.add(StartScreen);
			
			JButton btnLetsStart = new JButton("Lets Start");
			btnLetsStart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					StartUp.setVisible(false);
					TextPan.setVisible(true);
					
				}
			});
			btnLetsStart.setBounds(229, 372, 117, 23);
			StartUp.add(btnLetsStart);
			
			TextPan = new JPanel();
			frame.getContentPane().add(TextPan, "name_220818971151708");
			TextPan.setLayout(null);
			TextPan.isFocusable();
			
			Label = new JLabel("");
			Label.setMaximumSize(new Dimension(2, 2));
			Label.setHorizontalAlignment(SwingConstants.LEFT);
			Label.setHorizontalTextPosition(SwingConstants.LEFT);
			Label.setAlignmentY(Component.TOP_ALIGNMENT);
			Label.setBounds(10, 11, 412, 60);
			TextPan.add(Label);
			
			// This label shows the NoInfo
			label1 = new JLabel("");
			label1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			label1.setBounds(70, 168, 46, 41);
			TextPan.add(label1);
			
			JButton forwardBut = new JButton("Next");
			forwardBut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					forwardQuestion();
					
					
				}
			});
			
			label2 = new JLabel("");
			label2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			label2.setBounds(174, 168, 46, 41);
			TextPan.add(label2);
			
			label3 = new JLabel("");
			label3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			label3.setBounds(270, 168, 46, 41);
			TextPan.add(label3);
			
			label4 = new JLabel("");
			label4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			label4.setBounds(364, 168, 46, 41);
			TextPan.add(label4);
			
			label5 = new JLabel("");
			label5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			label5.setBounds(463, 168, 46, 41);
			TextPan.add(label5);
			forwardBut.setBounds(302, 344, 89, 34);
			TextPan.add(forwardBut);
			
			btnNoInfo = new JButton("No Info");
			btnNoInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textArray[x].noInfo++;
					forwardQuestion();
					setTexts();
				}
			});
			btnNoInfo.setBounds(52, 214, 89, 34);
			TextPan.add(btnNoInfo);
			
			JButton btnSomeInfo = new JButton("Some");
			btnSomeInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].someInfo++;
					forwardQuestion();
					setTexts();
				}
			});
			btnSomeInfo.setBounds(151, 214, 89, 34);
			TextPan.add(btnSomeInfo);
			
			JButton btnEnoughInfo = new JButton("Enough");
			btnEnoughInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].EnoughInfo++;
					forwardQuestion();
					setTexts();
				}
			});
			btnEnoughInfo.setBounds(250, 214, 89, 34);
			TextPan.add(btnEnoughInfo);
			
			JButton btnTooMuch = new JButton("Too Much");
			btnTooMuch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].tooMuchInfo++;
					forwardQuestion();
					setTexts();
					
				}
			});
			btnTooMuch.setBounds(345, 214, 89, 34);
			TextPan.add(btnTooMuch);
			
			JButton btnNa = new JButton("N/A");
			btnNa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].NA++;
					forwardQuestion();
					setTexts();
				}
			});
			btnNa.setBounds(444, 214, 89, 34);
			TextPan.add(btnNa);
			
			JButton backBut = new JButton("Back");
			backBut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					backQuestion();
				}
			});
			backBut.setBounds(166, 344, 89, 34);
			TextPan.add(backBut);
			
			JButton btnSpreadsheet = new JButton("View");
			btnSpreadsheet.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayData();
				}
			});
			btnSpreadsheet.setBounds(345, 399, 113, 23);
			TextPan.add(btnSpreadsheet);
			
			startlable = new JLabel("Start of Page");
			startlable.setRequestFocusEnabled(false);
			startlable.setBounds(10, 410, 95, 23);
			TextPan.add(startlable);
			
			JButton minusBut = new JButton("-");
			minusBut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].noInfo--;
					setTexts();
				}
			});
			minusBut.setFont(new Font("Tahoma", Font.BOLD, 6));
			minusBut.setBounds(81, 259, 26, 23);
			TextPan.add(minusBut);
			
			JButton button = new JButton("-");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].someInfo--;
					setTexts();
				}
			});
			button.setFont(new Font("Tahoma", Font.BOLD, 6));
			button.setBounds(185, 259, 26, 23);
			TextPan.add(button);
			
			JButton button_1 = new JButton("-");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].EnoughInfo--;
					setTexts();
				}
			});
			button_1.setFont(new Font("Tahoma", Font.BOLD, 6));
			button_1.setBounds(277, 259, 26, 23);
			TextPan.add(button_1);
			
			JButton button_2 = new JButton("-");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].tooMuchInfo--; 
					setTexts();
				}
			});
			button_2.setFont(new Font("Tahoma", Font.BOLD, 6));
			button_2.setBounds(376, 259, 26, 23);
			TextPan.add(button_2);
			
			JButton button_3 = new JButton("-");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArray[x].NA--;
					setTexts();
				}
			});
			button_3.setFont(new Font("Tahoma", Font.BOLD, 6));
			button_3.setBounds(475, 259, 26, 23);
			TextPan.add(button_3);
			
			JButton SaveButton = new JButton("Save Excel");
			SaveButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					TextPan.setFocusable(false);// lose focus so Joption filer chooser can work
					writeInExcel(textArray);
					TextPan.setFocusable(true);
					// save into excel
				}
			});
			SaveButton.setBounds(468, 399, 115, 23);
			TextPan.add(SaveButton);
			
		
			setTexts();
		}// end init
		
		
		
		////// Methods///////////
		
		public void setTexts(){// this shows all the text inside the mini boxes
			Label.setText("<html>" + textArray[x].name + "</html>"); //The html makes it so if the text is too long it will make a paragraph
			label1.setText(Integer.toString(textArray[x].noInfo));
			label2.setText(Integer.toString(textArray[x].someInfo));
			label3.setText(Integer.toString(textArray[x].EnoughInfo));
			label4.setText(Integer.toString(textArray[x].tooMuchInfo));
			label5.setText(Integer.toString(textArray[x].NA));
			
			if (x!=0){// this just shows on the bottom corner that its the begging of a page
				 startlable.setVisible(false);
				}
				else
					startlable.setVisible(true);
		}// end of setTexts
		
		
		public void forwardQuestion(){// this just makes it go to the next question
			x++;
			if (x== textArray.length){
				x =0;
			}// end if
			
		
			
			setTexts();
			
		}// end forwardQuestion
		
		public void backQuestion(){// If mistakes are made they can go back
			x--;
			if (x== -1){
				int answer=JOptionPane.showConfirmDialog(null,"You are returning to the previous sheet "
						+ "\nDo you want to continue?","Return",
			            JOptionPane.YES_NO_OPTION);
				if (answer==JOptionPane.YES_OPTION){
					x= textArray.length - 1;
					
				}// end if
				else{
					x =0;
				}
			}// end else
			setTexts();
		}// end backQuestion
		
		public void displayData(){// the display what everything has
			String data = "<html><style> td{text-align: center} #name{text-align: left} tr{padding: 5px}</style><body><table><tr><th> </th><th>No Info</th><th>Some Info</th>"
					+ "<th>Enough Info</th><th>Too Much</th><th>N/A</th></tr>";
			for (int y = 0; y< textArray.length; y++){// used this for loop to get all the objects
				data += "<tr><td id=\"name\">"+textArray[y].name +"</td><td> " +Integer.toString(textArray[y].noInfo)+" </td>"
						+ " <td>"+Integer.toString(textArray[y].someInfo)+" </td><td> " +Integer.toString(textArray[y].EnoughInfo)+" </td>"
								+ " <td>" +Integer.toString(textArray[y].tooMuchInfo)+"</td>"
										+ " <td> " +Integer.toString(textArray[y].NA)+" </td></tr>";
				//data += "cat";
			}/// end for
			
			//data += "</table></body></html>"; 
			JOptionPane.showMessageDialog(null, data);
			//String saveData= data.replaceAll("<[^>]*>", "\n");
			//writeText(data.replaceAll("<[^>]*>", ""));
			//writeText(makeWriteabe().replaceAll("<[^>]*>", "")); // theses need catches if to work
			//writeInExcel(textArray);
			//IOUtils.toString(data);
			
		}// diplsay data
		
		
		
		
		
		public void writeText( String theText) throws IOException{
			FileChooser file = new FileChooser();
			WriteFile data = new WriteFile(file.chooseFile());
			//System.out.println(file.chooseFile());
			data.writeToFile(theText);
			//System.out.println("YAAASSS");
		}//end write text
		
		public void writeInExcel(Text[] x){
			ExcelWriter write= new ExcelWriter();
			try {
				write.writeExcel(x);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}// end writeInExcle
		
		
		// this method for the .txt so it can be written well
		// I also used the # for delimiters so when we take the text file into excel and Delmite them
		// I dont know if thats the proper verb but yeah...
		public String makeWriteabe() {
			String text="Question#No Info#SomeInfo#EnoughInfo#TooMuch#N/A \r\n";
			//String[] txt2 = {"ses", "eses"};
			for (int x=0; x< textArray.length; x++){
				text += textArray[x].name+"# "+Integer.toString(textArray[x].noInfo)
						+"# "+Integer.toString(textArray[x].someInfo)+"# "+Integer.toString(textArray[x].EnoughInfo)
						+"# " +Integer.toString(textArray[x].tooMuchInfo)
								+"# "+Integer.toString(textArray[x].NA)+"\r\n"; 
				
			}// end for
			//System.out.println(text);
			return text;
		}// end makeWritable

		
		
		
		/// this is for being able to use the keys
		/// Refference http://stackoverflow.com/questions/12434740/how-do-you-make-key-bindings-for-a-java-awt-frame
		@Override
		public void eventDispatched(AWTEvent e) {
			if (!TextPan.isFocusable()){
			 if(e instanceof KeyEvent){
			      KeyEvent key = (KeyEvent)e;
			      if(key.getID()==KeyEvent.KEY_PRESSED){ //Handle key presses
			        //System.out.println(key.getKeyChar());
			        
			        if (key.getKeyChar()==KeyEvent.VK_1)
			        {
			        	textArray[x].noInfo++;
						forwardQuestion();
						setTexts();
			        }// end if
			        
			        if (key.getKeyChar()== KeyEvent.VK_2){
			        	textArray[x].someInfo++;
			        	System.out.println(textArray[x].someInfo);
						forwardQuestion();
						setTexts();
			        }// end if
			        
			        if (key.getKeyChar()== KeyEvent.VK_3){
			        	textArray[x].EnoughInfo++;
						forwardQuestion();
						setTexts();
			        }// end if
			        
			        if(key.getKeyChar()== KeyEvent.VK_4){
			        	textArray[x].tooMuchInfo++;
						forwardQuestion();
						setTexts();
			        }// end if
			        
			        if(key.getKeyChar()== KeyEvent.VK_5){
			        	textArray[x].NA++;
						forwardQuestion();
						setTexts();
			        }// end if
			        
			        
			        //TODO: do something with the key press
			        key.consume();
			        }
			      }
			}// end if textpan
		}// eventdispatach
	}// end class
