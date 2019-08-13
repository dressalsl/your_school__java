package your_school.apresentacao;

import javax.swing.JPanel;

import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.apresentacao.submenu_alunos;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu_principal extends JPanel {

	/**
	 * Create the panel.
	 */
	public menu_principal() {
		setLayout(new MigLayout("", "[][][][][][][][][][]", "[][][][][][]"));
		
		JLabel label = new JLabel("Menu Principal");
		add(label, "cell 0 0");
		
		JButton button_3 = new JButton("Sair");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		add(button_3, "cell 9 0");
		
		JLabel label_1 = new JLabel("Alunos");
		add(label_1, "cell 2 3");
		
		JButton button = new JButton("Acessar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_alunos());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 3 3");
		
		JLabel label_2 = new JLabel("Professores");
		add(label_2, "cell 2 4");
		
		JButton button_1 = new JButton("Acessar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_professores());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_1, "cell 3 4");
		
		JLabel label_3 = new JLabel("Turmas");
		add(label_3, "cell 2 5");
		
		JButton button_2 = new JButton("Acessar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_turmas());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_2, "cell 3 5");

	}

}
