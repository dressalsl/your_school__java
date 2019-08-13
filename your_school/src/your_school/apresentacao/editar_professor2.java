package your_school.apresentacao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;

import your_school.entidades.Professor;
import your_school.excecoes.ProfessorInvalidoException;
import your_school.negocio.ControladorCadastroProfessor;

import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class editar_professor2 extends JPanel {
	private JTextField nometextField;
	private JTextField cpftextField;
	private JTextField rgtextField;
	private JTextField ctpstextField;
	private JTextField enderecotextField;
	private JTextField datanascimentotextField;
	private JTextField celulartextField;
	private JTextField naturalidadetextField;
	private JTextField emailtextField;
	private JTextField deficienciatextField;
	private JTextField disciplinatextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private Professor professorEditado;
	/**
	 * Create the panel.
	 */
	public editar_professor2() {
		
		professorEditado=editar_professor1.getProfessorEditado();
		
		setLayout(new MigLayout("", "[440.00]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblEditarCadastroDe = new JLabel("Editar Cadastro de Professores");
		add(lblEditarCadastroDe, "flowx,cell 0 0,growx");
		
		JLabel nomelabel = new JLabel("Nome:");
		add(nomelabel, "flowx,cell 0 2");
		
		nometextField = new JTextField();
		nometextField.setColumns(10);
		add(nometextField, "cell 0 2,growx");
		nometextField.setText(professorEditado.getNome());
		
		JLabel cpflabel = new JLabel("CPF:");
		add(cpflabel, "flowx,cell 0 3");
		
		cpftextField = new JTextField();
		cpftextField.setColumns(10);
		add(cpftextField, "cell 0 3,growx");
		cpftextField.setText(professorEditado.getCpf());

		
		JLabel rglabel = new JLabel("RG:");
		add(rglabel, "cell 0 3");
		
		rgtextField = new JTextField();
		rgtextField.setColumns(10);
		add(rgtextField, "cell 0 3,growx");
		rgtextField.setText(professorEditado.getRg());
		
		JLabel ctpslabel = new JLabel("CTPS:");
		add(ctpslabel, "flowx,cell 0 4");
		
		ctpstextField = new JTextField();
		ctpstextField.setColumns(10);
		add(ctpstextField, "cell 0 4,growx");
		ctpstextField.setText(professorEditado.getCtps());
		
		JLabel enderecolabel = new JLabel("Endereço:");
		add(enderecolabel, "flowx,cell 0 5");
		
		enderecotextField = new JTextField();
		enderecotextField.setColumns(10);
		add(enderecotextField, "cell 0 5,growx");
		enderecotextField.setText(professorEditado.getEndereco());
		
		JLabel naturalidadelabel = new JLabel("Naturalidade:");
		add(naturalidadelabel, "flowx,cell 0 6");
		
		naturalidadetextField = new JTextField();
		naturalidadetextField.setColumns(10);
		add(naturalidadetextField, "cell 0 6");
		naturalidadetextField.setText(professorEditado.getNaturalidade());
		
		JLabel datanascimentolabel = new JLabel("Data de Nascimento:");
		add(datanascimentolabel, "cell 0 6");
		
		JLabel sexolabel = new JLabel("Sexo:");
		add(sexolabel, "flowx,cell 0 7");
		
		JRadioButton masculinordbtn = new JRadioButton("M");
		buttonGroup.add(masculinordbtn);
		add(masculinordbtn, "cell 0 7");
		
		JRadioButton femininordbtn = new JRadioButton("F");
		buttonGroup.add(femininordbtn);
		add(femininordbtn, "cell 0 7");
		
		if(professorEditado.getSexo()=='M') {
			masculinordbtn.setSelected(true);
		} else {
			femininordbtn.setSelected(true);
		}
		
		JLabel fonelabel = new JLabel("Fone:");
		add(fonelabel, "cell 0 7");
		
		celulartextField = new JTextField();
		celulartextField.setColumns(10);
		add(celulartextField, "cell 0 7,growx");
		celulartextField.setText(professorEditado.getFone());
		
		JLabel emaillabel = new JLabel("E-mail:");
		add(emaillabel, "flowx,cell 0 8");
		
		emailtextField = new JTextField();
		emailtextField.setColumns(10);
		add(emailtextField, "cell 0 8,growx");
		emailtextField.setText(professorEditado.getEmail());
		
		JLabel tiposanguineolabel = new JLabel("Tipo Sanguíneo:");
		add(tiposanguineolabel, "flowx,cell 0 9");
		
		JComboBox tipoSanguineocomboBox = new JComboBox();
		tipoSanguineocomboBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		tipoSanguineocomboBox.setSelectedItem(professorEditado.getTipo_sanguineo());
		add(tipoSanguineocomboBox, "cell 0 9");
		
		JLabel estadocivillabel = new JLabel("Estado Civil:");
		add(estadocivillabel, "cell 0 9");
		
		JLabel deficiencialabel = new JLabel("Deficiência:");
		add(deficiencialabel, "flowx,cell 0 10");
		
		JRadioButton deficSimradioButton = new JRadioButton("Sim");
		buttonGroup_1.add(deficSimradioButton);
		add(deficSimradioButton, "cell 0 10");
		
		JRadioButton deficNaoradioButton = new JRadioButton("Não");
		buttonGroup_1.add(deficNaoradioButton);
		add(deficNaoradioButton, "cell 0 10");
		
		deficienciatextField = new JTextField();
		deficienciatextField.setColumns(10);
		add(deficienciatextField, "cell 0 10,growx");
		
		if(professorEditado.isDefic()) {
			deficSimradioButton.setSelected(true);
		} else {
			deficNaoradioButton.setSelected(true);
		}
		
		JLabel disciplinalabel = new JLabel("Disciplina:");
		add(disciplinalabel, "flowx,cell 0 11");
		
		disciplinatextField = new JTextField();
		disciplinatextField.setColumns(10);
		String disciplina = professorEditado.getDisciplinas().toString();
		add(disciplinatextField, "cell 0 11");
		
		JComboBox estadoCivilcomboBox = new JComboBox();
		estadoCivilcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)"}));
		estadoCivilcomboBox.setSelectedItem(professorEditado.getEstado_civil());
		add(estadoCivilcomboBox, "cell 0 9");
		
		JButton btnDeletarCadastro = new JButton("Deletar Cadastro");
		btnDeletarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControladorCadastroProfessor controladorCadastroProfessor = new ControladorCadastroProfessor();
				controladorCadastroProfessor.deletarProfessor(professorEditado);
				Main.getFrame().setContentPane(new editar_professor1());;
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(btnDeletarCadastro, "flowx,cell 0 13,alignx right");
		
		JButton button_1 = new JButton("Voltar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_professores());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button_1, "cell 0 0");
		
		datanascimentotextField = new JTextField();
		datanascimentotextField.setColumns(10);
		add(datanascimentotextField, "cell 0 6,alignx left");
		datanascimentotextField.setText(professorEditado.getData_nasc());
		
		JButton button_2 = new JButton("Enviar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Professor professor = new Professor ();
				
				professor.setNome(nometextField.getText());
				professor.setCpf(cpftextField.getText());
				professor.setRg(rgtextField.getText());
				professor.setCtps(ctpstextField.getText());
				professor.setEndereco(enderecotextField.getText());
				professor.setData_nasc(datanascimentotextField.getText());
				if (masculinordbtn.isSelected()) {
					professor.setSexo('M');
				}
				
				if (femininordbtn.isSelected()) {
					professor.setSexo('F');
				}
				professor.setFone(celulartextField.getText());
				professor.setEmail(emailtextField.getText());
				professor.setTipo_sanguineo((String) tipoSanguineocomboBox.getSelectedItem());
				professor.setEstado_civil((String) estadoCivilcomboBox.getSelectedItem());
				if (deficSimradioButton.isSelected()) {
					professor.setDefic(true); 
					professor.setTipo_defic(deficienciatextField.getText());
				}
				
				if (deficNaoradioButton.isSelected()) {
					professor.setDefic(false);
				}
				
				String[] arrayDisciplinas = disciplinatextField.getText().split(", ");
				Set<String> conjuntoDisciplinas = new HashSet<String>(Arrays.asList(arrayDisciplinas));
				professor.setDisciplinas((HashSet<String>) conjuntoDisciplinas);
				
				try {
					ControladorCadastroProfessor controladorCadastroProfessor = new ControladorCadastroProfessor();
					controladorCadastroProfessor.atualizarProfessor(professor);
					Main.getFrame().setContentPane(new editar_professor1());;
					Main.getFrame().getContentPane().revalidate();
				} catch (ProfessorInvalidoException excecao) {
					// TODO Auto-generated catch block
					excecao.printStackTrace();
			}
			}
		});
	
		add(button_2, "cell 0 13,alignx right");

		}
	}
