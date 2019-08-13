package your_school.apresentacao;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.entidades.Aluno;
import your_school.entidades.Turma;
import your_school.excecoes.AlunoInvalidoException;
import your_school.negocio.ControladorCadastroAlunos;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class presenca_alunos2 extends JPanel {
	private JTable presencaAlunostable;
	private Turma turma;
	private String data;
	private List<Aluno> alunosTurma = new ArrayList();

	/**
	 * Create the panel.
	 */
	public presenca_alunos2() {
		turma = presenca_alunos1.getTurma();
		data = presenca_alunos1.getDataPresenca();
				
		setLayout(new MigLayout("", "[][grow][][][][][][][][][][][]", "[][][][grow][][][][][][][]"));
		
		JLabel label = new JLabel("Presença");
		add(label, "cell 0 0");
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new presenca_alunos1());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 12 0");
		
		JLabel label_1 = new JLabel("Turma: "+turma.getCodigo());
		add(label_1, "cell 0 1");
		
		JLabel lblData = new JLabel("Data: "+data);
		add(lblData, "flowx,cell 0 2");
		
		JButton button_1 = new JButton("Enviar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alunosTurma = turma.getAlunos();
				
				for(Aluno aluno: alunosTurma) {
					
					try {
						ControladorCadastroAlunos controladorCadastroAlunos = new ControladorCadastroAlunos();
						controladorCadastroAlunos.atualizarAluno(aluno);
						Main.getFrame().setContentPane(new editar_alunos1());;
						Main.getFrame().getContentPane().revalidate();
					} catch (AlunoInvalidoException excecao) {
						// TODO Auto-generated catch block
						excecao.printStackTrace();
					}
				
				}
				
				Main.getFrame().setContentPane(new submenu_alunos());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 1 3 11 7,grow");
		
		presencaAlunostable = new JTable();
		presencaAlunostable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Aluno", "Faltas"
			}
		));
		presencaAlunostable.getColumnModel().getColumn(0).setResizable(false);
		presencaAlunostable.getColumnModel().getColumn(1).setResizable(false);
		scrollPane.setViewportView(presencaAlunostable);
		add(button_1, "cell 12 10");
		
		preencherTabela();

	}
	
	 private void preencherTabela() {
	        alunosTurma = turma.getAlunos();
	        presencaAlunostable.setModel(new Presenca_AlunoTableModel(alunosTurma));
	    }


}
