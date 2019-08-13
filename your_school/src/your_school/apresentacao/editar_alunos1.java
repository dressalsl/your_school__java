package your_school.apresentacao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.dados.Repositorio;
import your_school.entidades.Aluno;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editar_alunos1 extends JPanel {
	private JTextField textField;
	private static Aluno alunoEditado;
	
	public static Aluno getAlunoEditado() {
		return alunoEditado;
	}

	/**
	 * Create the panel.
	 */
	public editar_alunos1() {
		setLayout(new MigLayout("", "[61.00][186.00][][][][]", "[][][][][][]"));
		
		JLabel lblEditarCadastroDe = new JLabel("Editar Cadastro de Alunos");
		add(lblEditarCadastroDe, "cell 0 0 2 1");
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.getFrame().setContentPane(new menu_principal());
				Main.getFrame().getContentPane().revalidate();		
			}
		});
		add(btnVoltar, "cell 5 0");
		
		JLabel lblInsiraOCdigo = new JLabel("Insira o código do aluno:");
		add(lblInsiraOCdigo, "cell 1 3");
		
		textField = new JTextField();
		add(textField, "cell 1 4,growx");
		textField.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigoAluno = textField.getText();
								
				for (Aluno alunoCadastrado: Repositorio.getInstancia().obterTodosAlunos()) {
					if (alunoCadastrado.getCpf().equals(codigoAluno)) {
						alunoEditado=alunoCadastrado;
						Main.getFrame().setContentPane(new editar_alunos2());
						Main.getFrame().getContentPane().revalidate();
					}
				}

			}
		});
		add(btnEnviar, "cell 1 5,alignx right");

	}

}
