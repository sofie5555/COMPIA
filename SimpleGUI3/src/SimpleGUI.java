import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

	

		public class SimpleGUI extends JFrame {
		
	
			
			
			private boolean roundedCorners;

			
			public SimpleGUI() {
			    super("Simple Example");
			    getContentPane().setBackground(SystemColor.window);
			    this.setBounds(100,100,574,478);
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    getContentPane().setLayout(null);
			    
			    JPanel panel = new JPanel();
			    panel.setBounds(187, 67, 155, 41);
			    getContentPane().add(panel);
			    
			    JLabel lblNewLabel = new JLabel("SETTINGS");
			    lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			    panel.add(lblNewLabel);
			    
			    JPanel panel_1 = new JPanel();
			    panel_1.setBounds(105, 127, 155, 41);
			    getContentPane().add(panel_1);
			    
			    JLabel lblNewLabel_1 = new JLabel("Language:");
			    lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
			    panel_1.add(lblNewLabel_1);
			    
			    JPanel panel_1_1 = new JPanel();
			    panel_1_1.setBounds(105, 180, 155, 41);
			    getContentPane().add(panel_1_1);
			    
			    JLabel lblNewLabel_2 = new JLabel("Date/Time:");
			    panel_1_1.add(lblNewLabel_2);
			    
			    JPanel panel_1_2 = new JPanel();
			    panel_1_2.setBounds(115, 233, 302, 41);
			    getContentPane().add(panel_1_2);
			    
			    JButton btnNewButton = new JButton("Logout");
			    btnNewButton.setBackground(new Color(245, 245, 245));
			    panel_1_2.add(btnNewButton);
			    
			    JMenuBar menuBar = new JMenuBar();
			    menuBar.setBackground(Color.LIGHT_GRAY);
			    menuBar.setBounds(6, 6, 132, 22);
			    getContentPane().add(menuBar);
			    
			    JMenu mnNewMenu = new JMenu("Menu");
			    mnNewMenu.setForeground(Color.GRAY);
			    mnNewMenu.setBackground(new Color(128, 128, 128));
			    menuBar.add(mnNewMenu);
			    
			    JMenuItem mntmNewMenuItem = new JMenuItem("Settings");
			    mnNewMenu.add(mntmNewMenuItem);
			    
			    JMenuItem mntmNewMenuItem_1 = new JMenuItem("House List");
			    mnNewMenu.add(mntmNewMenuItem_1);
			    
			    JMenuItem mntmNewMenuItem_2 = new JMenuItem("Daily Statistcis");
			    mnNewMenu.add(mntmNewMenuItem_2);
			    
			    JMenuItem mntmNewMenuItem_3 = new JMenuItem("Total Statistics");
			    mnNewMenu.add(mntmNewMenuItem_3);
			    
			    JList list_2 = new JList();
			    list_2.setForeground(Color.DARK_GRAY);
			    list_2.setBackground(SystemColor.window);
			    list_2.setModel(new AbstractListModel() {
			    	String[] values = new String[] {"Pусский", "English", "Magyar"};
			    	public int getSize() {
			    		return values.length;
			    	}
			    	public Object getElementAt(int index) {
			    		return values[index];
			    	}
			    });
			    
			    list_2.setBounds(291, 129, 101, 51);
			    getContentPane().add(list_2);
			    
			}
			 
			    
		
			

			public static void main(String[] args) {
				SimpleGUI app = new SimpleGUI();
				app.setVisible(true);
			}
		}