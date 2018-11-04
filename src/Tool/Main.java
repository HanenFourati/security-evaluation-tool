package Tool;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JButton;














import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.JScrollBar;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	private JFrame frmSecurityEvaluation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmSecurityEvaluation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	int i=0;
	private void initialize() {
		frmSecurityEvaluation = new JFrame();
		frmSecurityEvaluation.setResizable(false);
		frmSecurityEvaluation.setFont(new Font("Arial", Font.BOLD, 12));
		frmSecurityEvaluation.setTitle("Security Evaluation ");
		frmSecurityEvaluation.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\logo1.png"));
		frmSecurityEvaluation.setBounds(0, 0, 1366, 750);
		
		frmSecurityEvaluation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSecurityEvaluation.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1366, 721);
		frmSecurityEvaluation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(0, 0, 254, 741);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 128, 128));
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(0, 397, 254, 42);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(250, 0, 1366, 56);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(new Color(0, 128, 128));
		panel_4.setBackground(new Color(0, 139, 139));
		panel_4.setBounds(0, 346, 254, 42);
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setForeground(new Color(0, 128, 128));
		panel_5.setBackground(new Color(0, 139, 139));
		panel_5.setBounds(0, 293, 254, 42);
		panel_1.add(panel_5);
		
		JLabel lblSecrityEvaluationconfidentialityMeasure = new JLabel("Secrity Evaluation");
		lblSecrityEvaluationconfidentialityMeasure.setForeground(new Color(255, 255, 255));
		lblSecrityEvaluationconfidentialityMeasure.setFont(new Font("Arial", Font.BOLD, 12));
		lblSecrityEvaluationconfidentialityMeasure.setBounds(10, 30, 580, 15);
		panel_2.add(lblSecrityEvaluationconfidentialityMeasure);
		
		
		
		
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(260, 55, 1366, 862);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		Confidentiality n = new Confidentiality();
		n.setBounds(0, 0,1366, 700);
		panel_6.add(n);
		n.setVisible(false);
		n.setLayout(null);
		
		
	
		NonRepudiation nn = new NonRepudiation();
		nn.setBounds(0, 0,1366, 700);
		panel_6.add(nn);
		nn.setVisible(false);
		nn.setLayout(null);
	    
		
		Home nnn = new Home();
		nnn.setBounds(0, 0, 1366, 700);
		panel_6.add(nnn);
		nnn.setVisible(true);
		nnn.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 128, 128));
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			 
				
			}
		});
		panel_7.setBounds(1074, 24, 28, 21);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 28, 21);
		panel_7.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				n.textField.setText("");
				n.label_2.setText("Confidentiality Level = ");
				n.label.setText("FSM(Sq) = ");
				n.label_1.setText("SS(Sq) = ");
				n.lblCryptographyAlgorithem.setText("cryptography Algorithm  = ");
				n.label_3.setText("");
				n.textArea_2.setText("");
				n.labeltree.setText("");
				TableModel mh=n.table.getModel();
				for (int n=mh.getRowCount()-1; n>=0; n--) 
					((DefaultTableModel)mh).removeRow(n); 
				n.label_1.setVisible(false);
				n.label_2.setVisible(false);
				n.lblCryptographyAlgorithem.setVisible(false);
				n.label.setVisible(false);
				n.label.setVisible(false);
				n.scrollPane_4.setVisible(false);
				n.label_3.setVisible(false);
				n.textArea_2.setVisible(false);
				n.labeltree.setVisible(false);
				//n.TestRedirect();
				//n.lblNewLabel_2.setText("Classification = ");
				//n.lblNewLabel_1.setText("");
				//n.lblNewLabel_3.setText("");
				nn.label.setText("FSM(Sq) = ");
				nn.label_1.setText("SS(Sq) = ");
				nn.label_2.setText("Non-Repudiation Level = ");
				nn.label_3.setText("Hush Function = ");
				nn.label_4.setText("Digital Signature Algorithm = ");
				//nn.lblClassification_1.setText("Classification = ");
				//nn.lblClassification.setText("Classification = ");
				//nn.lblNewLabel_3.setText("");
				nn.inputlabel.setText("");
				nn.textArea_1.setText("");
				nn.treeLabel.setText("");
				TableModel m=nn.table.getModel();
				for (int n=m.getRowCount()-1; n>=0; n--) 
					((DefaultTableModel)m).removeRow(n); 
				TableModel m2=nn.table1.getModel();
				for (int n=m2.getRowCount()-1; n>=0; n--) 
					((DefaultTableModel)m2).removeRow(n);
				nn.label_1.setVisible(false);
				nn.label_2.setVisible(false);
				nn.label_3.setVisible(false);
				nn.label_4.setVisible(false);
				nn.label.setVisible(false);
				nn.scrollPane_1.setVisible(false);
				nn.scrollPane_2.setVisible(false);
				nn.inputlabel.setVisible(false);
				nn.textArea_1.setVisible(false);
				nn.treeLabel.setVisible(false);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\if_refresh_54353 (2).png"));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(i==2) //confidetiality
				{
					try {
			    	String filesave=null;
			    	//JFileChooser  fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			    	JFileChooser fileChooser = new JFileChooser();
			    	fileChooser.setDialogTitle("Specify a file to save");   
			    	 
			    	int userSelection = fileChooser.showSaveDialog(null);
			    	 
			    	if (userSelection == JFileChooser.APPROVE_OPTION) {
			    	    File fileToSave = fileChooser.getSelectedFile();
			    	    filesave=fileToSave.getAbsolutePath();
			    	}
			    	
			    	
		            String lab ="<html> <head style=\"color:#ff6600;\"> <img src=\"C:/Users/fourati/Documents/pj/SecurityEvaluationTool/src/images/logoimp.png\" "
		            		+ "alt=\"Security Evaluation Tool\" > "
		            		+ "Security Evaluation Tool  <hr style=\"color:#000000\" />  </head>  <body> <p align=\"justify\" > <h2 style=\"color:#339966;\"> Confidentiality Level : </h2> <br>"+n.lblNewLabel_1.getText()+": "
		            +n.choice.getSelectedItem()+"<br>"+" <h2 style=\"color:#339966;\"> Inputs : </h2> <br>"+n.label.getText()+"<br>"+n.label_1.getText()+"<br>"+n.label_2.getText()
		            +"<br>"+n.lblCryptographyAlgorithem.getText()+"<br>"+" <h2 style=\"color:#339966;\"> Output : </h2> <br>"+n.label_3.getText()+"<br>"+" <h2 style=\"color:#339966;\"> Tree :</h2> <br>"
		            +"</p>"+n.labeltree.getText()+"<br>"+n.textArea_2.getText()+"</body></html>";
		            File newTextFile = new File(filesave+".doc");

		            FileWriter fw = new FileWriter(newTextFile+".doc");
		            fw.write(lab); //<h1 style=\"color:#ff6600;\"> </h1> 
		            fw.close();

		        } catch (IOException iox) {
		            //do stuff with exception
		            iox.printStackTrace();
		        }}
				else if (i==1) //nonrepudiation
				{
					try {
				    	String filesave=null;
				    	//JFileChooser  fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				    	JFileChooser fileChooser = new JFileChooser();
				    	fileChooser.setDialogTitle("Specify a file to save");   
				    	 
				    	int userSelection = fileChooser.showSaveDialog(null);
				    	 
				    	if (userSelection == JFileChooser.APPROVE_OPTION) {
				    	    File fileToSave = fileChooser.getSelectedFile();
				    	    filesave=fileToSave.getAbsolutePath();
				    	}
				    	
				    
			            String lab ="<html> <head style=\"color:#ff6600;\"> <img src=\"C:/Users/fourati/Documents/pj/SecurityEvaluationTool/src/images/logoimp.png\" "
			            		+ "alt=\"Security Evaluation Tool\" > "
			            		+ "Security Evaluation Tool  <hr style=\"color:#000000\" />  </head>  <body> <p align=\"justify\" > <h2 style=\"color:#339966;\"> Non-Repudiation Level : </h2> "+nn.lblNewLabel_1.getText()+": "
			            		+nn.choice.getSelectedItem()+"<br>"+"<h2 style=\"color:#339966;\">  Inputs : </h2> <br>"+nn.label.getText()+"<br>"+nn.label_1.getText()+"<br>"+nn.label_2.getText()+
			            		"<br>"+nn.label_4.getText()+"<br>"+nn.label_3.getText()+"<br>"+" <h2 style=\"color:#339966;\"> Output : </h2> <br>"+nn.inputlabel.getText()+"<br>"+"<h2 style=\"color:#339966;\"> Tree : </h2> <br>"
			            		+"</p>"+nn.treeLabel.getText()+"<br>"+nn.textArea_1.getText()+"</body></html>";
			            File newTextFile = new File(filesave);

			            FileWriter fw = new FileWriter(newTextFile+".doc");
			            fw.write(lab); //<h1 style=\"color:#ff6600;\"> </h1> 
			            fw.close();

			        } catch (IOException iox) {
			            //do stuff with exception
			            iox.printStackTrace();
			        }
				}
				
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\if_finished-work_54311 (1).png"));
		lblNewLabel_2.setBounds(1051, 24, 28, 15);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		JLabel lblNonrepudiationMeasure = new JLabel("  Non-repudiation Measure");
		lblNonrepudiationMeasure.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\if_link_54328 (1).png"));
		JLabel lblHelp = new JLabel("  Home");
		lblHelp.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\if_home_54321 (1).png"));
		JLabel lblNewLabel = new JLabel("Confidentiality Measure");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\if_lock_54329 (1).png"));
		lblNewLabel.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent arg0) {
				
			}
		});
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				//panel_3.setBackground(Color.WHITE);
				lblNewLabel.setForeground(Color.orange);
				panel_4.setBackground(new Color(0, 139, 139));
			    lblNonrepudiationMeasure.setForeground(Color.WHITE);
				panel_5.setBackground(new Color(0, 139, 139));
				lblHelp.setForeground(Color.WHITE);
				
			}
		});
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
				panel_4.setBackground(new Color(0, 139, 139));
				panel_5.setBackground(new Color(0, 139, 139));
				//"panel_3.setBackground(Color.white);
				lblNewLabel.setForeground(Color.orange);
				lblSecrityEvaluationconfidentialityMeasure.setText("Secrity Evaluation/Confidentiality Measure/Data encryption");
				n.setVisible(true);
				nn.setVisible(false);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);
				i=2;
			}
		});
		lblNewLabel.setBounds(10, 0, 244, 42);
		panel_3.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		
		
		
		
		lblNonrepudiationMeasure.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				//panel_4.setBackground(Color.orange);
				lblNonrepudiationMeasure.setForeground(Color.orange);
				panel_3.setBackground(new Color(0, 139, 139));
				lblNewLabel.setForeground(Color.WHITE);
				panel_5.setBackground(new Color(0, 139, 139));
				lblHelp.setForeground(Color.WHITE);
			}
		});
		lblNonrepudiationMeasure.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent arg0) {
				
			}
		});
		lblNonrepudiationMeasure.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				panel_3.setBackground(new Color(0, 139, 139));
				panel_5.setBackground(new Color(0, 139, 139));
				//panel_4.setBackground(Color.white);
				lblNonrepudiationMeasure.setForeground(Color.orange);
				lblSecrityEvaluationconfidentialityMeasure.setText("Secrity Evaluation/Non-Repudiation Measure");
				n.setVisible(false);
				nnn.setVisible(false);
				nn.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);
				i=1;
			}
		});
		lblNonrepudiationMeasure.setBounds(10, 0, 244, 42);
		panel_4.add(lblNonrepudiationMeasure);
		lblNonrepudiationMeasure.setForeground(Color.WHITE);
		lblNonrepudiationMeasure.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\fourati\\Documents\\pj\\SecurityEvaluationTool\\src\\images\\security-shield-icon-32307.png"));
		label.setBounds(0, 0, 243, 256);
		panel_1.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 258, 195, 9);
		panel_1.add(separator);
		
		
		
		
		lblHelp.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
				//panel_5.setBackground(Color.WHITE);
				lblHelp.setForeground(Color.orange);
				panel_3.setBackground(new Color(0, 139, 139));
				lblNewLabel.setForeground(Color.WHITE);
				panel_4.setBackground(new Color(0, 139, 139));
				lblNonrepudiationMeasure.setForeground(Color.WHITE);
			}
		});
		lblHelp.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent arg0) {
				
			}
		});
		lblHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				panel_3.setBackground(new Color(0, 139, 139));
				panel_4.setBackground(new Color(0, 139, 139));
				//panel_5.setBackground(Color.white);
				lblHelp.setForeground(Color.orange);
				lblSecrityEvaluationconfidentialityMeasure.setText("Secrity Evaluation/Home");
				n.setVisible(false);
				nn.setVisible(false);
				nnn.setVisible(true);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
			}
		});
		lblHelp.setForeground(Color.WHITE);
		lblHelp.setFont(new Font("Arial", Font.BOLD, 12));
		lblHelp.setBounds(10, 0, 175, 42);
		panel_5.add(lblHelp);
	
		
		
	
	}
}
