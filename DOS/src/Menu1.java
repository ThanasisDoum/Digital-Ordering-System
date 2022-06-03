import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import java.awt.Font;

public class Menu1 extends JFrame {
	
	/*Η συγκεκριμενη κλάση πραγματοποιεί την πλειοψηφια των λειτουργιών του προιόντος.Εδώ γίνεται η το άνοιγμα του μενού,
	 * η προσθήκη των προιόντων στο καλάθι του πελάτη, η επιλογή της ποσοτητας καθώς και η εμφάνιση του ποσού.
	 *   Στο τελικό παραδοτέο δεν υπάρχουν η επιλογή τραπεζιου, η δημιουργία λογαριασμού,ο διαχωρισμός μεταξύ πελάτη και προσωπικού καθώς
	 *   και η εμφάνιση της παραγγελιας σε περίπτωση που ο χρηστης επιλέξει να συνδεθεί ως "προσωπικό"
	 */
	
	String[] items = {"Κόκα κόλα", "Λεμονάδα", "Πορτοκαλάδα", "Γκαζόζα","Σόδα","Νερό","Χυμός πορτοκάλι","Χυμός ροδάκινο",
	"Χυμός βύσσινο","Χυμός μπανάνα","Τορτίγια λευκή καπνιστή γαλοπούλα","Τορτίγια ολικής άλεσης γαλοπούλα","Club sandwich","Mojito classic","Mojito strawberry","Mojito passion fruit","Mojito blueberry","Porn star martini","Daiquiri strawberry","Daiquiri passion fruit","Daiquiri blueberry","Paloma","Aperol spritz"};
	double[] prices= {1.5,1.5,1.5,1.5,1.5,0.5,1.5,1.5,1.5,1.5,3,3,4,6,6,6,6,6,6,6,6,7,6};
	int[] quantity= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	//οι τρεις αυτοί πίνακες αντιπροσωπεύουν τα ονόματα των προιόντων,τις τιμές και την ποσότητα που έχει επιλεξει ο χρήστης
	//ειναι παραλληλοι μεταξυ τους
	JButton contwithorder = new JButton("\u03A3\u03C5\u03BD\u03AD\u03C7\u03B5\u03B9\u03B1");
	JTextArea order = new JTextArea();
	JTextArea totalcostshown = new JTextArea();
	double total;
	static boolean shown=false;

	private JPanel contentPane;


	public static void main(String[] args) {
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


	public Menu1() {
		setTitle("Digital Ordering System");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 285, 343);
		contentPane.add(tabbedPane);
		
		JPanel refreshments = new JPanel();
		tabbedPane.addTab("Αναψυκτικά", null, refreshments, null);
		refreshments.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 280, 318);
		refreshments.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u039A\u03CC\u03BA\u03B1 \u03BA\u03CC\u03BB\u03B1");
		lblNewLabel.setBounds(10, 11, 80, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u039B\u03B5\u03BC\u03BF\u03BD\u03AC\u03B4\u03B1");
		lblNewLabel_1.setBounds(10, 36, 80, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u03A0\u03BF\u03C1\u03C4\u03BF\u03BA\u03B1\u03BB\u03AC\u03B4\u03B1");
		lblNewLabel_2.setBounds(10, 61, 80, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0393\u03BA\u03B1\u03B6\u03CC\u03B6\u03B1");
		lblNewLabel_3.setBounds(10, 86, 53, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u03A3\u03CC\u03B4\u03B1");
		lblNewLabel_4.setBounds(10, 111, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u039D\u03B5\u03C1\u03CC");
		lblNewLabel_5.setBounds(10, 136, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u03A7\u03C5\u03BC\u03CC\u03C2 \u03A0\u03BF\u03C1\u03C4\u03BF\u03BA\u03AC\u03BB\u03B9");
		lblNewLabel_6.setBounds(10, 161, 98, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u03A7\u03C5\u03BC\u03CC\u03C2 \u03A1\u03BF\u03B4\u03AC\u03BA\u03B9\u03BD\u03BF");
		lblNewLabel_7.setBounds(10, 186, 92, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u03A7\u03C5\u03BC\u03CC\u03C2 \u039C\u03C0\u03B1\u03BD\u03AC\u03BD\u03B1");
		lblNewLabel_8.setBounds(10, 208, 92, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u03A7\u03C5\u03BC\u03CC\u03C2 \u0392\u03CD\u03C3\u03C3\u03B9\u03BD\u03BF");
		lblNewLabel_9.setBounds(10, 233, 92, 14);
		panel.add(lblNewLabel_9);
		
		JButton a1 = new JButton("+");
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[0]++;//σε κάθε κουμπί "+" αυξάνεται το αντίστοιχο κελί του πίνακα quantity
				printOrder();
			}
		});
		a1.setBounds(178, 9, 41, 19);
		panel.add(a1);
		
		JButton a2 = new JButton("+");
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[1]++;
				printOrder();
			}
		});
		a2.setBounds(178, 34, 41, 19);
		panel.add(a2);
		
		JButton a3 = new JButton("+");
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[2]++;
				printOrder();
			}
		});
		a3.setBounds(178, 59, 41, 19);
		panel.add(a3);
		
