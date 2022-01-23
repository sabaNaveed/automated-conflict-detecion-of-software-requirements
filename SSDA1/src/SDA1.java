import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.border.EmptyBorder;

public class SDA1 extends JFrame {
	static EG2 parser = null;
	static String x1,x2,x3,x4,x12,x13,x15,x16,x20,x23;
	static ArrayList<String> x5 = new ArrayList<String>();
	static int n=0;static String a,b,c,d,m,f,g,h,k,j;
	static ArrayList<String> x6 = new ArrayList<String>();
	static ArrayList<String> x7 = new ArrayList<String>();
	static ArrayList<String> x8 = new ArrayList<String>();
	static ArrayList<String> x9 = new ArrayList<String>();
	static ArrayList<String> x10 = new ArrayList<String>();
	static ArrayList<String> x11 = new ArrayList<String>();
	static ArrayList<String> x18 = new ArrayList<String>();
	static ArrayList<String> x19 = new ArrayList<String>();
	static SDA1[] myArray;
	static List<String> list_common = new ArrayList<String>();
	static boolean a1,a2;
	private JPanel contentPane;
	private JTextPane textPane ,text;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SDA1 frame = new SDA1();
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
public SDA1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Enter Reqs:");
		lblNewLabel.setBounds(10, 16, 84, 20);
		contentPane.add(lblNewLabel);
		
		 JScrollPane scroll = new JScrollPane();
		scroll.setBounds(100, 10, 330, 180);
		contentPane.add(scroll);
		
