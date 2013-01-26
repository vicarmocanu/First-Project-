package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateDiscountGUI extends JFrame {

	private JPanel contentPane;
	private JTextField categoryField;
	private JTextField discountCategory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDiscountGUI frame = new UpdateDiscountGUI();
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
	public UpdateDiscountGUI() {
		setTitle("UPDATE CATEGORY");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 259, 141);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JLabel lblAddNewDiscount = new JLabel("UPDATE DISCOUNT CATEGORY");
		contentPane.add(lblAddNewDiscount, "cell 0 0 2 1,alignx center");
		
		JLabel lblCategoryNumber = new JLabel("CATEGORY NUMBER:");
		contentPane.add(lblCategoryNumber, "cell 0 1,alignx trailing");
		
		categoryField = new JTextField();
		contentPane.add(categoryField, "cell 1 1,growx");
		categoryField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DISCOUNT AMMOUNT:");
		contentPane.add(lblNewLabel, "cell 0 2,alignx trailing");
		
		discountCategory = new JTextField();
		contentPane.add(discountCategory, "cell 1 2,growx");
		discountCategory.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
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
