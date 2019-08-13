package your_school.apresentacao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.dados.Repositorio;
import your_school.entidades.Professor;
import your_school.entidades.Turma;
import your_school.excecoes.TurmaInvalidoException;
import your_school.negocio.ControladorCadastroTurma;

import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cadastro_turmas extends JPanel {
	private JTextField serietextField;
	private JTextField turnotextField;
	private JTextField codigotextField;
	private JTextField professortextField;

	/**
	 * Create the panel.
	 */
	public cadastro_turmas() {
		setLayout(new MigLayout("", "[][][193.00,grow][]", "[][][][][][][][]"));
		
		JLabel label = new JLabel("Cadastro de Turmas");
		add(label, "cell 0 0");
		
		JButton button_1 = new JButton("Voltar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_turmas());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_1, "cell 3 0");
		
		JLabel label_2 = new JLabel("Série:");
		add(label_2, "cell 1 3,alignx left");
		
		serietextField = new JTextField();
		serietextField.setColumns(10);
		add(serietextField, "cell 2 3,alignx left");
		
		turnotextField = new JTextField();
		turnotextField.setColumns(10);
		add(turnotextField, "cell 2 4,alignx left");
		
		JLabel lblCdigoDaTurma = new JLabel("Código da Turma:");
		add(lblCdigoDaTurma, "cell 1 5,alignx left");
		
		codigotextField = new JTextField();
		codigotextField.setColumns(10);
		add(codigotextField, "cell 2 5,alignx left");
		
		JLabel label_3 = new JLabel("Turno:");
		add(label_3, "flowy,cell 1 4,alignx left");
		
		JLabel lblCdigoDoProfessor = new JLabel("Código do Professor:");
		add(lblCdigoDoProfessor, "cell 1 6,alignx left");
		
		professortextField = new JTextField();
		professortextField.setColumns(10);
		add(professortextField, "cell 2 6,alignx left");
		
		JButton button = new JButton("Enviar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Turma turma = new Turma();
				
				turma.setSerie(serietextField.getText());
				turma.setTurno(turnotextField.getText());
				turma.setCodigo(codigotextField.getText());
				
				String codigoProfessor = professortextField.getText();
				
				for(Professor professor: Repositorio.getInstancia().obterTodosProfessores()) {
					if (codigoProfessor.equals(professor.getCpf())) {
						turma.setProfessor(professor);
					}
				}
				
				try {
					ControladorCadastroTurma controladorCadastroTurmas = new ControladorCadastroTurma();
					controladorCadastroTurmas.cadastrarTurma(turma);
					
					Main.getFrame().setContentPane(new submenu_turmas());
					Main.getFrame().getContentPane().revalidate();
				} catch (TurmaInvalidoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		

		add(button, "cell 2 7,alignx right");

	}

}
