package hackchatbot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;

public class ChatBot extends JFrame {

	private JPanel contentPane;
	public JTextArea Chatarea=new JTextArea();
	public JTextField Chatbox=new JTextField();

	
	public ChatBot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 75, 477, 313);
		contentPane.add(scrollPane);
		Chatarea.setFont(new Font("Courier New", Font.BOLD, 18));
		
		
		scrollPane.setViewportView(Chatarea);
		
		JLabel lblNewLabel = new JLabel("Click to chat with Ibot");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 20));
		lblNewLabel.setBounds(49, 448, 312, 14);
		contentPane.add(lblNewLabel);
		Chatbox.setFont(new Font("Courier New", Font.BOLD, 15));
		
		
		Chatbox.setBounds(49, 483, 477, 54);
		contentPane.add(Chatbox);
		Chatbox.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ibot ");
		lblNewLabel_1.setFont(new Font("Courier New", Font.BOLD, 19));
		lblNewLabel_1.setBounds(218, 29, 90, 22);
		contentPane.add(lblNewLabel_1);
		
		Chatbox.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String gtext=Chatbox.getText().toLowerCase();
			Chatarea.append("YOU--->>" + gtext + "\n" );
			Chatbox.setText("");

			if(gtext.contains("hi")){
			bot("Welcome! \nWhich service would you like to request for? \n1.Software request. \n2.IT accessories \n3.Data Card");
			}
			else{
			bot("I DON'T UNDERSTAND YOU");
			}

			}

			});	
			}
			private void bot(String string){
			Chatarea.append("BOT--->>" +string+ "\n");


			}
	



public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				ChatBot frame = new ChatBot();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}