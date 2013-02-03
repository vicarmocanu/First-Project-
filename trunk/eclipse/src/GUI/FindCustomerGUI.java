package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import ControlLayer.PersonCtr;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JScrollPane;

public class FindCustomerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private PersonCtr controller = new PersonCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindCustomerGUI frame = new FindCustomerGUI();
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
	public FindCustomerGUI() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("FIND CUSTOMER");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][]", "[][][grow][]"));

		JLabel lblFindContractor = new JLabel("FIND CUSTOMER");
		contentPane.add(lblFindContractor, "cell 1 0,alignx center");

		JLabel lblSearchName = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearchName, "cell 0 1,alignx trailing");

		searchField = new JTextField();
		contentPane.add(searchField, "cell 1 1,growx");
		searchField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 1 2,grow");

		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setEditable(false);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchField.getText();

				if (name.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else

					textPane.setText(controller.listCustomerByNamePrint(name));

			}

		});
		contentPane.add(btnSearch, "cell 2 1");

		

		JButton btnCalcel = new JButton("CALCEL");
		btnCalcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCalcel, "cell 1 3,growx");
	}

}
