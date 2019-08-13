package your_school.apresentacao;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import your_school.Main;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class acesso extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public acesso() {
		setLayout(new MigLayout("", "[][][147.00][][][][72.00]", "[][][][][][]"));
		
		JLabel label = new JLabel("Your School");
		add(label, "cell 0 0");
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		add(btnSair, "cell 6 0,alignx right");
		
		JLabel lblInsiraOCdigo = new JLabel("Insira o código de acesso:");
		add(lblInsiraOCdigo, "cell 2 4");
		
		textField = new JTextField();
		add(textField, "cell 2 5,growx");
		textField.setColumns(10);
		
		JButton btnAcesso = new JButton("Entrar");
		btnAcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new menu_principal());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(btnAcesso, "cell 3 5");

	}

}