		text = new JTextPane();
		scroll.setViewportView(text);
		 
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 200, 414, 250);
		contentPane.add(scrollPane);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                String sentence = text.getText(); 
                
                // Put parens around sentence so that parser knows scope
                //sentence = "(" + sentence + ")";
                sentence=sentence.toLowerCase();
                String[] parts = sentence.split("\n");

                myArray = new SDA1[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    System.out.println("\n"+parts[i]);
                    
                InputStream is = new ByteArrayInputStream(parts[i].getBytes());
                
                if(parser == null) {parser = new EG2(is); 
                
                }
                else {n++;EG2.ReInit(is);}
               
                
                try
                {
                  switch (EG2.start())
                  {
                    case 0 :
                    	textPane.setText("expression parsed ok.");
                    	//System.out.println("expression parsed ok.");
                    	if(n==0) {
                        	a=EG2.getid();
                        	c=EG2.getagent();
                        	g=EG2.getcondition();
                        	m=EG2.getop();
                        	x6=EG2.getobj();	
                        	k=EG2.getopMode();
                        	x8=EG2.getstakeholders();
                        	x10=EG2.getparameters();
                        	x12=EG2.getvalue();
                        	x12=EG2.geteffect();
                        	x18=EG2.gets();
                        	x20=EG2.getverb();
                        	n++;
                        	list_common.addAll(x6);
                        	
                        	a1=x8.isEmpty();
                        }
                        else {
                        	b=EG2.getid();
                        	x23=EG2.getverb();
                        	d=EG2.getagent();
                        	h=EG2.getcondition();
                        	f=EG2.getop();
                        	x7=EG2.getobj();
                        	j=EG2.getopMode();
                        	x9=EG2.getstakeholders();
                        	x11=EG2.getparameters();
                        	x13=EG2.getvalue();
                        	x16=EG2.geteffect();
                        	x19=EG2.gets();
                        	list_common.retainAll(x7);
                        	a2=x9.isEmpty();
                      	
                        }
                    
                    	
                    break;
                    default :
                    break;
                  }
                }
                catch (Exception f)
                {
                	textPane.setText("error in expression.\n"+
                		  				f.getMessage());
                }
                catch (Error f)
                {
                	textPane.setText("error in expression.\n"+
    		  						   f.getMessage());
                }
                finally
                {
                  
                }
                }
                if (textPane.getText().equals("expression parsed ok.")) {
                    //conflict rule no. 1
                      if(a!=b&&list_common!=null&&x10.isEmpty()!=true&&x11.isEmpty()!=true&&x10.equals(x11)!=true) {
                  		System.out.println("\n\nconflict voilated: CR.01\nStructural conflict: properties of same components represented in multiple requirements differently.");
                  		textPane.setText("\n\nconflict voilated: CR.01");
                  		}
                  	else
                  		System.out.println("\n\nno conflict 1\n");
                    //conflict rule no. 2
                      if(a!=b&&list_common==null&&x10.isEmpty()!=true&&x11.isEmpty()!=true&&x10.equals(x11)==true) {
                  		System.out.println("\n\nconflict voilated: CR.02\nSemantic conflict:components of multiple requirements have identical names but referring to different objects ");
                  		textPane.setText("\n\nconflict voilated: CR.02");
                  		}
                  	else
                  		System.out.println("\n\nno conflict 2\n");
                      	//conflict rule no. 3
                      	if(a!=b&&k!=j&&m.equals(f)&&a1!=true&&a2!=true&&x8.equals(x9)==true&&list_common!=null) {
                      		System.out.println("\n\nconflict voilated: CR.03\nActivity conflict: multiple requirements does opposite actions with similar objects. ");
                      		textPane.setText(textPane.getText()+"\n\nconflict voilated: CR.03");
                      		
                      		}
                      	else
                      		System.out.println("\n\nno conflict 3");
                      	//conflict rule no. 4
                      	if(a!=b&&c!=d&&m.equals(f)&&g!=h&&list_common!=null) {
                      		//outputText.setText("\n\nconflict voilated: CR.04");
                      		textPane.setText(textPane.getText()+"\n\nconflict voilated: CR.04\nIncompatible conflict: agent is forbidden to perform same operation on a certain condition.");
                      		}
                      	else
                      		System.out.println("\n\nno conflict 4");
                      	//conflict rule no. 5
                      	if(a!=b&&m.equals(f)&&list_common!=null&&g!=null&&h!=null&&g.equals(h)&&x12!=x13) {
                      		textPane.setText("\n\nconflict voilated: CR.05\nAssumption alteration conflict:Output of one requirement is also an output of other requirements.");
                      		System.out.println("\n\nconflict voilated: CR.05");
                      		}
                      	else
                      		System.out.println("\n\nno conflict 5");
                      	//conflict rule no. 6
                      	if(a!=b&&m.equals(f)&&list_common!=null&&g!=null&&h!=null&&g.equals(h)&&x16!=x15) {
                      		textPane.setText("\n\nconflict voilated: CR.06\nIncompatible requirements conflict:same condition causes similar action to be accomplished and prohibited at the same time. ");
                      		System.out.println("\n\nconflict voilated: CR.06");
                      		}
                      	else
                      		System.out.println("\n\nno conflict 6");
                      	//conflict rule no. 7
                      	if(a!=b&&m.equals(f)&&list_common!=null&&g!=h&&x15!=null&&x16!=null&&x15.equals(x16)) {
                      		textPane.setText("\n\nconflict voilated: CR.07\nIncompatible requirements conflict:similar operation performed on different condition events. ");
                      		System.out.println("\n\nconflict voilated: CR.07");
                      		}
                      	else
                      		System.out.println("\n\nno conflict 7");
                      	//conflict rule no. 8
                      	if(a!=b&&m.equals(f)&&list_common!=null&&g!=null&&h!=null&&g.equals(h)&&x18!=x19) {
                      		textPane.setText("\n\nconflict voilated: CR.08\n7.	Changings conflict: \r\n"
                      				+ "Multiple requirements change same object into different states as an output.\r\n"
                      				+ "");
                      		System.out.println("\n\nconflict voilated: CR.08");
                      		}
                      	else
                      		System.out.println("\n\nno conflict 8");
                      	
                      	//conflict rule no. 9
                      	if(a!=b&&!x20.equals(x23)&&m.equals(f)&&list_common!=null&&j.equals(k)) {
                      		textPane.setText("\n\nconflict voilated: CR.09\n6.	Syntactic conflict: \r\n"
                      				+ "Multiple requirements conflict according to predefined conditions such as different verb and same object. \r\n"
                      				+ "");
                      		System.out.println("\n\nconflict voilated: CR.09");
                      		}
                      	else
                      		System.out.println("\n\nno conflict 9");}
                
                
             
              
                
                }
                
        });
		btnNewButton.setBounds(431, 11, 80, 25);
		contentPane.add(btnNewButton);
	}
}