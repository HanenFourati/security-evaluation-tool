package Tool;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.PrintStream;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;

import java.awt.ScrollPane;
import java.awt.TextArea;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.Component;
import java.awt.Choice;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.Canvas;

import javax.swing.JTree;

public class NonRepudiation extends JPanel {
	
	
	
	 public void TestRedirect() {
	        EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	                } catch (ClassNotFoundException ex) {
	                } catch (InstantiationException ex) {
	                } catch (IllegalAccessException ex) {
	                } catch (UnsupportedLookAndFeelException ex) {
	                }

	                //CapturePane capturePane = new CapturePane();
	                //JFrame frame = new JFrame();
	               //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	               // frame.getContentPane().setLayout(new BorderLayout());
	                //frame.getContentPane().add(capturePane);
	               // frame.setSize(200, 200);
	               // frame.setLocationRelativeTo(null);
	              // frame.setVisible(true);

	                PrintStream ps = System.out;
	                System.setOut(new PrintStream(new StreamCapturer("",textArea_1, ps)));

	               // System.out.println("Hello, this is a test");
	               // System.out.println("Wave if you can see me");
	                
	                
	                Tree d=new Tree();
					Node<Integer> root = new Node<Integer>(xn);
					Node<Integer> rudd = new Node<Integer>(rud);
					Node<Integer> hf = new Node<Integer>(chchint);
					Node<Integer> ds = new Node<Integer>(chint);
					//d.test2(root,rud,hf,ds);
					NonRepudiationTreePrinter.printNode(d.test2(root,rudd,hf,ds));
					//textArea_1.setText(TreePrinter.ret());
					textArea_1.setText(NonRepudiationTreePrinter.ret());
					
					
	            }            
	        });
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public JTextField textField_1;
	JLabel label ;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JLabel label_4;
	JLabel lblClassification_1;
	JLabel lblClassification;
	JPanel panel_1;
	JPanel panel_5;
	JLabel lblNewLabel_1;
	public JTable table;
	public JTable table1;
	public Choice choice;
	private ScrollPane scrollPane;
	int chint;
	int ch1int;
	int chchint;
	int chch1int;
	int rud;
	int xn;
	TextArea textArea_1;
	JScrollPane scrollPane_2;
	JScrollPane scrollPane_1;
	JLabel inputlabel;
	JLabel treeLabel;
	
	/**
	 * Create the panel.
	 */
	public NonRepudiation() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0, 0, 1376, 862);
		//JScrollPane scrollPane_2 = new JScrollPane(table);
		//scrollPane_2.setBounds(0, 0, 1376, 862);
		//add(scrollPane_2);
		final String[ ][ ] Ds = {
				
                { "RSA 1024 bits", "weak"},  
                { "RSA 2048 bits", "secure"},
                { "DSA 1024 bits, 160 bits", "weak" },
                { "DSA 2048 bits, 224 bits", "secure"},
                { "DSA 2048 bits, 256 bits", "secure"},
                { "DSA 3072 bits, 256 bits ", "secure"},
                { "ECDSA", "secure"},
                }; 
		final String[ ][ ] Dsmost = {
				
	                { "RSA 2048 bits", "secure"},
	                { "DSA 2048 bits, 224 bits", "secure"},
	                { "DSA 2048 bits, 256 bits", "secure"},
	                { "DSA 3072 bits, 256 bits ", "secure"},
	                { "ECDSA", "secure"}, };
		
		
		final String[ ][ ] Dsbussiness = {
				
                { "RSA 2048 bits", "secure"},
                { "DSA 2048 bits, 224 bits", "secure"},
                { "DSA 2048 bits, 256 bits", "secure"},
                { "DSA 3072 bits, 256 bits ", "secure"}, };
		
		final String[ ][ ] Hf = {
				
                { " MD4", "weak"},  
                { " MD5", "weak"},
                { "RIPEMID 128 bits", "weak" },
                { "RIPEMID 160 bits", "secure"},
                { "SHA-0", "weak"},
                { "SHA-1 ", "weak"},
                { "SHA-2 224 bits", "secure"},
                { "SHA-2 256 bits", "secure"},
                { "SHA-2 384 bits", "secure"},
                { "SHA-2 512 bits", "secure"},
                { "SHA-3 224 bits", "secure"},
                { "SHA-3 256 bits", "secure"},
                { "SHA-3 384 bits", "secure"},
                { "SHA-3 512 bits", "secure"},
                { "Whirpool 512 bits", "secure"}
                };
		final String[ ][ ] Hfsecure = {
				
                { "RIPEMID 160 bits", "secure"},
                { "SHA-2 224 bits", "secure"},
                { "SHA-2 256 bits", "secure"},
                { "SHA-2 384 bits", "secure"},
                { "SHA-2 512 bits", "secure"},
                { "SHA-3 224 bits", "secure"},
                { "SHA-3 256 bits", "secure"},
                { "SHA-3 384 bits", "secure"},
                { "SHA-3 512 bits", "secure"},
                { "Whirpool 512 bits", "secure"}
                };
		
		label = new JLabel("FSM(Sq) = ");
		label.setForeground(new Color(128, 128, 128));
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setBounds(75, 206, 421, 37);
		add(label);
		
		label_1 = new JLabel("SS(Sq) = ");
		label_1.setForeground(new Color(128, 128, 128));
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(75, 235, 421, 37);
		add(label_1);
		
		 label_2 = new JLabel("Non-Repudiation Level = ");
		label_2.setForeground(new Color(128, 128, 128));
		label_2.setFont(new Font("Arial", Font.BOLD, 14));
		label_2.setBounds(75, 267, 421, 37);
		add(label_2);
		
		 label_3 = new JLabel("Hush Function =");
		label_3.setForeground(new Color(128, 128, 128));
		label_3.setFont(new Font("Arial", Font.BOLD, 14));
		label_3.setBounds(75, 330, 421, 37);
		add(label_3);
		
		label_4 = new JLabel("Digital Signature Algorithm =");
		label_4.setForeground(new Color(128, 128, 128));
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		label_4.setBounds(75, 298, 421, 37);
		add(label_4);
		label.setVisible(false);
		label_1.setVisible(false);
	    label_2.setVisible(false);
	    label_3.setVisible(false);
	    label_4.setVisible(false);
	   
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Input", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 11, 501, 137);
		add(panel_2);
		
		 lblClassification = new JLabel("");
		lblClassification.setForeground(Color.GRAY);
		lblClassification.setFont(new Font("Arial", Font.BOLD, 14));
		lblClassification.setBounds(81, 664, 387, 37);
		add(lblClassification);
		
		 lblClassification_1 = new JLabel("");
		lblClassification_1.setForeground(Color.GRAY);
		lblClassification_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblClassification_1.setBounds(131, 714, 421, 37);
		add(lblClassification_1);

		
		JLabel label_5 = new JLabel("Select File");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

				int returnValue = jfc.showOpenDialog(null);
				

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();
					textField_1.setText(selectedFile.getAbsolutePath());
					
				}
			}
			
		});
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Arial", Font.BOLD, 12));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(351, 37, 127, 25);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(351, 37, 127, 27);
		panel_2.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(0, 139, 139));
		panel_4.setBounds(351, 82, 127, 27);
		panel_2.add(panel_4);
		
		JLabel label_6 = new JLabel("Measure");
		
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				try {

					DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
					Document doc = docBuilder.parse (new File(textField_1.getText()));

					// normalize text representation
					final Element racine = doc.getDocumentElement();
					//doc.getDocumentElement ().normalize ();
					//System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName());
					final NodeList racineNoeuds = racine.getChildNodes();
					final int nbRacineNoeuds = racineNoeuds.getLength();
				//-------------------------------------------------------------------------------	
					final NodeList elt=racine.getElementsByTagName("UML:Class");
					// final int nb = elt.getLength();
					//System.out.println(nb);
					/*for (int i = 0; i<nb; i++) {
				    System.out.println(elt.item(i).getNodeName());
				   }*/
				// for(int j = 0; j<nb; j++)
				 //   {final Element msg = (Element) elt.item(j);
				   // System.out.println("time line name "+j+" : "+msg.getAttribute("name") );}
			//----------------------------------------------------------------------------------	 
				final NodeList elt2=racine.getElementsByTagName("messagewidget");
			final int nb2 = elt2.getLength();
				///System.out.println(nb2);
				String[] str = new String[nb2];
					for(int j = 0; j<nb2; j++) {
				 final Element msg = (Element) elt2.item(j);
				    //System.out.println("type de message"+j+" : "+msg.getAttribute("sequencemessagetype"));
				    
				    	 str[j] = msg.getAttribute("sequencemessagetype");
				    	}		
				   // for (int i = 0; i < str.length; i++) {
				   // System.out.println("in the cell " + i +" le type de message = " + str[i]);}
					int cfp=0;
				    for (int k = 0; k < str.length; k++) {
				    if(str[k].equals("1000"))
				   { //System.out.println("type de message"+k+" "+str[k]);
				     cfp=cfp+1; /* requperer dans le label */
				   	} 
				    }
				    label.setText(label.getText() +""+cfp+" CFP");
				  //  System.out.println("CFP = "+cfp);
				
			//---------------------------------------------------------------------------------------
				final NodeList elt3=racine.getElementsByTagName("floatingtext");
				final int nb3 = elt3.getLength();	
				String[] ts=new String[elt3.getLength()];
				String[] tss=new String[elt3.getLength()];
				for(int j = 0; j<nb3; j++) {
				    final Element msg = (Element) elt3.item(j);
				    System.out.println("messge text "+j+" : "+msg.getAttribute("text"));
				    ts[ j ]= msg.getAttribute("text");
				     tss[ j ]= msg.getAttribute("text"); }
				String ch=null;
				String ch1=null;
				for (int k = 0; k < tss.length; k++) {
				System.out.println("massege name of sequence "+k+" "+tss[k]);
				 if (tss[k].contains("hash")||tss[k].equals("hashing")||tss[k].equals("SHA-2")|| tss[k].equals("SHA-3")|| tss[k].equals("RIPEMID"))
			     {
					 String[] options = {"MD4", "MD5", "RIPEMID 128 bits", "RIPEMID 160 bits", "SHA-0", "SHA-1","SHA-2 224 bits",
							 "SHA-2 256 bits",
							 "SHA-2 384 bits","SHA-2 512 bits","SHA-3 224 bits","SHA-3 256 bits","SHA-3 384 bits",
							 "SHA-2 512 bits","nameWhirpool 512 bits"};
				        ImageIcon icon = new ImageIcon("C:/Users/fourati/Documents/pj/SecurityEvaluationTool/src/images/dialog-question.png");
				        String n = (String)JOptionPane.showInputDialog(null, "Hash Function Precision",
				                "Specify the used Hash Function", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
				        
				        System.out.println(n);
				        System.out.println("the message "+k+": "+tss[k]+"contain Hash funtion called ");
				        
				        if(n.contains("MD4")||n.contains("md4"))
						   { ch="MD4";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("MD5")||n.contains("md5"))
						   { ch="MD5";
						     ch1="weak";
						   System.out.println("the message "+ch); break; }
						   else if(n.contains("RIPEMID 128 bits")||n.contains("ripemid 128 bits"))
						   { ch="RIPEMID 128 bits";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("RIPEMID 160 bits")||n.contains("ripemid 160 bits"))
						   { ch="RIPEMID 160 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break; }
						   else if(n.contains("SHA-0")||n.contains("sha-0"))
						   { ch="SHA-0";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("SHA-1")||n.contains("sha-1"))
						   { ch="SHA-1";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("SHA-2 224 bits")||n.contains("sha-2 224 bits"))
						   { ch="SHA-2 224 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("SHA-2 256 bits")||n.contains("sha-2 256 bits"))
						   { ch="SHA-2 256 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("SHA-2 384 bits")||n.contains("sha-2 384 bits"))
						   { ch="SHA-2 384 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("SHA-2 512 bits")||n.contains("sha-2 512 bits"))
						   { ch="SHA-2 512 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("SHA-3 224 bits")||n.contains("sha-3 224 bits"))
						   { ch="SHA-3 224 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;} 
						   else if(n.contains("SHA-3 256 bits")||n.contains("sha-3 256 bits"))
						   { ch="SHA-3 256 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(n.contains("SHA-3 384 bits")||n.contains("sha-3 384 bits"))
						   { ch="SHA-3 384 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break; }
						   else if(n.contains("SHA-3 512 bits")||n.contains("sha-3 512 bits"))
						   { ch="SHA-3 512 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;} 
			               else if(n.contains("nameWhirpool 512 bits")||n.contains("namewhirpool 512 bits"))
						   { ch="nameWhirpool 512 bits";
						     ch1="secure";
						   System.out.println("the message "+ch);}
					     
						   
				} 
				 else  if(tss[k].contains("MD4")||tss[k].contains("MD5")||tss[k].contains("RIPEMID 128 bits")
		            		   ||tss[k].contains("RIPEMID 160 bits")||tss[k].contains("SHA-0")||tss[k].contains("SHA-1")
		            		   ||tss[k].contains("SHA-2 224 bits")||tss[k].contains("SHA-2 256 bits")
		            	   ||tss[k].contains("SHA-2 384 bits")||tss[k].contains("SHA-2 512 bits")
		            	   ||tss[k].contains("SHA-3 224 bits")
		            	   ||tss[k].contains("SHA-3 256 bits")||tss[k].contains("SHA-3 384 bits")
		            	   ||tss[k].contains("SHA-3 512 bits") ||tss[k].contains("sha384")
		            	   ||tss[k].contains("nameWhirpool 512 bits")||tss[k].contains("SHA1")||tss[k].contains("SHA256")||tss[k].contains("SHA512"))
		            	   
					   { System.out.println("the message "+k+": "+tss[k]+"contain hash function called ");
					     
					   if(tss[k].contains("MD4")||tss[k].contains("md4"))
					   { ch="MD4";
					     ch1="weak";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("MD5")||tss[k].contains("md5"))
					   { ch="MD5";
					     ch1="weak";
					   System.out.println("the message "+ch); break; }
					   else if(tss[k].contains("RIPEMID 128 bits")||tss[k].contains("ripemid 128 bits"))
					   { ch="RIPEMID 128 bits";
					     ch1="weak";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("RIPEMID 160 bits")||tss[k].contains("ripemid 160 bits"))
					   { ch="RIPEMID 160 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break; }
					   else if(tss[k].contains("SHA-0")||tss[k].contains("sha-0"))
					   { ch="SHA-0";
					     ch1="weak";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("SHA-1")||tss[k].contains("sha-1")||tss[k].contains("SHA1"))
					   { ch="SHA-1";
					     ch1="weak";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("SHA-2 224 bits")||tss[k].contains("sha-2 224 bits"))
					   { ch="SHA-2 224 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("SHA-2 256 bits")||tss[k].contains("sha-2 256 bits")||tss[k].contains("SHA256"))
					   { ch="SHA-2 256 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("SHA-2 384 bits")||tss[k].contains("sha-2 384 bits"))
					   { ch="SHA-2 384 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("SHA-2 512 bits")||tss[k].contains("sha-2 512 bits")||tss[k].contains("SHA512"))
					   { ch="SHA-2 512 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("SHA-3 224 bits")||tss[k].contains("sha-3 224 bits"))
					   { ch="SHA-3 224 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break;} 
					   else if(tss[k].contains("SHA-3 256 bits")||tss[k].contains("sha-3 256 bits"))
					   { ch="SHA-3 256 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break;}
					   else if(tss[k].contains("SHA-3 384 bits")||tss[k].contains("sha-3 384 bits")||tss[k].contains("sha384"))
					   { ch="SHA-3 384 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break; }
					   else if(tss[k].contains("SHA-3 512 bits")||tss[k].contains("sha-3 512 bits"))
					   { ch="SHA-3 512 bits";
					     ch1="secure";
					   System.out.println("the message "+ch); break;} 
		               else if(tss[k].contains("nameWhirpool 512 bits")||tss[k].contains("namewhirpool 512 bits"))
					   { ch="nameWhirpool 512 bits";
					     ch1="secure";
					   System.out.println("the message "+ch);}
					   
					   }
		        }
				 
				System.out.println("the used hash function "+ch);
				System.out.println("it classifcation "+ch1);
				label_3.setText("Hush Function = "+ch);
				
				
				if (ch1=="weak")
				{
					chint=0;
					System.out.println(ch1int);
					
				}
				else if (ch1=="secure")
				{
					chint=1;
					System.out.println(ch1int);
				}
				
				//lblClassification_1.setText("Classification = "+ch1);
				//----------------------------------------------------------------------------------
				
				String chch=null;
				String chch1=null;
				for (int k = 0; k < tss.length; k++) {
				System.out.println("massege name of sequence "+k+" "+tss[k]);
		         //System.out.println("hash function name"+ Hf[i][0] );
		           // System.out.println( Hf[i][1] );
			if (tss[k].contains("signmessage")|| tss[k].contains("signdocument")||tss[k].contains("sign")
						 ||tss[k].equals("encrypt"))
			     {
					 String[] options = {"RSA 1024 bits", "RSA 2048 bits",
							 "DSA 1024 bits, 160 bits","DSA 2048 bits, 224 bits",
                           "DSA 2048 bits, 256 bits","DSA 3072 bits, 256 bits" ,"ECDSA","AES 128 bits"};
				        ImageIcon icon = new ImageIcon("C:/Users/fourati/Documents/pj/SecurityEvaluationTool/src/images/dialog-question.png");
				        String n = (String)JOptionPane.showInputDialog(null, "Digitale Signature or Cryptography Algorithim Precision",
				                "Specify the used  Digitale Signature or Cryptography Algorithim", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
				        
				        System.out.println(n);
				        System.out.println("the message "+k+": "+tss[k]+"Digtale signature funtion called ");
				        
				        if(n.contains("RSA 1024 bits")||n.contains("rsa 1024 bits"))
						   { chch="RSA 1024 bits";
						     chch1="weak";
						   System.out.println("the message "+chch); break;}
						   else if(n.contains("RSA 2048 bits")||n.contains("rsa 2048 bits"))
						   { chch="RSA 2048 bits";
						     chch1="secure";
						   System.out.println("the message "+chch); break; }
						   else if(n.contains("DSA 1024 bits, 160 bits")||n.contains("dsa 1024 bits, 160 bits"))
						   { chch="DSA 1024 bits, 160 bits";
						     chch1="weak";
						   System.out.println("the message "+ch); break;} 
						   else if(n.contains("DSA 2048 bits, 224 bits")||n.contains("dsa 2048 bits, 224 bits"))
						   { chch="DSA 2048 bits, 224 bits";
						     chch1="secure";
						   System.out.println("the message "+chch); break;}
						   else if(n.contains("DSA 2048 bits, 256 bits")||n.contains("dsa 2048 bits, 256 bits"))
						   { chch="DSA 2048 bits, 256 bits";
						     chch1="secure";
						   System.out.println("the message "+chch); break;}
						   else if(n.contains("DSA 3072 bits, 256 bits")||n.contains("dsa 3072 bits, 256 bits"))
						   { chch="DSA 3072 bits, 256 bits";
						     chch1="secure";
						   System.out.println("the message "+chch); break;}
						   else if(n.contains("ECDSA")||n.contains("sha-2 224 bits"))
						   { chch="ECDSA";
						     chch1="secure";
						   System.out.println("the message "+chch); break;}
						   else if(n.contains("AES 128 bits")||n.contains("aes 128 bits"))
						   { chch="AES 128 bits";
						     chch1="secure";
						   System.out.println("the message "+chch); break;}
				        
						   
				} 
				 else  if(tss[k].contains("RSA 1024 bits")||tss[k].contains("RSA 2048 bits")
		            		   ||tss[k].contains("DSA 1024 bits, 160 bits")
		            		   ||tss[k].contains("DSA 2048 bits, 224 bits")||tss[k].contains("DSA 2048 bits, 256 bits")
		            		   ||tss[k].contains("DSA 3072 bits, 256 bits")||tss[k].contains("ECDSA"))
		            	   
					   { System.out.println("the message "+k+": "+tss[k]+"contain digtal signtaure called ");
					     
					   if(tss[k].contains("RSA 1024 bits")||tss[k].contains("rsa 1024 bits"))
					   { chch="RSA 1024 bits";
					     chch1="weak";
					   System.out.println("the message "+chch); break;}
					   else if(tss[k].contains("RSA 2048 bits")||tss[k].contains("rsa 2048 bits"))
					   { chch="RSA 2048 bits";
					     chch1="secure";
					   System.out.println("the message "+chch); break; }
					   else if(tss[k].contains("DSA 1024 bits, 160 bits")||tss[k].contains("dsa 1024 bits, 160 bits"))
					   { chch="DSA 1024 bits, 160 bits";
					     chch1="weak";
					   System.out.println("the message "+ch); break;} 
					   else if(tss[k].contains("DSA 2048 bits, 224 bits")||tss[k].contains("dsa 2048 bits, 224 bits"))
					   { chch="DSA 2048 bits, 224 bits";
					     chch1="secure";
					   System.out.println("the message "+chch); break;}
					   else if(tss[k].contains("DSA 2048 bits, 256 bits")||tss[k].contains("dsa 2048 bits, 256 bits"))
					   { chch="DSA 2048 bits, 256 bits";
					     chch1="secure";
					   System.out.println("the message "+chch); break;}
					   else if(tss[k].contains("DSA 3072 bits, 256 bits")||tss[k].contains("dsa 3072 bits, 256 bits"))
					   { chch="DSA 3072 bits, 256 bits";
					     chch1="secure";
					   System.out.println("the message "+chch); break;}
					   else if(tss[k].contains("ECDSA")||tss[k].contains("sha-2 224 bits"))
					   { chch="ECDSA";
					     chch1="secure";
					   System.out.println("the message "+chch); break;}
		        } 
				 
				}
				 
				System.out.println("the used git sig "+chch);
				System.out.println("it classifcation "+chch1);
				if (chch1=="weak")
				{
					chchint=0;
					System.out.println(chch1int);
					
				}
				else if (chch1=="secure")
				{
					chchint=1;
					System.out.println(chch1int);
				}
				
				
				//lblNewLabel_3.setText(TreePrinter.ret());
				//textArea.setText(ch1);
				//textArea_1.setText("");
				//lblNewLabel_3.setText(BTreePrinter.printNode(d.test2(root,rud,hf,ds)););
				label_4.setText("Digital Signature Algorithm = "+chch);
				//lblClassification.setText("Classification = "+chch1);
				
				//-----------------------------------------------------------------------------------
				final NodeList elt4=racine.getElementsByTagName("combinedFragmentwidget");
				final int nb4 = elt4.getLength();	
				 
				 int nbalt=0;
				for(int j = 0; j<nb4; j++) {
				    final Element msg = (Element) elt4.item(j);
				    // System.out.println("combined fragment name  "+j+" : "+msg.getAttribute("combinedFragmentname"));
				    nbalt=nbalt+1;
				}
				final NodeList elt5=racine.getElementsByTagName("floatingdashlinewidget");
				final int nb5 = elt5.getLength();				
				for(int j = 0; j<nb5; j++) {
				    final Element msg = (Element) elt5.item(j);
				   // System.out.println("combined fragement number "+j+" : "+msg.getAttribute("text"));
				    nbalt=nbalt+1;
				}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
				label_1.setText(label_1.getText()+""+nbalt+" CSM");
				System.out.println("CSM = "+nbalt); /*requere dans les label */
				float l=(float)nbalt/(float)cfp;
				System.out.println("Level = "+ (float)nbalt/(float)cfp); /*requere dans les label */
				label_2.setText(label_2.getText()+""+l+" CSM/CFP");
				
				
				//System.out.println("--------------------------------");
				/*for (int i = 0; i < Hf.length; i++)
		        {
		               System.out.print(Hf[ i ] [ 0 ] + ": ");
		               for (int j = 1; j < Hf[ i ].length; j++)
		               {
		                          System.out.print(Hf[ i ][ j ] + " ");
		               }
		              System.out.println( );
		        }
				*/
				
				if(ch1=="weak"&&chch1=="weak")
				{   inputlabel.setText("<html>The non-repudiation measure interpretation is weak. <br> Both of the digital signature algorithm "+chch+" and hash function "+ch+" are considered weak according to OWASP, NIST and Qualys SSL Labs critirea. </html>");
				rud=0;
			      xn=0;
			      treeLabel.setText("<html> According to the tree, the process of tracing the weakness in your web application "
			      		+ "prove that the weakness is due to both of the digital signature algorithm and the hash function used. <br> "
			      		+ "We suggest you the listes of  digital signature algorithm and hash function shown in the reccomendation section. </html>");
					
					
				}
				else if (ch1=="secure"&&chch1=="weak")
				{    inputlabel.setText("<html>The non-repudiation measure interpretation is weak. <br> The digital signature"+chch+" is considered weak according to OWASP, NIST and Qualys SSL Labs critirea. </html>");
				      rud=0;
				      xn=0;
				      treeLabel.setText("<html> According to the tree, the process of tracing the weakness in your web application "
			      		+ "prove that the weakness is due to only the digital signature used. <br> "
			      		+ "We suggest you the listes of  digital signature algorithm and hash function shown in the reccomendation section. </html>");
				}
				else if (ch1=="weak"&&chch1=="secure")
				{
					
					inputlabel.setText("<html>The non-repudiation measure interpretation is weak. <br> The hash function "+ch+" is considered weak according to OWASP, NIST and Qualys SSL Labs critirea. </html>");
				     
					rud=0;
				      xn=0;
				      treeLabel.setText("<html>According to the tree, the process of tracing the weakness in your web application "
			      		+ "prove that the weakness is due to only the hash function used. <br> "
			      		+ "We suggest you the listes of  digital signature algorithm and hash function shown in the reccomendation section.</html>" );
				}
				else if (ch1=="secure"&&chch1=="secure")
				{     inputlabel.setText("<html>The non-repudiation measure interpretation is secure. <br> Both of the digital signature "+chch+" algorithm and hash function "+ch+" are considered secure according to OWASP, NIST and Qualys SSL Labs critirea. </html>");
				rud=1;
			      xn=1;
			      treeLabel.setText("<html> According to the tree, the process of tracing the weakness in your web application "
			      		+ "prove that your web application is secure. <br> "
			      		+ "We suggest you the listes of  digital signature algorithm and hash function shown in the reccomendation section for higher security level.</html>");
				}
				else if (ch1=="weak")
				{
					inputlabel.setText("<html> The hash function "+ch+" is considered weak according to OWASP, NIST and Qualys SSL Labs critirea. </html>");
				     
					rud=0;
				      xn=0;
				      treeLabel.setText("<html>According to the tree, the process of tracing the weakness in your web application "
			      		+ "prove that the weakness is due to the hash function used. <br> "
			      		+ "We suggest you the listes of  digital signature algorithm and hash function shown in the reccomendation section.</html>" );
				
				}
				else if (ch1=="secure")
				{
					inputlabel.setText("<html> The hash function "+ch+" is considered secure according to OWASP, NIST and Qualys SSL Labs critirea. </html>");
				     
					rud=0;
				      xn=0;
				      treeLabel.setText("<html>According to the tree, the process of tracing the weakness in your web application "
			      		+ "prove that the used hash function is secure. <br> "
			      		+ "We suggest you the listes of  digital signature algorithm and hash function shown in the reccomendation section for more security.</html>" );
				
				}
				if (choice.getSelectedItem()=="E-commerce Web Application"||choice.getSelectedItem()=="Banking Web Application")
				{
					String[] entetes = {"Hash Function", "Classification"};
					DefaultTableModel modele = new DefaultTableModel(Hfsecure,  entetes);
					table.setModel(modele);
					String[] entetes1 = {"Digital Signature Algorithm", "Classification"};
					DefaultTableModel modele1 = new DefaultTableModel(Dsbussiness,  entetes1);
	                table1.setModel(modele1);
					
				}
					if (choice.getSelectedItem()=="Portal Web Application")
					{
						String[] entetes = {"Hash Function", "Classification"};
						DefaultTableModel modele = new DefaultTableModel(Hfsecure,  entetes);
						table.setModel(modele);
						String[] entetes1 = {"Digital Signature Algorithm", "Classification"};
						DefaultTableModel modele1 = new DefaultTableModel(Dsmost,  entetes1);
		                table1.setModel(modele1);
					}
						if (choice.getSelectedItem()=="Web Applications With CMS")
				        {
							String[] entetes = {"Hash Function", "Classification"};
							DefaultTableModel modele = new DefaultTableModel(Hfsecure,  entetes);
							table.setModel(modele);
							String[] entetes1 = {"Digital Signature Algorithm", "Classification"};
							DefaultTableModel modele1 = new DefaultTableModel(Dsmost,  entetes1);
			                table1.setModel(modele1);
				        }
						 TestRedirect();
						label_1.setVisible(true);
					    label_2.setVisible(true);
					    label_3.setVisible(true);
					    label_4.setVisible(true);
					    label.setVisible(true);
					    scrollPane_1.setVisible(true);
					    scrollPane_2.setVisible(true);
					    inputlabel.setVisible(true);
					    textArea_1.setVisible(true);
					    treeLabel.setVisible(true);
					  
				}catch (SAXParseException err) {
				System.out.println ("** Parsing error" + ", line " + err.getLineNumber () + ", uri " + err.getSystemId ());
				System.out.println(" " + err.getMessage ());

				}catch (SAXException d) {
				Exception x = d.getException ();
				((x == null) ? d : x).printStackTrace ();

				}catch (Throwable t) {
				t.printStackTrace ();
				}
			}
		});
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Arial", Font.BOLD, 12));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(0, 0, 127, 25);
		panel_4.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(27, 39, 318, 27);
		panel_2.add(textField_1);
		
		lblNewLabel_1 = new JLabel("Web Aplication Type");
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(27, 82, 108, 14);
		panel_2.add(lblNewLabel_1);
		
		choice = new Choice();
		choice.add("E-commerce Web Application");
		choice.add("Banking Web Application");
		choice.add("Portal Web Application");
		choice.add("Web Applications With CMS");
		choice.setFont(new Font("Arial", Font.PLAIN, 12));
		choice.setBounds(141, 82, 204, 21);
		panel_2.add(choice);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, "Measure", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel.setBounds(10, 159, 501, 231);
		add(panel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Output", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_6.setBounds(10, 401, 501, 210);
		add(panel_6);
		panel_6.setLayout(null);
		
		inputlabel = new JLabel("");
		inputlabel.setForeground(new Color(255, 140, 0));
		inputlabel.setFont(new Font("Arial", Font.PLAIN, 12));
		inputlabel.setBounds(22, 27, 441, 113);
		panel_6.add(inputlabel);
		
		
		 panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Tree", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(521, 321, 571, 290);
		add(panel_5);
		panel_5.setLayout(null);
		
	      textArea_1 = new TextArea();
	      textArea_1.setEditable(false);
		textArea_1.setBounds(404, 28, 135, 219);
		panel_5.add(textArea_1);
		
		treeLabel = new JLabel("");
		treeLabel.setForeground(new Color(255, 140, 0));
		treeLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		treeLabel.setBounds(32, 28, 323, 219);
		panel_5.add(treeLabel);
		
		textArea_1.setVisible(false);
		
		 panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Recommendation", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(521, 15, 571, 289);
		add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setBackground(new Color(224, 255, 255));
		//table.setBounds(23, 24, 431, 176);
		scrollPane_1 = new JScrollPane(table);
		scrollPane_1.setBounds(10, 37, 219, 210);
		panel_1.add(scrollPane_1);
		table1 = new JTable();
		table1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table1.setBackground(new Color(224, 255, 255));
		//table.setBounds(23, 24, 431, 176);
	   scrollPane_2= new JScrollPane(table1);
		scrollPane_2.setBounds(246, 37, 315, 210);
		panel_1.add(scrollPane_2);
		scrollPane_1.setVisible(false);
		   scrollPane_2.setVisible(false);
		//JScrollBar s=new JScrollBar();
		//JScrollBar s=new JScrollBar();
		//add(s);
		//s.setBounds(1083, 0, 53, 588);
		

	}
}


