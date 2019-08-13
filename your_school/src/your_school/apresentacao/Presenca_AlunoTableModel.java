package your_school.apresentacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import your_school.entidades.Aluno;

public class Presenca_AlunoTableModel extends AbstractTableModel {

    private List<Aluno> linhas;
    private String data=presenca_alunos1.getDataPresenca();
    private String[] colunas = {"Aluno","Faltas"};
    

    public Presenca_AlunoTableModel() {
        linhas = new ArrayList<Aluno>();
    }

    public Presenca_AlunoTableModel(List<Aluno> alunos) {
        this.linhas = alunos; 
    }
 
    public String getColumnName(int column) {
        return colunas[column];
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public int getRowCount() {
        return linhas.size();
    }
    
    public boolean isCellEditable(int linha, int coluna) {
    	switch (coluna) {
    	case 0:
    		return false;
    	case 1:
    		return true;
    	}
        return false;
    }
    
    public void setValueAt(Object faltas, int linha, int coluna) {
        Aluno aluno = linhas.get(linha);
     
        switch (coluna) {
        case 1:
            aluno.setFalta(data, Integer.parseInt((String) faltas));
            break;
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(linha, coluna); // Notifica a atualização da célula
    }

    public Object getValueAt(int linha, int coluna) {        
        Aluno aluno = linhas.get(linha);         
        switch (coluna) {
            case 0:
                return aluno.getNome();
            case 1:
            	return aluno.getData_faltas().get(data);
        }        
        return null;        
    }


    
}
