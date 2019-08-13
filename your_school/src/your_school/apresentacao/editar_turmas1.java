package your_school.apresentacao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.dados.Repositorio;
import your_school.entidades.Aluno;
import your_school.entidades.Turma;

import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editar_turmas1 extends JPanel {
	private JTextField codigoTurmatextField;
	private static Turma turmaEditada;
	
	public static Turma getturmaEditada() {
		return turmaEditada;
	}

	/**
	 * Create the panel.
	 */
	public editar_turmas1() {
		setLayout(new MigLayout("", "[70.00][][12.00][106.00][][][]", "[][][][][]"));
		
		JLabel label = new JLabel("Editar Cadastro de Turmas");
		add(label, "cell 0 0 2 1");
		
		JButton button_1 = new JButton("Voltar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_turmas());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_1, "cell 6 0");
		
		JLabel label_1 = new JLabel("Insira o código da turma:");
		add(label_1, "cell 1 3");
		
		codigoTurmatextField = new JTextField();
		codigoTurmatextField.setColumns(10);
		add(codigoTurmatextField, "cell 3 3,growx");
		
		JButton button = new JButton("Enviar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String codigoTurma = codigoTurmatextField.getText();
				
				for (Turma turmaCadastrada: Repositorio.getInstancia().obterTodasTurmas()) {
					if (turmaCadastrada.getCodigo().equals(codigoTurma)) {
						turmaEditada = turmaCadastrada;
						Main.getFrame().setContentPane(new editar_turmas2());
						Main.getFrame().getContentPane().revalidate();
					}
				}

				
			}
		});
		add(button, "cell 3 4,alignx right");

	}

}
