package grade;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

/**
 * @date  : 2016. 7. 6.
 * @author: 배근홍
 * @file  : GradeUI.java
 * @story  :
 */
public class GradeUI extends JFrame{
	
	private static final long serialVersionUID = 1L;

	JPanel wrapper_panel, flow_panel;
	JList<String> itemList;
	
	public GradeUI() {
		this.setLayout();
		
		this.setResizable(false);//this abort resize
		this.setLocationRelativeTo(null);//this load at center of screen
		this.setSize(600, 300);//this set size width, height
		this.setVisible(true);//this set visible mode (false - non-visible)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x btn of this is end of this
	}

	private void setLayout() {
		wrapper_panel = new JPanel();
		flow_panel = new JPanel(new FlowLayout());
		itemList = new JList(GradeServiceImpl.getGradeImpl().list().toArray());
		itemList.setSelectedIndex(0);
		itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		wrapper_panel.add(itemList);
		this.add(wrapper_panel);
	}
	
}