		JButton a4 = new JButton("+");
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[3]++;
				printOrder();
			}
		});
		a4.setBounds(178, 84, 41, 19);
		panel.add(a4);
		
		JButton a5 = new JButton("+");
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[4]++;
				printOrder();
			}
		});
		a5.setBounds(178, 109, 41, 19);
		panel.add(a5);
		
		JButton a6 = new JButton("+");
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[5]++;
				printOrder();
			}
		});
		a6.setBounds(178, 134, 41, 19);
		panel.add(a6);
		
		JButton a7 = new JButton("+");
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[6]++;
				printOrder();
			}
		});
		a7.setBounds(178, 159, 41, 19);
		panel.add(a7);
		
		JButton a8 = new JButton("+");
		a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[7]++;
				printOrder();
			}
		});
		a8.setBounds(178, 184, 41, 19);
		panel.add(a8);
		
		JButton a9 = new JButton("+");
		a9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[8]++;
				printOrder();
			}
		});
		a9.setBounds(178, 206, 41, 19);
		panel.add(a9);
		
		JButton a10 = new JButton("+");
		a10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[9]++;
				printOrder();
			}
		});
		a10.setBounds(178, 231, 41, 19);
		panel.add(a10);
		
		JButton r1 = new JButton("-");
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[0]>0) {//σε κάθε κουμπί "-" μειώνεται το αντίστοιχο κελί του πίνακα quantity, αφού πρώτα ελεγχτεί ότι η ποσότητα είναι τουλάχιστον 1
					quantity[0]--;//με αυτόν τον τρόπο δεν μπορεί να εισαχθεί αρνητική ποσότητα
					printOrder();
				}
			}
		});
		r1.setBounds(229, 9, 41, 19);
		panel.add(r1);
		
		JButton r2 = new JButton("-");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[1]>0) {
					quantity[1]--;
					printOrder();
				}
			}
		});
		r2.setBounds(229, 34, 41, 19);
		panel.add(r2);
		
		JButton r3 = new JButton("-");
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[2]>0) {
					quantity[2]--;
					printOrder();
					}
			}
		});
		r3.setBounds(229, 59, 41, 19);
		panel.add(r3);
		
		JButton r4 = new JButton("-");
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[3]>0) {
					quantity[3]--;
					printOrder();
					}
			}
		});
		r4.setBounds(229, 84, 41, 19);
		panel.add(r4);
		
		JButton r5 = new JButton("-");
		r5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[4]>0) {
					quantity[4]--;
					printOrder();
					}
			}
		});
		r5.setBounds(229, 109, 41, 19);
		panel.add(r5);
		
		JButton r6 = new JButton("-");
		r6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[5]>0) {
					quantity[5]--;
					printOrder();
					}
			}
		});
		r6.setBounds(229, 134, 41, 19);
		panel.add(r6);
		
		JButton r7 = new JButton("-");
		r7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[6]>0) {
					quantity[6]--;
					printOrder();
					}
			}
		});
		r7.setBounds(229, 159, 41, 19);
		panel.add(r7);
		
		JButton r8 = new JButton("-");
		r8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[7]>0) {
					quantity[7]--;
					printOrder();
					}
			}
		});
		r8.setBounds(229, 184, 41, 19);
		panel.add(r8);
		
		JButton r9 = new JButton("-");
		r9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[8]>0) {
					quantity[8]--;
					printOrder();
					}
			}
		});
		r9.setBounds(229, 206, 41, 19);
		panel.add(r9);
		
		JButton r10 = new JButton("-");
		r10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[9]>0) {
					quantity[9]--;
					printOrder();
					}
			}
		});
		r10.setBounds(229, 231, 41, 19);
		panel.add(r10);
		
		JLabel lblNewLabel_10 = new JLabel("1.5");
		lblNewLabel_10.setBounds(139, 11, 29, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("1.5");
		lblNewLabel_10_1.setBounds(139, 36, 29, 14);
		panel.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("1.5");
		lblNewLabel_10_2.setBounds(139, 61, 29, 14);
		panel.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("1.5");
		lblNewLabel_10_3.setBounds(139, 86, 29, 14);
		panel.add(lblNewLabel_10_3);
		
		JLabel lblNewLabel_10_4 = new JLabel("1.5");
		lblNewLabel_10_4.setBounds(139, 111, 29, 14);
		panel.add(lblNewLabel_10_4);
		
		JLabel lblNewLabel_10_5 = new JLabel("0.5");
		lblNewLabel_10_5.setBounds(139, 136, 29, 14);
		panel.add(lblNewLabel_10_5);
		
		JLabel lblNewLabel_10_6 = new JLabel("1.5");
		lblNewLabel_10_6.setBounds(139, 161, 29, 14);
		panel.add(lblNewLabel_10_6);
		
		JLabel lblNewLabel_10_7 = new JLabel("1.5");
		lblNewLabel_10_7.setBounds(139, 186, 29, 14);
		panel.add(lblNewLabel_10_7);
		
		JLabel lblNewLabel_10_8 = new JLabel("1.5");
		lblNewLabel_10_8.setBounds(139, 208, 29, 14);
		panel.add(lblNewLabel_10_8);
		
		JLabel lblNewLabel_10_9 = new JLabel("1.5");
		lblNewLabel_10_9.setBounds(139, 233, 29, 14);
		panel.add(lblNewLabel_10_9);
		
		JPanel foods = new JPanel();
		tabbedPane.addTab("Φαγητά", null, foods, null);
		foods.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 280, 318);
		foods.add(panel_1);
		
		JLabel lblNewLabel_11 = new JLabel("\u03A4\u03BF\u03C1\u03C4\u03AF\u03B3\u03B9\u03B1 \u03BB\u03B5\u03C5\u03BA\u03AE \u03BC\u03B5");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_11.setBounds(10, 11, 125, 19);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u03A4\u03BF\u03C1\u03C4\u03AF\u03B3\u03B9\u03B1 \u03BF\u03BB\u03B9\u03BA\u03AE\u03C2 ");
		lblNewLabel_2_1.setBounds(10, 61, 98, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("\u03AC\u03BB\u03B5\u03C3\u03B7\u03C2 \u03B3\u03B1\u03BB\u03BF\u03C0\u03BF\u03CD\u03BB\u03B1");
		lblNewLabel_3_1.setBounds(10, 86, 125, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Club Sandwitch");
		lblNewLabel_5_1.setBounds(10, 111, 98, 14);
		panel_1.add(lblNewLabel_5_1);
		
		JButton a11 = new JButton("+");
		a11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[10]++;
				printOrder();
			}
		});
		a11.setBounds(178, 34, 41, 19);
		panel_1.add(a11);
		
		JButton a12 = new JButton("+");
		a12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[11]++;
				printOrder();
			}
		});
		a12.setBounds(178, 84, 41, 19);
		panel_1.add(a12);
		
		JButton a13 = new JButton("+");
		a13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity[12]++;
				printOrder();
			}
		});
		a13.setBounds(178, 109, 41, 19);
		panel_1.add(a13);
		
		JButton r11 = new JButton("-");
		r11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[10]>0) {
					quantity[10]--;
					printOrder();
					}
			}
		});
		r11.setBounds(229, 34, 41, 19);
		panel_1.add(r11);
		
		JButton r12 = new JButton("-");
		r12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[11]>0) {
					quantity[11]--;
					printOrder();
					}
			}
		});
		r12.setBounds(229, 84, 41, 19);
		panel_1.add(r12);
		
		JButton r13 = new JButton("-");
		r13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[12]>0) {
					quantity[12]--;
					printOrder();
					}
			}
		});
		r13.setBounds(229, 109, 41, 19);
		panel_1.add(r13);
		
		JLabel lblNewLabel_10_10 = new JLabel("3");
		lblNewLabel_10_10.setBounds(139, 34, 29, 14);
		panel_1.add(lblNewLabel_10_10);
		
		JLabel lblNewLabel_10_3_1 = new JLabel("3");
		lblNewLabel_10_3_1.setBounds(139, 86, 29, 14);
		panel_1.add(lblNewLabel_10_3_1);
		
		JLabel lblNewLabel_10_5_1 = new JLabel("4");
		lblNewLabel_10_5_1.setBounds(139, 111, 29, 14);
		panel_1.add(lblNewLabel_10_5_1);
		
		JLabel lblNewLabel_12 = new JLabel("\u03BA\u03B1\u03C0\u03BD\u03B9\u03C3\u03C4\u03AE \u03B3\u03B1\u03BB\u03BF\u03C0\u03BF\u03CD\u03BB\u03B1");
		lblNewLabel_12.setBounds(10, 36, 125, 14);
		panel_1.add(lblNewLabel_12);
		
		JPanel drinks = new JPanel();
		tabbedPane.addTab("Ποτά", null, drinks, null);
		drinks.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 280, 318);
		drinks.add(panel_2);
		
		JLabel lblMojitoClassic = new JLabel("Mojito classic");
		lblMojitoClassic.setBounds(10, 11, 80, 14);
		panel_2.add(lblMojitoClassic);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mojito strawberry");
		lblNewLabel_1_1.setBounds(10, 36, 119, 14);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mojito passion fruit");
		lblNewLabel_2_2.setBounds(10, 61, 119, 14);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Mojito blueberry");
		lblNewLabel_3_2.setBounds(10, 86, 119, 14);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Porn star martini");
		lblNewLabel_4_1.setBounds(10, 111, 119, 14);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Daiquiri strawberry");
		lblNewLabel_5_2.setBounds(10, 136, 119, 14);
		panel_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_1 = new JLabel("Daiquiri passion fruit");
		lblNewLabel_6_1.setBounds(10, 161, 119, 14);
		panel_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Daiquiri blueberry");
		lblNewLabel_7_1.setBounds(10, 186, 119, 14);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Paloma");
		lblNewLabel_8_1.setBounds(10, 208, 119, 14);
		panel_2.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Aperol spritz");
		lblNewLabel_9_1.setBounds(10, 233, 119, 14);
		panel_2.add(lblNewLabel_9_1);
		
		JButton a14 = new JButton("+");
		a14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
					quantity[13]++;
					printOrder();
				}else showmessage();

				
			}
		});
		a14.setBounds(178, 9, 41, 19);
		panel_2.add(a14);
		
		JButton a15 = new JButton("+");
		a15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[14]++;
				printOrder();
				}else showmessage();
			}
		});
		a15.setBounds(178, 34, 41, 19);
		panel_2.add(a15);
		
		JButton a16 = new JButton("+");
		a16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[15]++;
				printOrder();
				}else showmessage();
			}
		});
		a16.setBounds(178, 59, 41, 19);
		panel_2.add(a16);
		
		JButton a17 = new JButton("+");
		a17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[16]++;
				printOrder();
				}else showmessage();
			}
		});
		a17.setBounds(178, 84, 41, 19);
		panel_2.add(a17);
		
		JButton a18 = new JButton("+");
		a18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[17]++;
				printOrder();
			}else showmessage();

			}
		});
		a18.setBounds(178, 109, 41, 19);
		panel_2.add(a18);
		
		JButton a19 = new JButton("+");
		a19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[18]++;
				printOrder();
			}else showmessage();

			}
		});
		a19.setBounds(178, 134, 41, 19);
		panel_2.add(a19);
		
		JButton a20 = new JButton("+");
		a20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[19]++;
				printOrder();
			}else showmessage();

			}
		});
		a20.setBounds(178, 159, 41, 19);
		panel_2.add(a20);
		
		JButton a21 = new JButton("+");
		a21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[20]++;
				printOrder();
			}else showmessage();

			}
		});
		a21.setBounds(178, 184, 41, 19);
		panel_2.add(a21);
		
		JButton a22 = new JButton("+");
		a22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[21]++;
				printOrder();
			}else showmessage();

			}
		});
		a22.setBounds(178, 206, 41, 19);
		panel_2.add(a22);
		
		JButton a23 = new JButton("+");
		a23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shown) {
				quantity[22]++;
				printOrder();
			}else showmessage();

			}
		});
		a23.setBounds(178, 231, 41, 19);
		panel_2.add(a23);
		
		JButton r14 = new JButton("-");
		r14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[13]>0) {
					quantity[13]--;
					printOrder();
					}
			}
		});
		r14.setBounds(229, 9, 41, 19);
		panel_2.add(r14);
		
		JButton r15 = new JButton("-");
		r15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[14]>0) {
					quantity[14]--;
					printOrder();
					}
			}
		});
		r15.setBounds(229, 34, 41, 19);
		panel_2.add(r15);
		
		JButton r16 = new JButton("-");
		r16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[15]>0) {
					quantity[15]--;
					printOrder();
					}
			}
		});
		r16.setBounds(229, 59, 41, 19);
		panel_2.add(r16);
		
		JButton r17 = new JButton("-");
		r17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[16]>0) {
					quantity[16]--;
					printOrder();
					}
			}
		});
		r17.setBounds(229, 84, 41, 19);
		panel_2.add(r17);
		
		JButton r18 = new JButton("-");
		r18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[17]>0) {
					quantity[17]--;
					printOrder();
					}
			}
		});
		r18.setBounds(229, 109, 41, 19);
		panel_2.add(r18);
		
		JButton r19 = new JButton("-");
		r19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[18]>0) {
					quantity[18]--;
					printOrder();
					}
			}
		});
		r19.setBounds(229, 134, 41, 19);
		panel_2.add(r19);
		
		JButton r20 = new JButton("-");
		r20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[19]>0) {
					quantity[19]--;
					printOrder();
					}
			}
		});
		r20.setBounds(229, 159, 41, 19);
		panel_2.add(r20);
		
		JButton r21 = new JButton("-");
		r21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[20]>0) {
					quantity[20]--;
					printOrder();
					}
			}
		});
		r21.setBounds(229, 184, 41, 19);
		panel_2.add(r21);
		
		JButton r22 = new JButton("-");
		r22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[21]>0) {
					quantity[21]--;
					printOrder();
					}
			}
		});
		r22.setBounds(229, 206, 41, 19);
		panel_2.add(r22);
		
		JButton r23 = new JButton("-");
		r23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (quantity[22]>0) {
					quantity[22]--;
					printOrder();
					}
			}
		});
		r23.setBounds(229, 231, 41, 19);
		panel_2.add(r23);
		
		JLabel lblNewLabel_10_11 = new JLabel("6");
		lblNewLabel_10_11.setBounds(139, 11, 29, 14);
		panel_2.add(lblNewLabel_10_11);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("6");
		lblNewLabel_10_1_1.setBounds(139, 36, 29, 14);
		panel_2.add(lblNewLabel_10_1_1);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("6");
		lblNewLabel_10_2_1.setBounds(139, 61, 29, 14);
		panel_2.add(lblNewLabel_10_2_1);
		
		JLabel lblNewLabel_10_3_2 = new JLabel("6");
		lblNewLabel_10_3_2.setBounds(139, 86, 29, 14);
		panel_2.add(lblNewLabel_10_3_2);
		
		JLabel lblNewLabel_10_4_1 = new JLabel("6");
		lblNewLabel_10_4_1.setBounds(139, 111, 29, 14);
		panel_2.add(lblNewLabel_10_4_1);
		
		JLabel lblNewLabel_10_5_2 = new JLabel("6");
		lblNewLabel_10_5_2.setBounds(139, 136, 29, 14);
		panel_2.add(lblNewLabel_10_5_2);
		
		JLabel lblNewLabel_10_6_1 = new JLabel("6");
		lblNewLabel_10_6_1.setBounds(139, 161, 29, 14);
		panel_2.add(lblNewLabel_10_6_1);
		
		JLabel lblNewLabel_10_7_1 = new JLabel("6");
		lblNewLabel_10_7_1.setBounds(139, 186, 29, 14);
		panel_2.add(lblNewLabel_10_7_1);
		
		JLabel lblNewLabel_10_8_1 = new JLabel("7");
		lblNewLabel_10_8_1.setBounds(139, 208, 29, 14);
		panel_2.add(lblNewLabel_10_8_1);
		
		JLabel lblNewLabel_10_9_1 = new JLabel("6");
		lblNewLabel_10_9_1.setBounds(139, 233, 29, 14);
		panel_2.add(lblNewLabel_10_9_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(305, 25, 285, 379);
		contentPane.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		//JTextArea order = new JTextArea();
		order.setEditable(false);
		order.setBounds(0, 0, 283, 376);
		panel_3.add(order);
		
		JLabel totalcost = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF:");
		totalcost.setBounds(20, 365, 98, 14);
		totalcost.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(totalcost);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(128, 365, 96, 26);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		totalcostshown.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		//JTextArea totalcostshown = new JTextArea();
		totalcostshown.setEditable(false);
		totalcostshown.setBounds(0, 0, 96, 15);
		panel_4.add(totalcostshown);
		
		contwithorder.setEnabled(false);
		contwithorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							ConfirmOrder frame = new ConfirmOrder();
							frame.lastdetails(total, items, quantity, prices);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		contwithorder.setBounds(344, 415, 246, 35);
		contentPane.add(contwithorder);
		
		
		
	}
	public void printOrder() {
				
		//Εκτύπωση της παραγγελίας.Ελέγχεται ο πίνακας με τις ποσότητες και όπου εμφανίζεται ποσότητα >0 εκυπώνονται τα αντίστοιχα κελιά 
		//των πινάκων με τα ονόματα και τις τιμές
		order.selectAll();
		order.replaceSelection("");
		 for (int i=0;i<23;i++) {
			if (quantity[i]>0) {
				order.append(quantity[i]+".00 X "+items[i]+"  "+ quantity[i]*prices[i] + "\n");
			}
		}
		 showtotalcost();
	}
	public void showtotalcost() {
		
		//εμφάνιση του συνολικού κόστους της παραγγελίας
		totalcostshown.selectAll();
		totalcostshown.replaceSelection("");
		total=0;
		for (int i=0;i<=22;i++) {
			total+=quantity[i]*prices[i];
			totalcostshown.setText(""+total);
			
		}
		if (total>0) {
			contwithorder.setEnabled(true);
		}else contwithorder.setEnabled(false);
	}
	public void showmessage() {
		//εμφάνιση προειδοποίησης στην πρώτη προσθήκη που πάει να κάνει ο χρήστης από την κατηγορία "Ποτά"
		if(!shown) {
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
	}
	public static void messageshown() {
		//αφού η προειδοποίηση εμφανίστηκε ήδη και ο χρήστης επιβεβαίωσε ότι είναι >18 η μεταβλητή με την οποία πραγματοποιήται
		//ο έλεγχος γίνεται αληθής 
		shown=true;
	}
}
