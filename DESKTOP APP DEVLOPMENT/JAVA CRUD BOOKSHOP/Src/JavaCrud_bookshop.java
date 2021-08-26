
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JavaCrud_bookshop {
    private JFrame frmBookshop;
	private JTextField txtbname;
	private JTextField txtedition;
	private JTextField txtprice;
	private JTextField txtbid;
	private JTable table;
	String output;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCrud_bookshop window = new JavaCrud_bookshop();
					window.frmBookshop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaCrud_bookshop() {
		initialize();
		connect();
		table_load();
	}
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
       public void connect()
       {
    	   try {
    		   Class.forName("com.mysql.cj.jdbc.Driver");
    		   con = DriverManager.getConnection("jdbc:mysql://localhost/javacruddb", "root", "admin");		   
    	   }
    	   catch (ClassNotFoundException ex)
    	   {
    		  ex.printStackTrace(); 
    	   }
    	   catch (SQLException ex)
    	   {
    		   ex.printStackTrace();
    	   }
       }
       /**
   	 * Table_load Method contents of the frame.
   	 */


  public void table_load()
  {
  	try 
  	{
	    pst = con.prepareStatement("select * from bookshop");
	    rs = pst.executeQuery();
	    table.setModel(DbUtils.resultSetToTableModel(rs));
	} 
  	catch (SQLException e) 
  	 {
  		e.printStackTrace();
	  } 
  } 
       
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookshop = new JFrame();
		frmBookshop.getContentPane().setForeground(Color.GRAY);
		frmBookshop.getContentPane().setBackground(Color.CYAN);
		frmBookshop.setTitle("BOOKSHOP");
		frmBookshop.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKSHOP");
		lblNewLabel.setBounds(268, 50, 148, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmBookshop.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 73, 295, 206);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				                                  "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frmBookshop.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BOOK NAME");
		lblNewLabel_1.setBounds(24, 47, 109, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("EDITION");
		lblNewLabel_1_1.setBounds(24, 114, 66, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("PRICE");
		lblNewLabel_1_2.setBounds(24, 169, 66, 13);
		panel.add(lblNewLabel_1_2);
		
		txtbname = new JTextField();
		txtbname.setBounds(143, 47, 128, 19);
		panel.add(txtbname);
		txtbname.setColumns(10);
		
		txtedition = new JTextField();
		txtedition.setColumns(10);
		txtedition.setBounds(143, 111, 128, 19);
		panel.add(txtedition);
		
		txtprice = new JTextField();
		txtprice.setColumns(10);
		txtprice.setBounds(143, 166, 128, 19);
		panel.add(txtprice);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bname,edition,price;
				bname = txtbname.getText();
				edition = txtedition.getText();
				price = txtprice.getText();
				
				try {
					pst = con.prepareStatement("insert into bookshop(name,edition,price)values(?,?,?)");
					pst.setString(1, bname);
					pst.setString(2, edition);
					pst.setString(3, price);
					pst.executeUpdate();
					output = "Record Addedddd!!!!!!";
     				JOptionPane.showMessageDialog(null, output, "SAVE",JOptionPane.INFORMATION_MESSAGE);
					table_load();
						           
					txtbname.setText("");
					txtedition.setText("");
					txtprice.setText("");
					txtbname.requestFocus();
				   }
			 
				catch (SQLException e1) 
			        {
									
				e1.printStackTrace();
				}
			}
		});
		btnSave.setBounds(10, 289, 85, 35);
		frmBookshop.getContentPane().add(btnSave);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(311, 413, 85, 35);
		frmBookshop.getContentPane().add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(220, 289, 85, 35);
		frmBookshop.getContentPane().add(btnUpdate);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 364, 295, 84);
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmBookshop.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BOOK ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 35, 81, 19);
		panel_1.add(lblNewLabel_2);
		
		txtbid = new JTextField();
		txtbid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try {
			          
		            String id = txtbid.getText();

		                pst = con.prepareStatement("select name,edition,price from bookshop where id = ?");
		                pst.setString(1, id);
		                ResultSet rs = pst.executeQuery();

		            if(rs.next()==true)
		            {
		                String name = rs.getString(1);
		                String edition = rs.getString(2);
		                String price = rs.getString(3);
		                
		                txtbname.setText(name);
		                txtedition.setText(edition);
		                txtprice.setText(price);		              
	              
		            }   
		            else
		            {
		            	txtbname.setText("");
		            	txtedition.setText("");
		                txtprice.setText("");
		                 
		            }
		            
		        } 
			
			 catch (SQLException ex) {
		           
		        }		
		}
			
		});
		txtbid.setBounds(115, 35, 154, 19);
		panel_1.add(txtbid);
		txtbid.setColumns(10);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bid;
				bid  = txtbid.getText();
				
				 try {
						pst = con.prepareStatement("delete from bookshop where id =?");
				
			            pst.setString(1, bid);
			            pst.executeUpdate();
			            JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
			            table_load();
			           
			            txtbname.setText("");
			            txtedition.setText("");
			            txtprice.setText("");
			            txtbid.setText("");
			            txtbname.requestFocus();
					}
	 
		            catch (SQLException e1) {
						
						e1.printStackTrace();
					}
			}
		});
		btnDelete.setBounds(117, 289, 85, 35);
		frmBookshop.getContentPane().add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(311, 76, 349, 327);
		frmBookshop.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
