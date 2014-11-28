/****************************************************************************
 * @author: William M. Driver												* 
 * 			Charles E. Driver												*
 * 																			*
 * @date: 	10/15/2014 														*
 * @Description: instantiate the program		 							*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

import guiStatus.Status;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JFrame {
	
	Status s = new Status();
	
	public Main(){
		add(s);
	}
	
	public static void main(String[] args) {
		Main frame = new Main();
		Dimension d = new Dimension();
		
//		frame.setSize(d);
		frame.setSize(960, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}// end main method
} // end class Main
