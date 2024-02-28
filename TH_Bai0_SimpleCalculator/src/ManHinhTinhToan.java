import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình Tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất [a]");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(49, 55, 184, 25);
		contentPane.add(lblNewLabel);

		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai [b]");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(49, 113, 184, 25);
		contentPane.add(lblNhpSTh);

		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(258, 53, 277, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);

		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(258, 106, 277, 32);
		contentPane.add(txtB);

		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý cộng
				//Viết lệnh ở một thủ tục/hàm rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(115, 180, 88, 42);
		contentPane.add(btnCong);

		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(236, 180, 88, 42);
		contentPane.add(btnTru);

		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(355, 180, 88, 42);
		contentPane.add(btnNhan);

		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(481, 180, 88, 42);
		contentPane.add(btnChia);

		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(49, 293, 184, 25);
		contentPane.add(lblKtQuTnh);

		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setEnabled(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(258, 286, 277, 32);
		contentPane.add(txtKetQua);
	}//hết hàm tạo

	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		//Chuyển kiều
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		//Tính toán
		double Tong = SoA + SoB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(Tong));
	}
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		//Chuyển kiều
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		//Tính toán
		double Hieu = SoA - SoB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(Hieu));
	}
	void HamXuLyNhan() {
		//Lấy dữ liệu từ điều khiển
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		//Chuyển kiều
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		//Tính toán
		double Tich = SoA * SoB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(Tich));
	}
	void HamXuLyChia() {
		//Lấy dữ liệu từ điều khiển
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		//Chuyển kiều
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		//Tính toán
		double Thuong = SoA / SoB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(Thuong));
	}
}
