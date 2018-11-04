package Tool;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home() {
		setLayout(null);
		setBounds(0, 0, 1366, 700);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0,1354,512);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 37, 396, 247);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\logo1.png"));
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Security Evaluation Tool");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(111, 295, 325, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblVersion = new JLabel("Version 0.1 \u00A9 2018 Security Evaluation Tool, All rights reserved.");
		lblVersion.setBackground(Color.GRAY);
		lblVersion.setFont(new Font("Arial", Font.ITALIC, 11));
		lblVersion.setBounds(374, 605, 370, 47);
		panel.add(lblVersion);
		
		JLabel lblNewLabel_2 = new JLabel("<html> <p align=\"justify\" > Security Evaluation Tool is one of the leading security evaluation tools that help you to measure confidentiality and non-repudiation in your web application from the design phase by analyzing UML sequence diagram. <br>You can check the security of your web application before reaching the implementation phase. Consequently,  it helps to  prevent any additional cost in terms of effort, time and budget  related to changes.<br>When you load a sequence diagram in XML or XMI format in the tool, it analyses it and shows the level of confidentiality or non-repudiation along with a set of recommendation.<br>\r\n<br>\r\nThis security evaluation tool was developed as part of a research master thesis at the Higher Institute of Computer science and Multimedia. Any additional information to support the tool or the thesis progresses are welcome.\r\n</p></html>");
		lblNewLabel_2.setForeground(new Color(47, 79, 79));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(468, 295, 597, 228);
		panel.add(lblNewLabel_2);
		
		JLabel lblFouratihanengmailcom = new JLabel("fouratihanen@gmail.com");
		lblFouratihanengmailcom.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFouratihanengmailcom.setForeground(new Color(255, 140, 0));
		lblFouratihanengmailcom.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\if_email_54308 (1).png"));
		lblFouratihanengmailcom.setBounds(898, 90, 174, 23);
		panel.add(lblFouratihanengmailcom);
		
		JLabel lblAsmasellamiisimsfrnutn = new JLabel("asma.sellami@isimsf.rnu.tn ");
		lblAsmasellamiisimsfrnutn.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAsmasellamiisimsfrnutn.setForeground(new Color(255, 140, 0));
		lblAsmasellamiisimsfrnutn.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\if_email_54308 (1).png"));
		lblAsmasellamiisimsfrnutn.setBounds(898, 22, 194, 23);
		panel.add(lblAsmasellamiisimsfrnutn);
		
		JLabel lblNadbouassidagmailcom = new JLabel("nadbouassida@gmail.com ");
		lblNadbouassidagmailcom.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNadbouassidagmailcom.setForeground(new Color(255, 140, 0));
		lblNadbouassidagmailcom.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\if_email_54308 (1).png"));
		lblNadbouassidagmailcom.setBounds(898, 56, 192, 23);
		panel.add(lblNadbouassidagmailcom);

	}
}
