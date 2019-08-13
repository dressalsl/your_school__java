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

public class cadastro_professores extends JPanel {
	private JTextField nometextField;
	private JTextField cpftextField;
	private JTextField rgtextField;
	private JTextField ctpstextField;
	private JTextField enderecotextField;
	private JTextField datanascimentotextField;
	private JTextField fonetextField;
	private JTextField naturalidadetextField;
	private JTextField emailtextField;
	private JTextField tipoDefictextField;
	private JTextField disciplinatextField;
	private JComboBox estadoCivilcomboBox;
	private JComboBox tipoSanguineocomboBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public cadastro_professores() {
		setLayout(new MigLayout("", "[440.00]", "[][][][][][][][][][][][][][]"));
		
		JLabel label = new JLabel("Cadastro de Professores");
		add(label, "flowx,cell 0 0,growx");
		
		JLabel label_1 = new JLabel("Nome:");
		add(label_1, "flowx,cell 0 2");
		
		nometextField = new JTextField();
		nometextField.setColumns(10);
		add(nometextField, "cell 0 2,growx");
		
		JLabel label_2 = new JLabel("CPF:");
		add(label_2, "flowx,cell 0 3");
		
		cpftextField = new JTextField();
		cpftextField.setColumns(10);
		add(cpftextField, "cell 0 3,growx");
		
		JLabel label_3 = new JLabel("RG:");
		add(label_3, "cell 0 3");
		
		rgtextField = new JTextField();
		rgtextField.setColumns(10);
		add(rgtextField, "cell 0 3,growx");
		
		JLabel label_4 = new JLabel("CTPS:");
		add(label_4, "flowx,cell 0 4");
		
		ctpstextField = new JTextField();
		ctpstextField.setColumns(10);
		add(ctpstextField, "cell 0 4,growx");
		
		JLabel label_5 = new JLabel("Endereço:");
		add(label_5, "flowx,cell 0 5");
		
		enderecotextField = new JTextField();
		enderecotextField.setColumns(10);
		add(enderecotextField, "cell 0 5,growx");
		
		JLabel label_9 = new JLabel("Naturalidade:");
		add(label_9, "flowx,cell 0 6");
		
		naturalidadetextField = new JTextField();
		naturalidadetextField.setColumns(10);
		add(naturalidadetextField, "cell 0 6");
		
		JLabel label_6 = new JLabel("Data de Nascimento:");
		add(label_6, "cell 0 6");
		
		JLabel label_7 = new JLabel("Sexo:");
		add(label_7, "flowx,cell 0 7");
		
		JRadioButton masculinoRadioButton = new JRadioButton("M");
		buttonGroup.add(masculinoRadioButton);
		add(masculinoRadioButton, "cell 0 7");
		
		JRadioButton femininoRadioButton = new JRadioButton("F");
		buttonGroup.add(femininoRadioButton);
		add(femininoRadioButton, "cell 0 7");
		
		JLabel label_8 = new JLabel("Celular:");
		add(label_8, "cell 0 7");
		
		fonetextField = new JTextField();
		fonetextField.setColumns(10);
		add(fonetextField, "cell 0 7,growx");
		
		JLabel label_10 = new JLabel("E-mail:");
		add(label_10, "flowx,cell 0 8");
		
		emailtextField = new JTextField();
		emailtextField.setColumns(10);
		add(emailtextField, "cell 0 8,growx");
		
		JLabel label_11 = new JLabel("Tipo Sanguíneo:");
		add(label_11, "flowx,cell 0 9");
		
		tipoSanguineocomboBox = new JComboBox();
		tipoSanguineocomboBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		add(tipoSanguineocomboBox, "cell 0 9");
		
		JLabel label_12 = new JLabel("Estado Civil:");
		add(label_12, "cell 0 9");
		
		estadoCivilcomboBox = new JComboBox();
		estadoCivilcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)"}));
		add(estadoCivilcomboBox, "cell 0 9");
		
		JLabel label_13 = new JLabel("Deficiência:");
		add(label_13, "flowx,cell 0 10");
		
		JRadioButton deficSimradioButton = new JRadioButton("Sim");
		buttonGroup_1.add(deficSimradioButton);
		add(deficSimradioButton, "cell 0 10");
		
		JRadioButton deficNaoradioButton = new JRadioButton("Não");
		buttonGroup_1.add(deficNaoradioButton);
		add(deficNaoradioButton, "cell 0 10");
		
		tipoDefictextField = new JTextField();
		tipoDefictextField.setColumns(10);
		add(tipoDefictextField, "cell 0 10,growx");
		
		JLabel label_14 = new JLabel("Disciplina:");
		add(label_14, "flowx,cell 0 11");
		
		disciplinatextField = new JTextField();
		disciplinatextField.setColumns(10);
		add(disciplinatextField, "cell 0 11");
		
		JButton button = new JButton("Enviar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Professor professor = new Professor();
				
				professor.setNome(nometextField.getText());
				professor.setCpf(cpftextField.getText());
				professor.setRg(rgtextField.getText());
				professor.setCtps(ctpstextField.getText());
				professor.setEndereco(enderecotextField.getText());
				professor.setData_nasc(datanascimentotextField.getText());
				
				professor.setFone(fonetextField.getText());
				professor.setNaturalidade (naturalidadetextField.getText());
				professor.setEmail(emailtextField.getText());
				professor.setTipo_sanguineo((String) tipoSanguineocomboBox.getSelectedItem());
				
				if (deficSimradioButton.isSelected()) {
					professor.setDefic(true);
					professor.setTipo_defic(tipoDefictextField.getText());
				}
				if (deficNaoradioButton.isSelected()){
					professor.setDefic(false);
				}

				professor.setEstado_civil((String) estadoCivilcomboBox.getSelectedItem()); 
				
				String[] arrayDisciplinas = disciplinatextField.getText().split(", ");
				Set<String> conjuntoDisciplinas = new HashSet<String>(Arrays.asList(arrayDisciplinas));
				professor.setDisciplinas((HashSet<String>) conjuntoDisciplinas);
		
				try {
					ControladorCadastroProfessor controladorCadastroProfessor = new ControladorCadastroProfessor();
					controladorCadastroProfessor.cadastrarProfessor(professor);
					Main.getFrame().setContentPane(new submenu_professores());
					Main.getFrame().getContentPane().revalidate();
				} catch (ProfessorInvalidoException excecao){
					excecao.printStackTrace();
				}
			
			}
				
		}

			
		);
		add(button, "cell 0 13,alignx right");
		
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
		


	}

}
