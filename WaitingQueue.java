import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class WaitingQueue{
	String[] collum;
	
	JTable table;
	DefaultTableModel model;
	
	JScrollPane scrollPane;
	
	private static WaitingQueue waitingQueue = new WaitingQueue();
	
	private WaitingQueue(){
		collum = new String[]{"테이블 번호", "메뉴명"};
		model = new DefaultTableModel(null, collum);
		table = new JTable(model);
		scrollPane = new JScrollPane(table);
	}
	
	public static WaitingQueue getInstance() {
		return waitingQueue;
	}
	
	void order(int number, Object name) {
		Object[] data = new Object[] {number, name};
		model.addRow(data);
	}
	
	JScrollPane getScrollPane() {
		return scrollPane;
	}
}

class WaitingDisplayer{
	WaitingQueue queue = WaitingQueue.getInstance();
	JFrame frame;
	Container container;
	JButton close;
	
	WaitingDisplayer(){
		setup();
		prepare();
	}
	
	void setup() {
		frame = new JFrame("대기 목록");
		container = frame.getContentPane();
		close = new JButton("닫기");
	}
	
	void prepare() {
		close.addActionListener((ActionEvent e) -> {
			frame.dispose();
		});

		container.setLayout(new BorderLayout());
	}
	
	void build() {
		container.add(queue.getScrollPane(), BorderLayout.NORTH);
		container.add(close, BorderLayout.SOUTH);
		frame.pack();
	}
	
	void display() {
		build();
		frame.setVisible(true);
	}
}
