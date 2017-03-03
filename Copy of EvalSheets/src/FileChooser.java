import javax.swing.*;



import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

/// http://stackoverflow.com/questions/10083447/selecting-folder-destination-in-java
public class FileChooser extends JPanel {
	 JFileChooser chooser;
	 String choosertitle = "Select where to save";
	 
	 
	public String chooseFile() throws IOException{
	 chooser = new JFileChooser(); 
	    //chooser.setCurrentDirectory(new java.io.File("."));
	    chooser.setDialogTitle(choosertitle);
	    //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	    //
	    // disable the "All files" option.
	    //
	    //chooser.setAcceptAllFileFilterUsed(false);
	    //    
	    if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) { 
//	      System.out.println("getCurrentDirectory(): " 
//	         +  chooser.getCurrentDirectory());
//	      System.out.println("getSelectedFile() : " 
//	         +  chooser.getSelectedFile());
	    	
	    	return chooser.getSelectedFile().getAbsolutePath();
	      }
	    else {
	      //System.out.println("No Selection ");
	      return null;
	    }
	     }// End chooseFile
	
	
//	private Component getTextFieldInJFileChooser(Component [] c )
//    {
//        if (c == null)
//            return null;
//
//        for(Component k: c)
//        {
//             if( k instanceof JTextField) {
//                return k;
//             }
//             else if(k instanceof JPanel) {
//                 JPanel jp=(JPanel)k;
//                 Component jTextField = getTextFieldInJFileChooser(jp.getComponents());
//                 if (jTextField != null)
//                     return jTextField;
//             }
//        }
//        return null;
//    }
	
	
//	@Override 
//	  protected boolean processKeyBinding(KeyStroke ks, KeyEvent e,
//	                                        int condition, boolean pressed) {
//
//	        if (KeyEvent.VK_BACK_SPACE ==  e.getKeyChar()){
//	            if (jTextField!= null && jTextField.hasFocus()) 
//	                return false; 
//	        }
//
//	        return super.processKeyBinding (ks,e,condition,pressed);     
//	    }
	

}// end class
