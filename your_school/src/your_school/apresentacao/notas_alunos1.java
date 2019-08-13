package your_school.apresentacao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.dados.Repositorio;
import your_school.entidades.Aluno;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class notas_alunos1 extends JPanel {
	private JTextField codAlunotextField;
	private static Aluno aluno;

	/**
	 * Create the panel.
	 */
	public notas_alunos1() {
		setLayout(new MigLayout("", "[][][][][grow][][][][][][][][]", "[][][][]"));
		
		JLabel label = new JLabel("Notas:");
		add(label, "cell 0 0");
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_alunos());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 12 0");
		
		JLabel lblInsiraOCdigo = new JLabel("Insira o código do aluno:");
		add(lblInsiraOCdigo, "cell 3 2,alignx trailing");
		
		codAlunotextField = new JTextField();
		codAlunotextField.setColumns(10);
		add(codAlunotextField, "cell 4 2 8 1,growx");
		
		JButton button_1 = new JButton("Enviar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigoAluno = codAlunotextField.getText();
				
				for(Aluno alunoCadastrado: Repositorio.getInstancia().obterTodosAlunos()) {
					if(alunoCadastrado.getCpf().equals(codigoAluno)) {
						aluno=alunoCadastrado;
						Main.getFrame().setContentPane(new notas_alunos2());
						Main.getFrame().getContentPane().revalidate();
						
					}
				}
			}
		});
		add(button_1, "cell 7 3");

	}

	public static Aluno getAluno() {
		return aluno;
	}

}
