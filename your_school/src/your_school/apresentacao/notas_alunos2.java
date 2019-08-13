package your_school.apresentacao;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.entidades.Aluno;
import your_school.excecoes.AlunoInvalidoException;
import your_school.negocio.ControladorCadastroAlunos;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class notas_alunos2 extends JPanel {
	private JTable notasAlunotable;
	private Aluno aluno;

	/**
	 * Create the panel.
	 */
	public notas_alunos2() {
		aluno=notas_alunos1.getAluno();
				
		setLayout(new MigLayout("", "[][grow][][][][][][][]", "[][][13.00][][][]"));
		
		JLabel label = new JLabel("Notas");
		add(label, "cell 0 0");
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new notas_alunos1());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 8 0");
		
		JLabel lblAluno = new JLabel("Aluno: "+aluno.getNome());
		add(lblAluno, "cell 0 1 2 1");
		
		JButton button_1 = new JButton("Enviar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					ControladorCadastroAlunos controladorCadastroAlunos = new ControladorCadastroAlunos();
					controladorCadastroAlunos.atualizarAluno(aluno);
					Main.getFrame().setContentPane(new editar_alunos1());;
					Main.getFrame().getContentPane().revalidate();
				} catch (AlunoInvalidoException excecao) {
					// TODO Auto-generated catch block
					excecao.printStackTrace();
				}
				
				Main.getFrame().setContentPane(new submenu_alunos());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 1 3 7 2,grow");
		
		notasAlunotable = new JTable();
		notasAlunotable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Disciplina", "Nota 1", "Nota 2", "M\u00E9dia - 1 UN", "Nota 3", "Nota 4", "Media - 2 UN", "Final", "Media Geral"
			}
		));
		
		scrollPane.setViewportView(notasAlunotable);
		
		add(button_1, "cell 8 5");
		
		preencherTabela();
	}
	
	 private void preencherTabela() {
		 notasAlunotable.setModel(new Nota_AlunoTableModel(aluno));
	    }

}
