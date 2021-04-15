
import javax.swing.*;
import java.awt.event.*;

public class EditMenuHandler implements ActionListener {
	JFrame jframe;

	public EditMenuHandler(JFrame jf) {
		jframe = jf;
	}// FileMenuHandler constructor

	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Search"))
			file();
	} // actionPerformed

	private void file() {
		String status= JOptionPane.showInputDialog(null,"Enter Price");
		float input= Float.parseFloat(status); 
		SortedCandleList sorted=new SortedCandleList();
		CandleNode a=Project4.sl.first.next;
		while(a!=null) {
				if(a.data.getPrice()<=input) {
				sorted.add(a.data);
				}
				a=a.next;
		} // while loop
		Project4.gui.show(sorted);
	}// file

}// EditMenuHandler