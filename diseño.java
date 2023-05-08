import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JList;

public class diseño {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diseño window = new diseño();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public diseño() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 128));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 128));
		frame.getContentPane().add(panel);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setForeground(new Color(255, 0, 0));
		splitPane.setContinuousLayout(true);
		splitPane.setBackground(new Color(255, 0, 0));
		splitPane.setToolTipText("");
		panel.add(splitPane);
		frame.setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
