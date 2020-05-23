import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTable;

class TableCommand implements MouseListener{
	JTable table;
	JButton button;
	TableCommand(JTable table, JButton button){
		this.table = table;
		this.button = button;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(table.getSelectedRow() != -1) 
			button.setEnabled(true);
	}

	@Override
	public void mousePressed(MouseEvent e) { }
	@Override
	public void mouseReleased(MouseEvent e) { }
	@Override
	public void mouseEntered(MouseEvent e) { }
	@Override
	public void mouseExited(MouseEvent e) { }
}
