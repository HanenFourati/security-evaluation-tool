package Tool;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;








import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

import java.awt.event.MouseMotionAdapter;


public class Confidentiality extends JPanel {
	
	
	
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
	                System.setOut(new PrintStream(new StreamCapturer("",textArea_2, ps)));

	               // System.out.println("Hello, this is a test");
	               // System.out.println("Wave if you can see me");
	                
	                
	                Tree p=new Tree();
					Node<Integer> root = new Node<Integer>(Confidentiality.dd);
					Node<Integer> rde = new Node<Integer>(Confidentiality.d);
					Node<Integer> CS = new Node<Integer>(Confidentiality.cs);	
					//d.test2(root,rud,hf,ds);
			        ConfidentialityTreePrinter.printNode(p.test(root,rde,CS));
					
	            }            
	        });
	    }
	
	

	
	
	
	
	
	
	
	
	
	
	
	public JTextField textField;
	public JLabel label;
	public JLabel label_1 ;
	public JLabel label_2;
	public JLabel lblNewLabel_2 ;
	public JLabel lblCryptographyAlgorithem;
	public JTable table;
	public JTable table1;
	JPanel panel_4;
	public TextArea textArea_2;
	public Choice choice;
	static int d;
	static int dd;
	static int cs;
	JScrollPane scrollPane_4;
	private PrintStream standardOut;
	JLabel lblNewLabel_1;
	JPanel panel_5;
	JLabel label_3;
	JLabel labeltree;
	/**
	 * Create the panel.
	 */
	public Confidentiality() {
		setForeground(new Color(128, 128, 128));
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1376, 862);
		setLayout(null);
		String[ ][ ] Cs = {
                { "RC2", "weak"},
                { "RC4", "weak" },
                { "Blowfish", "weak"},
                { "A5-1", "weak"},  
                { "A5-2", "weak"},
                { "E0", "weak" },
                { "AES 128 bits", "secure"},
                { "AES 192 bits", "secure"},
                { "AES 256 bits", "secure"},
                { "DES", "weak" },
                { "RSA 1024 bits", "weak"},
                { "RSA 2048 bits", "secure"},
                { "RSA 3072 bits", "secure"},
                { "HC 128 bits", "secure"},
                { "HC 256 bits", "secure"},
                }; 
		String[ ][ ] Csmost = {
				 { "HC 128 bits", "secure"},
                { "AES 128 bits", "secure"},
                { "AES 192 bits", "secure"},
                { "HC 256 bits", "secure"},
                { "AES 256 bits", "secure"},
                { "RSA 2048 bits", "secure"},
                { "RSA 3072 bits", "secure"},
               
                }; 
		String[ ][ ] Csbussiness = {
                { "AES 192 bits", "secure"},
                { "AES 256 bits", "secure"},
                { "RSA 2048 bits", "secure"},
                { "RSA 3072 bits", "secure"},  
                { "HC 256 bits", "secure"},
                }; 
		
		label = new JLabel("FSM(Sq) = ");
		label.setForeground(new Color(128, 128, 128));
		label.setBounds(75, 203, 310, 37);
		label.setFont(new Font("Arial", Font.BOLD, 14));
		add(label);
		
		label_1 = new JLabel("SS(Sq) = ");
		label_1.setForeground(new Color(128, 128, 128));
		label_1.setBounds(75, 235, 310, 37);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		add(label_1);
		
		label_2 = new JLabel("Confidentiality Level = ");
		label_2.setForeground(new Color(128, 128, 128));
		label_2.setBounds(75, 267, 421, 37);
		label_2.setFont(new Font("Arial", Font.BOLD, 14));
		add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Input", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_2.setBounds(10, 11, 501, 137);
		add(panel_2);
		panel_2.setLayout(null);
		
		choice = new Choice();
		choice.add("E-commerce Web Application");
		choice.add("Banking Web Application");
		choice.add("Portal Web Application");
		choice.add("Web Applications With CMS");
		choice.setFont(new Font("Arial", Font.PLAIN, 12));
		choice.setBounds(141, 82, 204, 21);
		panel_2.add(choice);
		
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(109, 327, 387, 37);
		add(lblNewLabel_2);
		
		JLabel lblSelectFile = new JLabel("Select File");
		lblSelectFile.setBounds(351, 39, 127, 25);
		panel_2.add(lblSelectFile);
		lblSelectFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

				int returnValue = jfc.showOpenDialog(null);
				

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();
					textField.setText(selectedFile.getAbsolutePath());
					
				}
			}
		});
		lblSelectFile.setFont(new Font("Arial", Font.BOLD, 12));
		lblSelectFile.setForeground(new Color(255, 255, 255));
		lblSelectFile.setBackground(new Color(255, 255, 255));
		lblSelectFile.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(351, 37, 127, 27);
		panel_2.add(panel);
		panel.setBackground(new Color(0, 139, 139));
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(351, 82, 127, 27);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(0, 139, 139));
		panel_1.setLayout(null);
		
		
		lblCryptographyAlgorithem = new JLabel("Cryptography Algorithm = ");
		lblCryptographyAlgorithem.setForeground(Color.GRAY);
		lblCryptographyAlgorithem.setFont(new Font("Arial", Font.BOLD, 14));
		lblCryptographyAlgorithem.setBounds(75, 297, 421, 37);
		add(lblCryptographyAlgorithem);
		
		JLabel lblNewLabel = new JLabel("Measure");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
				try {

					DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
					Document doc = docBuilder.parse (new File(textField.getText()));

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
				    label .setText(label .getText()+""+cfp+" CFP");
				   // System.out.println("CFP = "+cfp);
				
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
				    
					 if (tss[k].contains("encryptmessage")|| tss[k].contains("encryptdocument")||tss[k].contains("encrypt")
							 ||tss[k].contains("RSA")|| tss[k].equals("AES")|| tss[k].equals("DES"))
				     {
						 String[] options = {"RC2", "RC4", "Blowfish", "A5-1", "A5-2", "E0","AES 128 bits","AES 192 bits",
								 "AES 256 bits","DES","RSA 1024 bits","RSA 2048 bits","RSA 3072 bits","HC 128 bits","HC 256 bits"};
					        ImageIcon icon = new ImageIcon("C:/Users/fourati/Documents/pj/SecurityEvaluationTool/src/images/dialog-question.png");
					        String n = (String)JOptionPane.showInputDialog(null, "Cryptography Algorithm Precision",
					                "Specify the used cryptography algorithm", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
					        
					        System.out.println(n);
					        System.out.println("the message "+k+": "+tss[k]+"contain cryptography algorithm called ");
						     
							   if(n.contains("RC2")||n.contains("rc2"))
							   { ch="RC2";
							     ch1="weak";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("RC4")||n.contains("rc4"))
							   { ch="RC4";
							     ch1="weak";
							   System.out.println("the message "+ch); break; }
							   else if(n.contains("Blowfish")||n.contains("blowfish"))
							   { ch="Blowfish";
							     ch1="weak";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("A5-1")|| n.contains("a5-1"))
							   { ch="A5-1";
							     ch1="weak";
							   System.out.println("the message "+ch); break; }
							   else if(n.contains("A5-2")||n.contains("a5-2"))
							   { ch="A5-2";
							     ch1="weak";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("E0")||n.contains("e0"))
							   { ch="E0";
							     ch1="weak";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("AES 128 bits")||n.contains("aes 128 bits")||n.contains("AES"))
							   { ch="AES 128 bits";
							     ch1="secure";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("AES 192 bits")||n.contains("aes 192 bits"))
							   { ch="AES 192 bits";
							     ch1="secure";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("DES")||n.contains("des"))
							   { ch="DES";
							     ch1="weak";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("RSA 1024 bits")||n.contains("rsa 1024 bits")||n.contains("RSA1024"))
							   { ch="RSA 1024 bits";
							     ch1="weak";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("RSA 2048 bits")||n.contains("rsa 2048 bits"))
							   { ch="RSA 2048 bits";
							     ch1="secure";
							   System.out.println("the message "+ch); break;} 
							   else if(n.contains("RSA 3072 bits")||n.contains("rsa 3072 bits"))
							   { ch="RSA 3072 bits";
							     ch1="secure";
							   System.out.println("the message "+ch); break;}
							   else if(n.contains("HC 128 bits")||n.contains("hc 128 bits"))
							   { ch="HC 128 bits";
							     ch1="secure";
							   System.out.println("the message "+ch); break; }
							   else if(n.contains("HC 256 bits")||n.contains("hc 256 bits"))
							   { ch="HC 256 bits";
							     ch1="secure";
							   System.out.println("the message "+ch); break;} 
							   } 
					 
					 else if (tss[k].contains("RC2")||tss[k].contains("RC4")||tss[k].contains("Blowfish")
			            		   ||tss[k].contains("A5-1")||tss[k].contains("A5-2")||tss[k].contains("E0")
			            		   ||tss[k].contains("AES 128 bits")||tss[k].contains("AES 192 bits")||tss[k].contains("AES")
			            	   ||tss[k].contains("AES 256 bits")||tss[k].contains("DES")
			            	   ||tss[k].contains("RSA 1024 bits")
			            	   ||tss[k].contains("RSA 2048 bits")||tss[k].contains("RSA 3072 bits")
			            	   ||tss[k].contains("HC 128 bits")
			            	   ||tss[k].contains("HC 256 bits")||tss[k].contains("RSA1024"))
			            	   
						   { System.out.println("the message "+k+": "+tss[k]+"contain cryptography algorithm called ");
						     
						   if(tss[k].contains("RC2")||tss[k].contains("rc2"))
						   { ch="RC2";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].contains("RC4")||tss[k].contains("rc4"))
						   { ch="RC4";
						     ch1="weak";
						   System.out.println("the message "+ch); break; }
						   else if(tss[k].contains("Blowfish")||tss[k].contains("blowfish"))
						   { ch="Blowfish";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].contains("A5-1")||tss[k].contains("a5-1"))
						   { ch="A5-1";
						     ch1="weak";
						   System.out.println("the message "+ch); break; }
						   else if(tss[k].contains("A5-2")||tss[k].contains("a5-2"))
						   { ch="A5-2";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].contains("E0")||tss[k].contains("e0"))
						   { ch="E0";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].equals("AES 128 bits")||tss[k].equals("aes 128 bits"))
						   { ch="AES 128 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].equals("AES 192 bits")||tss[k].equals("aes 192 bits")||tss[k].equals("AES"))
						   { ch="AES 192 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].contains("RSA 1024 bits")||tss[k].contains("rsa 1024 bits")||tss[k].contains("RSA1024"))
						   { ch="RSA 1024 bits";
						     ch1="weak";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].contains("AES")||tss[k].contains("AES()"))
						   { ch="AES";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].contains("RSA 2048 bits")||tss[k].contains("rsa 2048 bits"))
						   { ch="RSA 2048 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;} 
						   else if(tss[k].contains("RSA 3072 bits")||tss[k].contains("rsa 3072 bits"))
						   { ch="RSA 3072 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   else if(tss[k].contains("HC 128 bits")||tss[k].contains("hc 128 bits"))
						   { ch="HC 128 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break; }
						   else if(tss[k].contains("HC 256 bits")||tss[k].contains("hc 256 bits"))
						   { ch="HC 256 bits";
						     ch1="secure";
						   System.out.println("the message "+ch); break;} 	
						   else if(tss[k].contains("DESEDE")||tss[k].contains("DESede"))
						   { ch="Triple DES";
						     ch1="secure";
						   System.out.println("the message "+ch); break;}
						   
				          else if(tss[k].contains("DES")||tss[k].contains("des")||tss[k].contains("DES()"))
							   { ch="DES";
							     ch1="weak";
							   System.out.println("the message "+ch); break;}
						   }
				        
			        }
					 
					System.out.println("the used hash function "+ch);
					System.out.println("it classifcation "+ch1);
					lblCryptographyAlgorithem.setText("Cryptography Algorithm  = "+ch);
					//lblNewLabel_2.setText("Classification = "+ch1);
				//-----------------------------------------------------------------------------------
				final NodeList elt4=racine.getElementsByTagName("combinedFragmentwidget");
				final int nb4 = elt4.getLength();	
				 
				 int nbalt=0;
				for(int j = 0; j<nb4; j++) {
				    final Element msg = (Element) elt4.item(j);
				    // System.out.println("combined fragement name  "+j+" : "+msg.getAttribute("combinedFragmentname"));
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
				//System.out.println("CSM = "+nbalt); /*requere dans les label */
				float l  =(float)nbalt/(float)cfp;
				label_2.setText(label_2.getText()+""+l+" CSM/CFP");
				//System.out.println("Level = "+ (float)nbalt/(float)cfp); /*requere dans les label */
				/*for (int i = 0; i < Cs.length; i++)
		        {
		               System.out.print(Cs[ i ] [ 0 ] + ": ");
		               for (int j = 1; j < Cs[ i ].length; j++)
		               {
		                          System.out.print(Cs[ i ][ j ] + " ");
		               }
		              System.out.println( );
		              
		        }*/
				String dd1="";
				String d1="";
				String cs1="";
				if(ch1=="weak")
				{
					label_3.setText("<html> The confidetiality measure interpretation is weak. <br> The cryptography algorithm"+ch+"is weak according to OWASP, NIST and Qualys SSL Labs critirea. </html>");
				dd1="0";	d=0; //rde
				d1="0"; 	dd=0; //xc
				cs1="0";	cs=0;
				labeltree.setText("<html> According to the tree, the process of tracing the weakness in your web application "
			      		+ "prove that the weakness is due to cryptography algorithim used. <br> "
			      		+ "We suggest you the liste of cryptography algorithm shown in the reccomendation section. </html>");
				}
				else if (ch1=="secure")
				{
					label_3.setText("<html> The confidetiality measure interpretation is secure. <br> The cryptography algorithm "+ch+" is secure according to OWASP, NIST and Qualys SSL Labs critirea. </html>");
				d=1;	
				dd=1;
				cs=1;
				dd1="1";
				d1="1";
				cs1="1";
				labeltree.setText("<html> According to the tree, the process of tracing the weakness in your web application "
	      		+ "prove that your web application is secure. <br> "
	      		+ "We suggest you the liste of cryptography algorithm shown in the reccomendation section for higher security level.</html>");
				}
				
				if (choice.getSelectedItem()=="E-commerce Web Application"||choice.getSelectedItem()=="Banking Web Application")
				{
					String[] entetes1 = {"Cryptography Algorithm", "Classification"};
					DefaultTableModel modele1 = new DefaultTableModel(Csbussiness,  entetes1);
	                table.setModel(modele1);
					
				}
					if (choice.getSelectedItem()=="Portal Web Application")
					{
						String[] entetes1 = {"Cryptography Algorithm", "Classification"};
						DefaultTableModel modele1 = new DefaultTableModel(Csmost,  entetes1);
		                table.setModel(modele1);
					}
						if (choice.getSelectedItem()=="Web Applications With CMS")
				        {
							String[] entetes1 = {"Cryptography Algorithm", "Classification"};
							DefaultTableModel modele1 = new DefaultTableModel(Csmost,  entetes1);
			                table.setModel(modele1);
				        }
						  
						
						
					//textArea_1.setText(TreePrinter.ret());
						
						textArea_2.setText(ConfidentialityTreePrinter.ret());
						
						label_1.setVisible(true);
					    label_2.setVisible(true);
					    lblCryptographyAlgorithem.setVisible(true);
					    label.setVisible(true);
					    label.setVisible(true);
					    scrollPane_4.setVisible(true);
					    label_3.setVisible(true);
					    textArea_2.setVisible(true);
					    
					    TestRedirect();
					    
					    
					    
				
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
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 127, 25);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(27, 39, 318, 27);
		panel_2.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Web Aplication Type");
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(27, 82, 108, 14);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Measure", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(10, 159, 501, 233);
		add(panel_3);
		panel_3.setLayout(null);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Recommendation", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(521, 15, 571, 289);
		add(panel_4);
		panel_4.setLayout(null);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setBackground(new Color(224, 255, 255));
		//table.setBounds(23, 24, 431, 176);
		scrollPane_4 = new JScrollPane(table);
		scrollPane_4.setBounds(61, 41, 410, 210);
		panel_4.add(scrollPane_4);
		
		
		panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Tree", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(521, 321, 571, 290);
		add(panel_5);
		panel_5.setLayout(null);
		
		textArea_2 = new TextArea();
	    textArea_2.setEditable(false);
		textArea_2.setBounds(404, 28, 135, 219);
		panel_5.add(textArea_2);
		
		labeltree = new JLabel("");
		labeltree.setForeground(new Color(255, 140, 0));
		labeltree.setFont(new Font("Arial", Font.PLAIN, 12));
		labeltree.setBounds(32, 28, 323, 219);
		panel_5.add(labeltree);
		
		/*CapturePane r = new CapturePane();
		r.setBounds(0,0, 571, 250);
		panel_5.add(r);
		r.setVisible(true);
		r.setLayout(null);*/
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Output", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(32, 178, 170)));
		panel_6.setBounds(10, 401, 501, 210);
		add(panel_6);
		panel_6.setLayout(null);
		
		label_3 = new JLabel("");
		label_3.setForeground(new Color(255, 140, 0));
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setBounds(25, 37, 441, 53);
		panel_6.add(label_3);
		
		label_1.setVisible(false);
	    label_2.setVisible(false);
	    lblCryptographyAlgorithem.setVisible(false);
	    label.setVisible(false);
	    label.setVisible(false);
	    scrollPane_4.setVisible(false);
	    textArea_2.setVisible(false);
	    
	    
	

	}
}
