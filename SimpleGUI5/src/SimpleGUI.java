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
			private JTextField textField;
			private JTextField textField_1;
			private JTextField textField_2;
			private JTextField textField_3;

			
			public SimpleGUI() {
			    super("Simple Example");
			    getContentPane().setBackground(SystemColor.window);
			    this.setBounds(100,100,574,478);
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    getContentPane().setLayout(null);
			    
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
			    
			    JScrollBar scrollBar = new JScrollBar();
			    scrollBar.setBounds(528, 40, 15, 301);
			    getContentPane().add(scrollBar);
			    
			    JPanel panel = new JPanel();
			    panel.setBounds(171, 40, 185, 40);
			    getContentPane().add(panel);
			    
			    JLabel lblNewLabel = new JLabel("Total Statistics");
			    lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			    panel.add(lblNewLabel);
			    
			    JPanel panel_1 = new JPanel();
			    panel_1.setBounds(41, 106, 173, 34);
			    getContentPane().add(panel_1);
			    
			    JLabel lblNewLabel_1 = new JLabel("Survival rate:");
			    panel_1.add(lblNewLabel_1);
			    
			    textField = new JTextField();
			    textField.setBackground(Color.LIGHT_GRAY);
			    textField.setBounds(226, 106, 130, 26);
			    getContentPane().add(textField);
			    textField.setColumns(10);
			    
			    JPanel panel_1_1 = new JPanel();
			    panel_1_1.setBounds(41, 170, 173, 34);
			    getContentPane().add(panel_1_1);
			    
			    JLabel lblNewLabel_1_1 = new JLabel("Death count:");
			    lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			    panel_1_1.add(lblNewLabel_1_1);
			    
			    textField_1 = new JTextField();
			    textField_1.setColumns(10);
			    textField_1.setBackground(Color.LIGHT_GRAY);
			    textField_1.setBounds(226, 167, 130, 26);
			    getContentPane().add(textField_1);
			    
			    JPanel panel_1_1_1 = new JPanel();
			    panel_1_1_1.setBounds(41, 229, 173, 34);
			    getContentPane().add(panel_1_1_1);
			    
			    JLabel lblNewLabel_1_1_1 = new JLabel("Food consumed:");
			    panel_1_1_1.add(lblNewLabel_1_1_1);
			    
			    textField_2 = new JTextField();
			    textField_2.setColumns(10);
			    textField_2.setBackground(Color.LIGHT_GRAY);
			    textField_2.setBounds(226, 229, 130, 26);
			    getContentPane().add(textField_2);
			    
			    JPanel panel_1_1_1_1 = new JPanel();
			    panel_1_1_1_1.setBounds(41, 288, 173, 34);
			    getContentPane().add(panel_1_1_1_1);
			    
			    JLabel lblNewLabel_1_1_1_1 = new JLabel("Water consumed:");
			    panel_1_1_1_1.add(lblNewLabel_1_1_1_1);
			    
			    textField_3 = new JTextField();
			    textField_3.setColumns(10);
			    textField_3.setBackground(Color.LIGHT_GRAY);
			    textField_3.setBounds(226, 288, 130, 26);
			    getContentPane().add(textField_3);
			    
			    JSpinner spinner = new JSpinner();
			    spinner.setBounds(135, 54, 34, 26);
			    getContentPane().add(spinner);
			    
			    JLabel lblNewLabel_2 = new JLabel("House number:");
			    lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			    lblNewLabel_2.setBounds(41, 54, 107, 26);
			    getContentPane().add(lblNewLabel_2);
			    
			

			    	
			    
			    
			}
			 
			    
			    
			    
			  
			 
			

			public static void main(String[] args) {
				SimpleGUI app = new SimpleGUI();
				app.setVisible(true);
			}
		}