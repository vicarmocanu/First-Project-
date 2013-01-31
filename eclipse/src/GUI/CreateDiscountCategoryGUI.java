package GUI;

import ControlLayer.CategoryCtr;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateDiscountCategoryGUI extends JFrame {

	private JPanel contentPane;
	private JTextField categoryField;
	private JTextField discountField;
	private CategoryCtr controller = new CategoryCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateDiscountCategoryGUI frame = new CreateDiscountCategoryGUI();
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
	public CreateDiscountCategoryGUI() {
		setTitle("ADD NEW DISCOUNT CATEGORY");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 259, 141);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JLabel lblAddNewDiscount = new JLabel("ADD NEW DISCOUNT CATEGORY");
		contentPane.add(lblAddNewDiscount, "cell 0 0 2 1,alignx center");
		
		JLabel lblCategoryNumber = new JLabel("CATEGORY NUMBER:");
		contentPane.add(lblCategoryNumber, "cell 0 1,alignx trailing");
		
		categoryField = new JTextField();
		contentPane.add(categoryField, "cell 1 1,growx");
		categoryField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DISCOUNT AMMOUNT:");
		contentPane.add(lblNewLabel, "cell 0 2,alignx trailing");
		
		discountField = new JTextField();
		contentPane.add(discountField, "cell 1 2,growx");
		discountField.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String category=categoryField.getText();
				String discount=discountField.getText();
				
				
				
				controller.createCategory(Integer.parseInt(category),Integer.parseInt(discount));
				
				
				JOptionPane.showMessageDialog(null,
						"New discount category added in the system!", "Successful",
						JOptionPane.INFORMATION_MESSAGE);
				categoryField.setText("");
				discountField.setText("");
			}
		});
		contentPane.add(btnAdd, "cell 0 3,growx");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 1 3,growx");
	}

}
