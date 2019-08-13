package your_school.apresentacao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import your_school.Main;
import your_school.dados.Repositorio;
import your_school.entidades.Turma;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class presenca_alunos1 extends JPanel {
	private JTextField codigotextField;
	private JTextField datatextField;
	private static String dataPresenca;
	private static Turma turma;

	/**
	 * Create the panel.
	 */
	public presenca_alunos1() {
		setLayout(new MigLayout("", "[][][][111.00][109.00]", "[][][][][][]"));
		
		JLabel label = new JLabel("Presença:");
		add(label, "cell 0 0");
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getFrame().setContentPane(new submenu_alunos());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		add(button, "cell 4 0,alignx right");
		
		JButton button_1 = new JButton("Enviar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigoTurma = codigotextField.getText();
				dataPresenca = datatextField.getText();
				
				for (Turma turmaCadastrada:  Repositorio.getInstancia().obterTodasTurmas()) {
					if(turmaCadastrada.getCodigo().equals(codigoTurma)) {
						turma = turmaCadastrada;
						Main.getFrame().setContentPane(new presenca_alunos2());
						Main.getFrame().getContentPane().revalidate();
					}
				}
			}
		});
		
		JLabel label_1 = new JLabel("Insira o código da turma:");
		add(label_1, "cell 1 3,alignx trailing");
		
		codigotextField = new JTextField();
		codigotextField.setColumns(10);
		add(codigotextField, "cell 2 3 2 1,growx");
		
		JLabel label_2 = new JLabel("Insira a data:");
		add(label_2, "cell 1 4");
		
		datatextField = new JTextField();
		datatextField.setColumns(10);
		add(datatextField, "cell 2 4 2 1,growx");
		add(button_1, "cell 3 5,alignx right");

	}

	public static Turma getTurma() {
		return turma;
	}

	public static String getDataPresenca() {
		return dataPresenca;
	}

}
