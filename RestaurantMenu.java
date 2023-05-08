

	import javax.swing.*;
	import java.awt.*;

	public class RestaurantMenu extends JFrame {

	    private JPanel contentPane;

	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    RestaurantMenu frame = new RestaurantMenu();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

	    public RestaurantMenu() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 450, 300);
	        contentPane = new JPanel();
	        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(new BorderLayout(0, 0));

	        JLabel lblTitle = new JLabel("Restaurant Menu");
	        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
	        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
	        contentPane.add(lblTitle, BorderLayout.NORTH);

	        JPanel panelMenu = new JPanel();
	        contentPane.add(panelMenu, BorderLayout.CENTER);
	        panelMenu.setLayout(new GridLayout(0, 2, 10, 10));

	        JLabel lblMenuItem1 = new JLabel("Item 1");
	        lblMenuItem1.setFont(new Font("Tahoma", Font.BOLD, 16));
	        panelMenu.add(lblMenuItem1);

	        JLabel lblPrice1 = new JLabel("$10.00");
	        lblPrice1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        panelMenu.add(lblPrice1);

	        JLabel lblMenuItem2 = new JLabel("Item 2");
	        lblMenuItem2.setFont(new Font("Tahoma", Font.BOLD, 16));
	        panelMenu.add(lblMenuItem2);

	        JLabel lblPrice2 = new JLabel("$15.00");
	        lblPrice2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        panelMenu.add(lblPrice2);

	        JButton btnOrder = new JButton("Order");
	        btnOrder.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        contentPane.add(btnOrder, BorderLayout.SOUTH);
	    }

	}

