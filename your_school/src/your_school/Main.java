package your_school;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import your_school.apresentacao.acesso;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private static JFrame frmYourSchool;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.frmYourSchool.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		initialize();
	}
	
	private void initialize(){
		frmYourSchool = new JFrame();
		frmYourSchool.setTitle("SISTEMA DE ESCOLA");
		frmYourSchool.setBounds(100, 100, 450, 400);
		frmYourSchool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmYourSchool.setContentPane(new acesso());
		};

	public static JFrame getFrame() {
		return frmYourSchool;
	}

}
