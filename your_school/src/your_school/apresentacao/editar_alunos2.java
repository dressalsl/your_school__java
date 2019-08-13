package your_school.apresentacao;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.dados.Repositorio;
import your_school.entidades.Aluno;
import your_school.excecoes.AlunoInvalidoException;
import your_school.negocio.ControladorCadastroAlunos;

import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class editar_alunos2 extends JPanel {
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
	private JLabel label_11;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private Aluno alunoEditado;
	

	/**
	 * Create the panel.
	 */
	public editar_alunos2() {
		alunoEditado=editar_alunos1.getAlunoEditado();
		
		setLayout(new MigLayout("", "[440.00]", "[][][][][][][][][][][][][]"));
		
		JLabel label = new JLabel("Cadastro de Alunos");
		add(label, "flowx,cell 0 0,growx");
		
		JLabel lblNome = new JLabel("Nome:");
		add(lblNome, "flowx,cell 0 2");
		
		nometextField = new JTextField();
		nometextField.setColumns(10);
		nometextField.setText(alunoEditado.getNome());
		add(nometextField, "cell 0 2,growx");
		
		JLabel label_1 = new JLabel("Nome do Responsável: (Caso houver):");
		add(label_1, "flowx,cell 0 3");
		
		nomeResptextField = new JTextField();
		nomeResptextField.setColumns(10);
		nomeResptextField.setText(alunoEditado.getNome_responsavel());
		add(nomeResptextField, "cell 0 3,growx");
		
		JLabel label_2 = new JLabel("CPF:");
		add(label_2, "flowx,cell 0 4");
		
		cpftextField = new JTextField();
		cpftextField.setColumns(10);
		cpftextField.setText(alunoEditado.getCpf());
		add(cpftextField, "cell 0 4");
		
		JLabel label_3 = new JLabel("RG:");
		add(label_3, "cell 0 4");
		
		rgtextField = new JTextField();
		rgtextField.setColumns(10);
		rgtextField.setText(alunoEditado.getRg());
		add(rgtextField, "cell 0 4,growx");
		
		JLabel label_4 = new JLabel("Endereço:");
		add(label_4, "flowx,cell 0 5");
		
		enderecotextField = new JTextField();
		enderecotextField.setColumns(10);
		enderecotextField.setText(alunoEditado.getEndereco());
		add(enderecotextField, "cell 0 5,growx");
		
		JLabel label_8 = new JLabel("Naturalidade:");
		add(label_8, "flowx,cell 0 6");
		
		naturalidadetextField = new JTextField();
		naturalidadetextField.setColumns(10);
		naturalidadetextField.setText(alunoEditado.getNaturalidade());
		add(naturalidadetextField, "cell 0 6");
		
		JLabel label_5 = new JLabel("Data de Nascimento:");
		add(label_5, "cell 0 6");
		
		data_nasctextField = new JTextField();
		data_nasctextField.setColumns(10);
		data_nasctextField.setText(alunoEditado.getData_nasc());
		add(data_nasctextField, "cell 0 6,growx");
		
		JLabel label_6 = new JLabel("Sexo:");
		add(label_6, "flowx,cell 0 7");
		
		JRadioButton masculinoRadioButton = new JRadioButton("M");
		buttonGroup.add(masculinoRadioButton);
		add(masculinoRadioButton, "cell 0 7");
		
		JRadioButton femininoRadioButton = new JRadioButton("F");
		buttonGroup.add(femininoRadioButton);
		add(femininoRadioButton, "cell 0 7");
		
		if(alunoEditado.getSexo()=='M') {
			masculinoRadioButton.setSelected(true);
		} else {
			femininoRadioButton.setSelected(true);
		}
		
		JLabel label_7 = new JLabel("Celular:");
		add(label_7, "cell 0 7");
		
		fonetextField = new JTextField();
		fonetextField.setColumns(10);
		fonetextField.setText(alunoEditado.getFone());
		add(fonetextField, "cell 0 7,growx");
		
		JLabel label_9 = new JLabel("E-mail:");
		add(label_9, "flowx,cell 0 8");
		
		emailtextField = new JTextField();
		emailtextField.setColumns(10);
		emailtextField.setText(alunoEditado.getEmail());
		add(emailtextField, "cell 0 8,growx");
		
		JLabel label_10 = new JLabel("Tipo Sanguíneo:");
		add(label_10, "flowx,cell 0 9");
		
		JComboBox tipoSanguineocomboBox = new JComboBox();
		tipoSanguineocomboBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		tipoSanguineocomboBox.setSelectedItem(alunoEditado.getTipo_sanguineo());
		add(tipoSanguineocomboBox, "cell 0 9");
		
		label_11 = new JLabel("Estado Civil:");
		add(label_11, "cell 0 9");
		
		JComboBox estadoCivilcomboBox = new JComboBox();
		estadoCivilcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)"}));
		estadoCivilcomboBox.setSelectedItem(alunoEditado.getEstado_civil());
		add(estadoCivilcomboBox, "cell 0 9");
		
		
		JLabel label_12 = new JLabel("Deficiência:");
		add(label_12, "flowx,cell 0 10");
		
		JRadioButton deficSimradioButton = new JRadioButton("Sim");
		buttonGroup_1.add(deficSimradioButton);
		add(deficSimradioButton, "cell 0 10");
		
		JRadioButton deficNaoradioButton = new JRadioButton("Não");
		buttonGroup_1.add(deficNaoradioButton);
		add(deficNaoradioButton, "cell 0 10");
		
		if(alunoEditado.isDefic()) {
			deficSimradioButton.setSelected(true);
		} else {
			deficNaoradioButton.setSelected(true);
		}
		
		tipoDefictextField = new JTextField();
		tipoDefictextField.setColumns(10);
		tipoDefictextField.setText(alunoEditado.getTipo_defic());
		add(tipoDefictextField, "cell 0 10,growx");
		
		JLabel label_13 = new JLabel("Série:");
		add(label_13, "flowx,cell 0 11");
		
		serietextField = new JTextField();
		serietextField.setColumns(10);
		serietextField.setText(alunoEditado.getSerie());
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
		});
		
		JButton btnDeletarCadastro = new JButton("Deletar Cadastro");
		btnDeletarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControladorCadastroAlunos controladorCadastroAlunos = new ControladorCadastroAlunos();
				controladorCadastroAlunos.deletarAluno(alunoEditado);
				Main.getFrame().setContentPane(new editar_alunos1());;
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(btnDeletarCadastro, "flowx,cell 0 12,alignx right");
		add(button, "cell 0 12,alignx right");
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new editar_alunos1 ());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(btnNewButton, "cell 0 0,alignx right");
		


	}

}
