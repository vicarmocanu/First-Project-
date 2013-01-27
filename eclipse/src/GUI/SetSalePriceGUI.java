package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class SetSalePriceGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextField salaryField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetSalePriceGUI frame = new SetSalePriceGUI();
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
	public SetSalePriceGUI() {
		setResizable(false);
		setTitle("SET PRICE FOR PRODUCTS");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 424, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][]", "[][][grow][grow][][grow][][]"));
		
		JLabel lblNewLabel = new JLabel("PRODUCTS");
		contentPane.add(lblNewLabel, "cell 0 0 4 1,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JTextArea textArea = new JTextArea();
		textArea.setMaximumSize(new Dimension(2147483647, 200));
		contentPane.add(textArea, "flowx,cell 1 2 3 2,grow");
		
		JLabel lblSearchName = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearchName, "cell 1 4,alignx trailing");
		
		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 4,growx");
		searchField.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		contentPane.add(btnSearch, "cell 3 4");
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		contentPane.add(textPane, "cell 0 5 4 1,grow");
		
		JLabel lblSalary = new JLabel("PRICE:");
		contentPane.add(lblSalary, "cell 1 6,alignx trailing");
		
		salaryField = new JTextField();
		salaryField.setEnabled(false);
		contentPane.add(salaryField, "cell 2 6,growx");
		salaryField.setColumns(10);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setEnabled(false);
		contentPane.add(btnUpdate, "cell 3 6");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 7,growx");
	}

}
