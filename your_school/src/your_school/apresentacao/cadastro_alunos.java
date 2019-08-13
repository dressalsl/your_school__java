package your_school.apresentacao;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.entidades.Aluno;
import your_school.excecoes.AlunoInvalidoException;
import your_school.negocio.ControladorCadastroAlunos;

import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class cadastro_alunos extends JPanel {
	private JTextField nometextField;
	private JTextField nomeResptextField;
	private JTextField cpftextField;
	private JTextField rgtextField;
	private JTextField enderecotextField;
	private JTextField data_nasctextField;
	private JTextField fonetextField;
	private JTextField naturalidadetextField;
	private JTextField emailtextField;
	private JTextField tipoDefictextField;
	private JTextField serietextField;
	private JComboBox tipoSanguineocomboBox;
	private JComboBox estadoCivilcomboBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public cadastro_alunos() {
		setLayout(new MigLayout("", "[440.00]", "[][][][][][][][][][][][][]"));
		
		JLabel label = new JLabel("Cadastro de Alunos");
		add(label, "flowx,cell 0 0,growx");
		
		JLabel lblNome = new JLabel("Nome:");
		add(lblNome, "flowx,cell 0 2");
		
		nometextField = new JTextField();
		nometextField.setColumns(10);
		add(nometextField, "cell 0 2,growx");
		
		JLabel label_1 = new JLabel("Nome do Responsável: (Caso houver):");
		add(label_1, "flowx,cell 0 3");
		
		nomeResptextField = new JTextField();
		nomeResptextField.setColumns(10);
		add(nomeResptextField, "cell 0 3,growx");
		
		JLabel label_2 = new JLabel("CPF:");
		add(label_2, "flowx,cell 0 4");
		
		cpftextField = new JTextField();
		cpftextField.setColumns(10);
		add(cpftextField, "cell 0 4");
		
		JLabel label_3 = new JLabel("RG:");
		add(label_3, "cell 0 4");
		
		rgtextField = new JTextField();
		rgtextField.setColumns(10);
		add(rgtextField, "cell 0 4,growx");
		
		JLabel label_4 = new JLabel("Endereço:");
		add(label_4, "flowx,cell 0 5");
		
		enderecotextField = new JTextField();
		enderecotextField.setColumns(10);
		add(enderecotextField, "cell 0 5,growx");
		
		JLabel label_8 = new JLabel("Naturalidade:");
		add(label_8, "flowx,cell 0 6");
		
		naturalidadetextField = new JTextField();
		naturalidadetextField.setColumns(10);
		add(naturalidadetextField, "cell 0 6");
		
		JLabel label_5 = new JLabel("Data de Nascimento:");
		add(label_5, "cell 0 6");
		
		data_nasctextField = new JTextField();
		data_nasctextField.setColumns(10);
		add(data_nasctextField, "cell 0 6,growx");
		
		JLabel label_6 = new JLabel("Sexo:");
		add(label_6, "flowx,cell 0 7");
		
		JRadioButton masculinoRadioButton = new JRadioButton("M");
		buttonGroup.add(masculinoRadioButton);
		add(masculinoRadioButton, "cell 0 7");
		
		JRadioButton femininoRadioButton = new JRadioButton("F");
		buttonGroup.add(femininoRadioButton);
		add(femininoRadioButton, "cell 0 7");
		
		JLabel label_7 = new JLabel("Celular:");
		add(label_7, "cell 0 7");
		
		fonetextField = new JTextField();
		fonetextField.setColumns(10);
		add(fonetextField, "cell 0 7,growx");
		
		JLabel label_9 = new JLabel("E-mail:");
		add(label_9, "flowx,cell 0 8");
		
		emailtextField = new JTextField();
		emailtextField.setColumns(10);
		add(emailtextField, "cell 0 8,growx");
		
		JLabel label_10 = new JLabel("Tipo Sanguíneo:");
		add(label_10, "flowx,cell 0 9");
		
		tipoSanguineocomboBox = new JComboBox();
		tipoSanguineocomboBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		add(tipoSanguineocomboBox, "cell 0 9");
		
		JLabel label_11 = new JLabel("Estado Civil:");
		add(label_11, "cell 0 9");
		
		
		estadoCivilcomboBox = new JComboBox();
		estadoCivilcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)"}));
		add(estadoCivilcomboBox, "cell 0 9");
		
		JLabel label_12 = new JLabel("Deficiência:");
		add(label_12, "flowx,cell 0 10");
		
		JRadioButton deficSimradioButton = new JRadioButton("Sim");
		buttonGroup_1.add(deficSimradioButton);
		add(deficSimradioButton, "cell 0 10");
		
		JRadioButton deficNaoradioButton = new JRadioButton("Não");
		buttonGroup_1.add(deficNaoradioButton);
		add(deficNaoradioButton, "cell 0 10");
		
		tipoDefictextField = new JTextField();
		tipoDefictextField.setColumns(10);
		add(tipoDefictextField, "cell 0 10,growx");
		
		JLabel label_13 = new JLabel("Série:");
		add(label_13, "flowx,cell 0 11");
		
		serietextField = new JTextField();
		serietextField.setColumns(10);
		add(serietextField, "cell 0 11");
		
		
		JButton button = new JButton("Enviar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				
				aluno.setNome(nometextField.getText());
				aluno.setCpf(cpftextField.getText());
				aluno.setNome_responsavel(nomeResptextField.getText());
				aluno.setRg(rgtextField.getText());
				aluno.setData_nasc(data_nasctextField.getText());
				aluno.setEndereco(enderecotextField.getText());
				aluno.setNaturalidade(naturalidadetextField.getText());
				aluno.setData_nasc(data_nasctextField.getText());;
				
				if (masculinoRadioButton.isSelected()) {
					aluno.setSexo('M');
				}
				
				if (femininoRadioButton.isSelected()) {
					aluno.setSexo('F');
				}
				
				aluno.setFone(fonetextField.getText());
				aluno.setEmail(emailtextField.getText());
				aluno.setTipo_sanguineo((String) tipoSanguineocomboBox.getSelectedItem());
				aluno.setEstado_civil((String) estadoCivilcomboBox.getSelectedItem()); 
				
				if (deficSimradioButton.isSelected()) {
					aluno.setDefic(true); 
					aluno.setTipo_defic(tipoDefictextField.getText());
				}
				
				if (deficNaoradioButton.isSelected()) {
					aluno.setDefic(false);
				}
				
				aluno.setSerie(serietextField.getText());
				
				Set<String> disciplinas = new HashSet<String>();
				disciplinas.add("Português");
				disciplinas.add("Matemática");
				disciplinas.add("História");
				disciplinas.add("Geografia");
				disciplinas.add("Filosofia");
				disciplinas.add("Sociologia");
				disciplinas.add("Biologia");
				disciplinas.add("Química");
				disciplinas.add("Física");
				disciplinas.add("Língua Estrangeira");
				disciplinas.add("Educação Física");
				
				aluno.setDisciplinas(disciplinas);
				
				for(String disciplina: disciplinas) {
					aluno.getNota_disciplina().put(disciplina, new ArrayList<Double>());
					for(int i=0; i<8; i++) {
						aluno.getNota_disciplina().get(disciplina).add(0.);
					}
				}
								
				try {
					ControladorCadastroAlunos controladorCadastroAlunos = new ControladorCadastroAlunos();
					controladorCadastroAlunos.cadastrarAluno(aluno);
					
					Main.getFrame().setContentPane(new submenu_alunos());
					Main.getFrame().getContentPane().revalidate();
				} catch (AlunoInvalidoException excecao) {
					// TODO Auto-generated catch block
					excecao.printStackTrace();
				}
				
				
				
				
				
				
				
			}
		});
		add(button, "cell 0 12,alignx right");
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_alunos ());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(btnNewButton, "cell 0 0,alignx right");

	}

}
