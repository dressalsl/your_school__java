package your_school.apresentacao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.dados.Repositorio;
import your_school.entidades.Aluno;
import your_school.entidades.Professor;
import your_school.entidades.Turma;
import your_school.excecoes.TurmaInvalidoException;
import your_school.negocio.ControladorCadastroTurma;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;

public class editar_turmas2 extends JPanel {
	private JTextField codigoAlunotextField;
	private JTable alunosTurmatable;
	private Turma  turmaEditada;
	private JTextField serietextField;
	private JTextField turnotextField;
	private JTextField turmatextField;
	private List<Aluno> alunosTurma = new ArrayList();
	private JTextField codProfessortextField;

	/**
	 * Create the panel.
	 */
	
	public editar_turmas2() {
			
		turmaEditada=editar_turmas1.getturmaEditada();	
		
		setLayout(new MigLayout("", "[134.00][grow][]", "[][25.00][][44.00][][][][]"));
		
		JLabel label = new JLabel("Editar Cadastro de Turmas");
		add(label, "cell 0 0");
		
		JLabel lblNewLabel = new JLabel("Professor:");
		add(lblNewLabel, "flowx,cell 1 0,alignx center");
		
		JLabel label_1 = new JLabel("");
		add(label_1, "cell 1 0");
		label_1.setText(turmaEditada.getProfessor().getNome());
		
		JButton button_4 = new JButton("Voltar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new editar_turmas1());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_4, "cell 2 0,alignx right");
		
		JLabel lblCdigoDaTurma = new JLabel("Turma:");
		add(lblCdigoDaTurma, "flowx,cell 0 1");
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 1 1 2 6,grow");
				
		alunosTurmatable = new JTable();
		alunosTurmatable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome"
			}
		));
		scrollPane.setViewportView(alunosTurmatable);
		
		JLabel lblSrie = new JLabel("Série:");
		add(lblSrie, "flowx,cell 0 2,alignx left");
		
		JLabel lblTurma = new JLabel("Turno:");
		add(lblTurma, "flowx,cell 0 3");
		
		JButton button_2 = new JButton("Deletar Turma");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControladorCadastroTurma controladorCadastroTurma = new ControladorCadastroTurma();
				controladorCadastroTurma.deletarTurma(turmaEditada);
				Main.getFrame().setContentPane(new editar_turmas1());;
				Main.getFrame().getContentPane().revalidate();
			}
		});
		
		JButton button = new JButton("Adicionar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String codigoAluno = codigoAlunotextField.getText();
				
				for (Aluno alunoCadastrado : Repositorio.getInstancia().obterTodosAlunos()) {
					if (alunoCadastrado.getCpf().equals(codigoAluno)) {
						turmaEditada.addAluno(alunoCadastrado);
						Main.getFrame().setContentPane(new editar_turmas2());
						Main.getFrame().getContentPane().revalidate();
					}
				}
				
			}
		});
		
		JLabel lblCdProfessor = new JLabel("Código do Professor:");
		add(lblCdProfessor, "flowy,cell 0 4");
		
		JLabel lblAdicionarAluno = new JLabel("Alunos");
		add(lblAdicionarAluno, "flowx,cell 0 5,alignx center,aligny top");
		
		JLabel lblInsiraOCdigo = new JLabel("Insira o código do aluno:");
		add(lblInsiraOCdigo, "flowy,cell 0 6,aligny top");
		
		codigoAlunotextField = new JTextField();
		codigoAlunotextField.setColumns(10);
		add(codigoAlunotextField, "cell 0 6,growx,aligny top");
		add(button, "cell 0 6,aligny top");
		
		JButton button_1 = new JButton("Remover");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigoAluno = codigoAlunotextField.getText();
				
				for (Aluno alunoCadastrado : turmaEditada.getAlunos()) {
					if (alunoCadastrado.getCpf().equals(codigoAluno)) {
						turmaEditada.removeAluno(alunoCadastrado);
						Main.getFrame().setContentPane(new editar_turmas2());
						Main.getFrame().getContentPane().revalidate();
					}
				}
			}
		});
		add(button_1, "cell 0 6");
		add(button_2, "cell 0 7");
		
		serietextField = new JTextField();
		add(serietextField, "cell 0 2,alignx right");
		serietextField.setText(turmaEditada.getSerie());
		serietextField.setColumns(10);
		
		turnotextField = new JTextField();
		add(turnotextField, "cell 0 3,alignx right");
		turnotextField.setText(turmaEditada.getTurno());
		turnotextField.setColumns(10);
		
		turmatextField = new JTextField();
		add(turmatextField, "cell 0 1,alignx right");
		turmatextField.setText(turmaEditada.getCodigo());
		turmatextField.setColumns(10);

		codProfessortextField = new JTextField();
		add(codProfessortextField, "cell 0 4,aligny bottom");
		codProfessortextField.setColumns(10);
		codProfessortextField.setText(turmaEditada.getProfessor().getCpf());
		
		JButton button_3 = new JButton("Enviar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turma turmaAtualizada = new Turma();
				
				turmaAtualizada.setCodigo(turmaEditada.getCodigo());
				turmaAtualizada.setSerie(turmaEditada.getSerie());
				turmaAtualizada.setTurno(turmaEditada.getTurno());
				turmaAtualizada.setAlunos((ArrayList<Aluno>) turmaEditada.getAlunos());
				
				String codigoProfessor = codProfessortextField.getText();
				
				for(Professor professor: Repositorio.getInstancia().obterTodosProfessores()) {
					if (codigoProfessor.equals(professor.getCpf())) {
						turmaAtualizada.setProfessor(professor);
					}
				}
				
				ControladorCadastroTurma controladorCadastroTurmas = new ControladorCadastroTurma();
				try {
					controladorCadastroTurmas.atualizarTurma(turmaAtualizada);
				} catch (TurmaInvalidoException excecao) {
					// TODO Auto-generated catch block
					excecao.printStackTrace();
				}
								
				
				Main.getFrame().setContentPane(new submenu_turmas());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_3, "cell 2 7,alignx right");
		
		preencherTabela();

	}
	
	 private void preencherTabela() {
	        alunosTurma = turmaEditada.getAlunos();
	        alunosTurmatable.setModel(new Editar_TurmaTableModel(alunosTurma));
	    }


}
