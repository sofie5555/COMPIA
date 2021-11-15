import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TotalStats extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TotalStats frame = new TotalStats();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
    
	/**
	 * Create the frame.
	 */
	public TotalStats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
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
	    
	    JLabel lblNewLabel = new JLabel("Daily Statistics");
	    lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
	    panel.add(lblNewLabel);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBounds(41, 106, 173, 34);
	    getContentPane().add(panel_1);
	    
	    JLabel lblNewLabel_1 = new JLabel("Survival rate:");
	    panel_1.add(lblNewLabel_1);
	    
	   
	    
	}

}
