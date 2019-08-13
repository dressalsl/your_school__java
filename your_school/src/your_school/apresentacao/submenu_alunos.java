package your_school.apresentacao;

import javax.swing.JPanel;

import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import your_school.Main;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class submenu_alunos extends JPanel {

	/**
	 * Create the panel.
	 */
	public submenu_alunos() {
		setLayout(new MigLayout("", "[][][][][][][][][][][][][][]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Alunos");
		add(lblNewLabel, "cell 0 0");
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
						Main.getFrame().setContentPane(new menu_principal());
						Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 13 0");
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de Alunos");
		add(lblNewLabel_1, "cell 2 2");
		
		JButton button_1 = new JButton("Acessar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new cadastro_alunos ());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_1, "cell 4 2");
		
		JLabel lblEditarAlunos = new JLabel("Editar Cadastro");
		add(lblEditarAlunos, "cell 2 3");
		
		JButton button_2 = new JButton("Acessar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				Main.getFrame().setContentPane(new editar_alunos1());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_2, "cell 4 3");
		
		JLabel label = new JLabel("Presença:");
		add(label, "cell 2 4");
		
		JButton button_3 = new JButton("Acessar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new presenca_alunos1());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_3, "cell 4 4");
		
		JLabel label_1 = new JLabel("Notas:");
		add(label_1, "cell 2 5");
		
		JButton button_4 = new JButton("Acessar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new notas_alunos1());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_4, "cell 4 5");

	}

}
