package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JSeparator;

import sun.io.Converters;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ControlLayer.PersonCtr;
import javax.swing.JScrollPane;

public class DeleteEmployeeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private PersonCtr controller=new PersonCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteEmployeeGUI frame = new DeleteEmployeeGUI();
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
	public DeleteEmployeeGUI() {
		setTitle("DELETE EMPLOYEE");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 445, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][]"));

		JLabel lblDeleteContractor = new JLabel("DELETE EMPLOYEE");
		contentPane.add(lblDeleteContractor, "cell 2 0,alignx center");

		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");

		JLabel lblSearch = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearch, "cell 1 2,alignx trailing");

		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 2 3,grow");

		

		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setEditable(false);

		final JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchField.getText();

				if (searchField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.deleteEmployee(name);

					{
						JOptionPane.showMessageDialog(null,
								"Employee deleted from the system. ",
								"Successful", JOptionPane.INFORMATION_MESSAGE);
						btnDelete.setEnabled(false);
					}
				}
			}
		});
			btnDelete.setEnabled(false);
		contentPane.add(btnDelete, "cell 2 4,growx");

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 5,growx");
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchField.getText();

				if (name.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (controller.listEmployeeByName(name)) {
						textPane.setText(controller
								.listEmployeeByNamePrint(name));
						btnDelete.setEnabled(true);

					} else {
						textPane.setText(controller
								.listEmployeeByNamePrint(name));
					}
				}
			}
		});
		contentPane.add(btnSearch, "cell 3 2");
	}

}
