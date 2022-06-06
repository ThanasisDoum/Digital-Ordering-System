import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Evaluation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//in this class the software evaluation is performed
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evaluation frame = new Evaluation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Evaluation() {
		setTitle("Digital Ordering System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setValue(3);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 14));
		slider.setPaintTicks(true);
		slider.setMinimum(1);
		slider.setMaximum(5);
		slider.setBounds(142, 227, 362, 77);
		contentPane.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(152, 324, 78, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(234, 324, 77, 34);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("3");
		lblNewLabel_4.setForeground(new Color(255, 140, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(321, 324, 78, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("4");
		lblNewLabel_5.setForeground(new Color(0, 204, 51));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(409, 324, 79, 34);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("5");
		lblNewLabel_6.setForeground(new Color(51, 153, 51));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(488, 324, 65, 34);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("\u039F\u039A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Menu1 frame = new Menu1();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(527, 404, 90, 46);
		contentPane.add(btnNewButton);
		
		JLabel message1 = new JLabel("\u0397 \u03C0\u03B1\u03C1\u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1 \u03C3\u03B1\u03C2 \u03AD\u03C7\u03B5\u03B9 \u03BA\u03B1\u03C4\u03B1\u03C7\u03C9\u03C1\u03B7\u03B8\u03B5\u03AF \u03BA\u03B1\u03B9 \u03B8\u03B1 \u03C4\u03B7\u03BD \u03C0\u03B1\u03C1\u03B1\u03BB\u03AC\u03B2\u03B5\u03C4\u03B5 \u03B1\u03C0\u03CC \u03C4\u03BF \u03C4\u03B1\u03BC\u03B5\u03AF\u03BF");
		message1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		message1.setBounds(91, 11, 462, 77);
		contentPane.add(message1);
		
		JLabel lblNewLabel = new JLabel("\u03A0\u03B1\u03C1\u03B1\u03BA\u03B1\u03BB\u03CE \u03B1\u03BE\u03B9\u03BF\u03BB\u03BF\u03B3\u03AE\u03C3\u03C4\u03B5 \u03C4\u03B7\u03BD \u03B5\u03BC\u03C0\u03B5\u03B9\u03C1\u03AF\u03B1 \u03C3\u03B1\u03C2 \u03BC\u03B5 \u03C4\u03BF \u03BB\u03BF\u03B3\u03B9\u03C3\u03BC\u03B9\u03BA\u03CC(\u03A0\u03C1\u03BF\u03B1\u03B9\u03C1\u03B5\u03C4\u03B9\u03BA\u03CC)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(91, 139, 462, 53);
		contentPane.add(lblNewLabel);
	}
}
