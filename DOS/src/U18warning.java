import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U18warning extends JFrame {

	private JPanel contentPane;

	//σε αυτήν την κλάση πραγματοποιήται η προειδοποίηση την πρώτη φορά που θα προσπαθήσει να προσθέσει κάποιο αλκοολούχο ρόφημα στο καλάθι του
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U18warning frame = new U18warning();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public U18warning() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0393\u03B9\u03B1 \u03BD\u03B1 \u03C0\u03C1\u03BF\u03C7\u03C9\u03C1\u03AE\u03C3\u03B5\u03C4\u03B5 \u03C3\u03C4\u03B7\u03BD \u03B1\u03B3\u03BF\u03C1\u03AC \u03BF\u03C0\u03BF\u03BF\u03C5\u03B4\u03AE\u03C0\u03BF\u03C4\u03B5 \u03C0\u03C1\u03BF\u03B9\u03CC\u03BD\u03C4\u03BF\u03C2 \u03B1\u03C0\u03CC \u03C4\u03BF\u03BD \u03C3\u03C5\u03B3\u03BA\u03B5\u03BA\u03C1\u03B9\u03BC\u03AD\u03BD\u03BF");
		lblNewLabel.setBounds(10, 11, 414, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u03BA\u03B1\u03C4\u03AC\u03BB\u03BF\u03B3\u03BF \u03B8\u03B1 \u03C0\u03C1\u03AD\u03C0\u03B5\u03B9 \u03BD\u03B1 \u03B5\u03AF\u03C3\u03C4\u03B5 \u03AC\u03BD\u03C9 \u03C4\u03C9\u03BD 18");
		lblNewLabel_1.setBounds(10, 49, 414, 57);
		contentPane.add(lblNewLabel_1);
		
		JButton yes = new JButton("\u039D\u03B1\u03B9 \u03B5\u03AF\u03BC\u03B1\u03B9 \u03AC\u03BD\u03C9 \u03C4\u03C9\u03BD 18\r\n");
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu1.messageshown();
				dispose();
				}
		});
		yes.setBounds(10, 148, 166, 23);
		contentPane.add(yes);
		
		JButton no = new JButton("\u038C\u03C7\u03B9 \u03B5\u03AF\u03BC\u03B1\u03B9 \u03BA\u03AC\u03C4\u03C9 \u03C4\u03C9\u03BD 18");
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//αφού ο χρήστης επέλεξε ότι δεν είναι >18 δεν συμβαίνει τίποτα και η προειδοποίηση θα συνεχίσει να εμφανίζεται
				dispose();
			}
		});
		no.setBounds(10, 195, 166, 23);
		contentPane.add(no);
	}

}
