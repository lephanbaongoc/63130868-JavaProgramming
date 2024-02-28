import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GiaiPTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaiPTB2 frame = new GiaiPTB2();
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
	public GiaiPTB2() {
		setTitle("Giải phương trình bậc 2 (ax^2 + bx + c =0)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(66, 61, 169, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(66, 119, 169, 32);
		contentPane.add(lblNhpSB);
		
		JLabel lblNhpSC = new JLabel("Nhập số c");
		lblNhpSC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSC.setBounds(66, 180, 169, 32);
		contentPane.add(lblNhpSC);
		
		txtA = new JTextField();
		txtA.setBounds(267, 63, 279, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(267, 119, 279, 32);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(267, 182, 279, 32);
		contentPane.add(txtC);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(66, 356, 169, 32);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setEnabled(false);
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(267, 358, 279, 32);
		contentPane.add(txtKQ);
		
		JButton btnTinhX = new JButton("Tính x");
		btnTinhX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyPTB2();
			}
		});
		btnTinhX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinhX.setBounds(313, 266, 169, 49);
		contentPane.add(btnTinhX);
	}
	
	void XuLyPTB2() {
		//Lấy dữ liệu
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		String Str_SoC = txtC.getText();
		//Chuyển kiểu
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		double SoC = Double.parseDouble(Str_SoC);
		//Tính toán
		if(SoA==0) {//bx + c = 0 => GiaiPTB1
			if(SoB==0)
				txtKQ.setText("PT vô số nghiệm");
			else {
				double KQ = (-SoC)/SoB;
				txtKQ.setText(String.valueOf(KQ));
			}
		}
		else {
			double Delta = SoB*SoB - 4*SoA*SoC;
			if(Delta<0)
				txtKQ.setText("PT vô nghiệm");
			if(Delta==0) {
				double KQ = (-SoB)/(2*SoA);
				txtKQ.setText("x1 = x2 = " + String.valueOf(KQ));
			}
			else {
				double KQ1 = (double) ((-SoB)+Math.sqrt(Delta))/(2*SoA);
				double KQ2 = (double) ((-SoB)-Math.sqrt(Delta))/(2*SoA);
				txtKQ.setText("x1 = "+String.valueOf(KQ1) + "\tx2 = " + String.valueOf(KQ2));
			}
		}
	}

}
