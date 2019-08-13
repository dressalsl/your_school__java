package your_school.apresentacao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.dados.Repositorio;
import your_school.entidades.Aluno;
import your_school.entidades.Professor;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editar_professor1 extends JPanel {
	private JTextField textField;
	private static Professor professorEditado;
	
	public static Professor getProfessorEditado() {
		return professorEditado;
	}


	/**
	 * Create the panel.
	 */
	public editar_professor1() {
		setLayout(new MigLayout("", "[][277.00,grow]", "[][][][][]"));
		
		JLabel label = new JLabel("Editar Cadastro de Professores");
		add(label, "cell 0 0");
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_professores());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 1 0,alignx right");
		
		JLabel label_1 = new JLabel("Insira o código do Professor:");
		add(label_1, "cell 0 3,alignx trailing");
		
		textField = new JTextField();
		textField.setColumns(10);
		add(textField, "cell 1 3,alignx left");
		
		JButton button_1 = new JButton("Enviar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String codigoProfessor = textField.getText();
				
				for (Professor ProfessorCadastrado: Repositorio.getInstancia().obterTodosProfessores()) {
					if (ProfessorCadastrado.getCpf().equals(codigoProfessor)) {
						professorEditado=ProfessorCadastrado;
						Main.getFrame().setContentPane(new editar_professor2());
						Main.getFrame().getContentPane().revalidate();

				
			}}
			}
		});
		add(button_1, "cell 1 4");

	}

}
