package your_school.apresentacao;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import your_school.Main;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class submenu_turmas extends JPanel {

	/**
	 * Create the panel.
	 */
	public submenu_turmas() {
		setLayout(new MigLayout("", "[][][][][][][][][][][]", "[][][][][]"));
		
		JLabel lblTurmas = new JLabel("Turmas");
		add(lblTurmas, "cell 0 0");
		
		JButton button_2 = new JButton("Voltar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new menu_principal());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_2, "cell 10 0");
		
		JLabel label = new JLabel("Cadastro de Turma:");
		add(label, "cell 2 3");
		
		JButton button = new JButton("Acessar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new cadastro_turmas());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 6 3");
		
		JLabel label_1 = new JLabel("Editar Cadastro:");
		add(label_1, "cell 2 4");
		
		JButton button_1 = new JButton("Acessar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new editar_turmas1());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_1, "cell 6 4");

	}

}
