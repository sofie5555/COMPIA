import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.*;
	

		public class SimpleGUI extends JFrame {
			
			
			private boolean roundedCorners;
			private JTextField textField;
			private JPasswordField passwordField;

			
			public SimpleGUI() {
			    super("Login page");
			    getContentPane().setBackground(SystemColor.window);
			    this.setBounds(100,100,574,478);
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    getContentPane().setLayout(null);
			 
			    JCalendar cal = new JCalendar();
			    
			    
			    
			    JPanel panel = new JPanel();
			    panel.setBounds(166, 17, 164, 27);
			    getContentPane().add(panel);
			    
			    JLabel lblNewLabel = new JLabel("LOGIN");
			    lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			    panel.add(lblNewLabel);
			    
			    JPanel panel_1 = new JPanel();
			    panel_1.setBounds(241, 71, 164, 32);
			    getContentPane().add(panel_1);
			    
			    textField = new JTextField();
			    textField.setBackground(new Color(192, 192, 192));
			    textField.setHorizontalAlignment(SwingConstants.CENTER);
			    panel_1.add(textField);
			    textField.setColumns(10);
			    
			    passwordField = new JPasswordField();
			    passwordField.setBackground(new Color(192, 192, 192));
			    passwordField.setBounds(260, 130, 128, 19);
			    getContentPane().add(passwordField);
			    
			    JButton btnNewButton = new JButton("􀣋");
			    btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
			    btnNewButton.setBackground(new Color(220, 220, 220));
			    btnNewButton.setBounds(414, 17, 59, 27);
			    getContentPane().add(btnNewButton);
			    
			    JLabel lblNewLabel_1 = new JLabel("􀲏 Username:");
			    lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
			    lblNewLabel_1.setBounds(126, 81, 103, 16);
			    getContentPane().add(lblNewLabel_1);
			    
			    JLabel lblNewLabel_2 = new JLabel("􀎡 Password:");
			    lblNewLabel_2.setBounds(126, 132, 103, 16);
			    getContentPane().add(lblNewLabel_2);
			
			   /* JFrame frame = new JFrame();
			    frame.setTitle("LOGIN PAGE");
			    frame.setLocation(new Point(500, 300));
			    frame.getContentPane().add(panel_3);
			    frame.setSize(new Dimension(400, 200));
			 
*/
			 
			}

			public static void main(String[] args) {
				SimpleGUI app = new SimpleGUI();
				app.setVisible(true);
			}
		}