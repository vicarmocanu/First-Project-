package GUI;

import java.awt.BorderLayout;
import ControlLayer.ProductCtr;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private ProductCtr controller= new ProductCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteProductGUI frame = new DeleteProductGUI();
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
	public DeleteProductGUI() {
		setTitle("DELETE PRODUCT");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][]"));
		
		JLabel lblDeleteContractor = new JLabel("DELETE PRODUCT");
		contentPane.add(lblDeleteContractor, "cell 2 0,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JLabel lblSearch = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearch, "cell 1 2,alignx trailing");
		
		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);
		String name=searchField.getText();
		
		JButton btnSearch = new JButton("SEARCH");
		contentPane.add(btnSearch, "cell 3 2");
		
		JTextPane textPane = new JTextPane();
		contentPane.add(textPane, "cell 2 3,grow");
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setEnabled(false);
		contentPane.add(btnDelete, "cell 2 4,growx");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 5,growx");
	}

}