package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteDiscountGUI extends JFrame {

	private JPanel contentPane;
	private JTextField categoryField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteDiscountGUI frame = new DeleteDiscountGUI();
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
	public DeleteDiscountGUI() {
		setTitle("DELETE CATEGORY");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 235, 114);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][]"));
		
		JLabel lblDeleteCategory = new JLabel("DELETE CATEGORY");
		contentPane.add(lblDeleteCategory, "cell 0 0 2 1,alignx center");
		
		JLabel lblCategoryNumber = new JLabel("CATEGORY NUMBER:");
		contentPane.add(lblCategoryNumber, "cell 0 1,alignx trailing");
		
		categoryField = new JTextField();
		contentPane.add(categoryField, "cell 1 1,growx");
		categoryField.setColumns(10);
		
		JButton btnDelete = new JButton("DELETE");
		contentPane.add(btnDelete, "cell 0 2,growx");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 1 2,growx");
	}

}
