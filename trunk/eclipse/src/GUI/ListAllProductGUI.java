package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ControlLayer.ProductCtr;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ListAllProductGUI extends JFrame {

	private JPanel contentPane;
	private ProductCtr controller = new ProductCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListAllProductGUI frame = new ListAllProductGUI();
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
	public ListAllProductGUI() {
		setTitle("LIST ALL PRODUCTS");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 452, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][]", "[][grow]"));
		
		JLabel lblListAllContractors = new JLabel("LIST ALL PRODUCTS");
		contentPane.add(lblListAllContractors, "cell 0 0");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		
		contentPane.add(btnCancel, "cell 2 0");
		
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		
		contentPane.add(textArea, "cell 0 1 3 1,grow");
		JButton btnListAll = new JButton("LIST ALL");
		
		btnListAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(controller.listAllProducts());
			}
		});
		contentPane.add(btnListAll, "cell 1 0");
	}

}
