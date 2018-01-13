import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class CelciusConverter {

	private JFrame frmCelciusConverter;
	private JTextField txtTempTo;
	private JTextField txtTempFrom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelciusConverter window = new CelciusConverter();
					window.frmCelciusConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CelciusConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCelciusConverter = new JFrame();
		frmCelciusConverter.setTitle("Celcius Converter");
		frmCelciusConverter.setBounds(100, 100, 387, 72);
		frmCelciusConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtTempFrom = new JTextField();
		txtTempFrom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Celcius");
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double convertFrom;
				double convertTo;
				
				convertFrom = Double.parseDouble( txtTempFrom.getText());
				
				convertTo = convertFrom * 1.8 + 32;
				
				txtTempTo.setText(String.valueOf(convertTo));
				
				
			}
		});
		
		txtTempTo = new JTextField();
		txtTempTo.setColumns(10);
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit");
		GroupLayout groupLayout = new GroupLayout(frmCelciusConverter.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtTempFrom, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnConvert, GroupLayout.PREFERRED_SIZE, 84, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtTempTo, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFahrenheit)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTempFrom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(btnConvert)
						.addComponent(lblFahrenheit)
						.addComponent(txtTempTo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		frmCelciusConverter.getContentPane().setLayout(groupLayout);
	}
}
