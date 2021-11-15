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
			    SpringLayout springLayout = new SpringLayout();
			    getContentPane().setLayout(springLayout);
			    
			    
			    JButton btnNewButton = new JButton("House 1");
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 66, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 16, SpringLayout.WEST, getContentPane());
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 104, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 155, SpringLayout.WEST, getContentPane());
			    getContentPane().add(btnNewButton);
			    
			    JButton btnNewButton_5 = new JButton("House 6");
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_5, 0, SpringLayout.NORTH, btnNewButton);
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_5, 32, SpringLayout.EAST, btnNewButton);
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_5, 104, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_5, 326, SpringLayout.WEST, getContentPane());
			    getContentPane().add(btnNewButton_5);
			    
			    JButton btnHouse = new JButton("House 2");
			    springLayout.putConstraint(SpringLayout.NORTH, btnHouse, 6, SpringLayout.SOUTH, btnNewButton);
			    springLayout.putConstraint(SpringLayout.WEST, btnHouse, 0, SpringLayout.WEST, btnNewButton);
			    springLayout.putConstraint(SpringLayout.SOUTH, btnHouse, 148, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.EAST, btnHouse, 155, SpringLayout.WEST, getContentPane());
			    getContentPane().add(btnHouse);
			    
			    JButton btnNewButton_6 = new JButton("House 7");
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_6, 6, SpringLayout.SOUTH, btnNewButton_5);
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_6, 32, SpringLayout.EAST, btnHouse);
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_6, -248, SpringLayout.EAST, getContentPane());
			    getContentPane().add(btnNewButton_6);
			    
			    JButton btnNewButton_2 = new JButton("House 3");
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 150, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 16, SpringLayout.WEST, getContentPane());
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 188, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, 155, SpringLayout.WEST, getContentPane());
			    getContentPane().add(btnNewButton_2);
			    
			    JButton btnNewButton_7 = new JButton("House 8");
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_6, -2, SpringLayout.NORTH, btnNewButton_7);
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_7, 0, SpringLayout.NORTH, btnNewButton_2);
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_7, 0, SpringLayout.EAST, btnNewButton_5);
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_7, 32, SpringLayout.EAST, btnNewButton_2);
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_7, 0, SpringLayout.SOUTH, btnNewButton_2);
			    getContentPane().add(btnNewButton_7);
			    
			    JButton btnNewButton_3 = new JButton("House 4");
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 6, SpringLayout.SOUTH, btnNewButton_2);
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3, 16, SpringLayout.WEST, getContentPane());
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_3, 232, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3, 0, SpringLayout.EAST, btnNewButton);
			    getContentPane().add(btnNewButton_3);
			    
			    JButton btnNewButton_9 = new JButton("House 9");
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_9, -4, SpringLayout.NORTH, btnNewButton_3);
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_9, 32, SpringLayout.EAST, btnNewButton_3);
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_9, 34, SpringLayout.NORTH, btnNewButton_3);
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_9, 0, SpringLayout.EAST, btnNewButton_5);
			    btnNewButton_9.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    	}
			    });
			    getContentPane().add(btnNewButton_9);
			    
			    JButton btnNewButton_4 = new JButton("House 5");
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_4, 6, SpringLayout.SOUTH, btnNewButton_3);
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_4, 0, SpringLayout.WEST, btnNewButton);
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_4, 276, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_4, 155, SpringLayout.WEST, getContentPane());
			    getContentPane().add(btnNewButton_4);
			    
			    JButton btnNewButton_8 = new JButton("House 10");
			    btnNewButton_8.setBackground(SystemColor.inactiveCaptionBorder);
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_8, 6, SpringLayout.SOUTH, btnNewButton_9);
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_8, 0, SpringLayout.WEST, btnNewButton_5);
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_8, -178, SpringLayout.SOUTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_8, 0, SpringLayout.EAST, btnNewButton_5);
			    getContentPane().add(btnNewButton_8);
			    
			    JLabel lblNewLabel = new JLabel("HOUSE LIST");
			    springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 84, SpringLayout.WEST, getContentPane());
			    springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, btnNewButton);
			    lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 30));
			    getContentPane().add(lblNewLabel);
			    
			    JButton btnNewButton_1 = new JButton("􀣋");
			    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 10, SpringLayout.NORTH, getContentPane());
			    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 95, SpringLayout.EAST, lblNewLabel);
			    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 15, SpringLayout.NORTH, lblNewLabel);
			    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -166, SpringLayout.EAST, getContentPane());
			    getContentPane().add(btnNewButton_1);
			    
			}

			public static void main(String[] args) {
				SimpleGUI app = new SimpleGUI();
				app.setVisible(true);
			}
		}