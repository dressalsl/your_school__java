package your_school.apresentacao;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import your_school.Main;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class submenu_professores extends JPanel {

	/**
	 * Create the panel.
	 */
	public submenu_professores() {
		setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][]"));
		
		JLabel label = new JLabel("Professores");
		add(label, "cell 0 0");
		
		JButton button_2 = new JButton("Voltar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new menu_principal());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_2, "cell 8 0");
		
		JLabel label_1 = new JLabel("Cadastro de Professor:");
		add(label_1, "cell 2 3");
		
		JButton button = new JButton("Acessar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new cadastro_professores());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 5 3");
		
		JLabel label_2 = new JLabel("Editar Cadastro:");
		add(label_2, "cell 2 4");
		
		JButton button_1 = new JButton("Acessar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new editar_professor1());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_1, "cell 5 4");

	}

}
