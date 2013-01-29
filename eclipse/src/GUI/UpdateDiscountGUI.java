package GUI;

import java.awt.BorderLayout;
import ControlLayer.PersonCtr;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;

import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateDiscountGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextField discountField;
	private PersonCtr controller = new PersonCtr();

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
		setResizable(false);
		setTitle("UPDATE DISCOUNT CATEGORY");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 419, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]",
				"[][][][grow][][][][]"));

		JLabel lblNewLabel = new JLabel("UPDATE CATEGORY");
		contentPane.add(lblNewLabel, "cell 2 0,alignx center");

		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");

		JLabel lblSearchName = new JLabel("SEARCH CATEGORY:");
		contentPane.add(lblSearchName, "cell 1 2,alignx trailing");

		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);

		JButton btnSearch = new JButton("SEARCH");
		contentPane.add(btnSearch, "cell 3 2");

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		contentPane.add(textPane, "cell 2 3,grow");

		JLabel lblNewLabel_1 = new JLabel("DISCOUNT");
		contentPane.add(lblNewLabel_1, "cell 1 4,growx");

		discountField = new JTextField();
		discountField.setColumns(10);
		contentPane.add(discountField, "cell 2 4,growx");

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String id = discountField.getText();
				String name = searchField.getText();
				if (discountField.getText().equals("")){
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				}
					else {controller.updateContractorId(name, id);
				JOptionPane.showMessageDialog(null,
						"Contractor updated in the system. ", "Successful",
						JOptionPane.INFORMATION_MESSAGE);}
				
				}
		});
		contentPane.add(btnUpdate, "cell 3 4,growx");
		
				JButton btnCancel = new JButton("CANCEL");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				contentPane.add(btnCancel, "cell 2 5,growx");
	}

}
