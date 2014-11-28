package guiStatus;

import gui.PopupMenu;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;

/****************************************************************************
 * @author: William M. Driver												* 
 * 			Charles E. Driver												*
 * 																			*
 * @date: 	10/15/2014 														*
 * @Description: 		 							*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

public class Status extends JPanel{
	PopupMenu popupMenu = new PopupMenu();
	
	ToBeFilled fill = new ToBeFilled();
	AlreadyFilled complete = new AlreadyFilled();
	DrugLevels drugLvl = new DrugLevels();
	
	public Status(){
		setLayout(new BorderLayout());
		
		add(fill, BorderLayout.NORTH);
		add(complete, BorderLayout.CENTER);
		add(drugLvl, BorderLayout.SOUTH);
	} // end Status constructor
} // end class Status
