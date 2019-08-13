package your_school.apresentacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import your_school.entidades.Aluno;

public class Nota_AlunoTableModel extends AbstractTableModel {

    private Aluno aluno;
    private List<String> linhas;
    private String[] colunas = {"Disciplina", "Nota 1", "Nota 2", "Media - 1 UN", "Nota 3", "Nota 4", 
    							"Media - 2 UN", "Final", "Media Geral"};

    public Nota_AlunoTableModel() {
        linhas = new ArrayList<String>();
    }

    public Nota_AlunoTableModel(Aluno aluno) {
        this.linhas = aluno.getListaDisciplinas(); 
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
    	case 2:
    		return true;
    	case 3:
    		return false;
    	case 4:
    		return true;
    	case 5:
    		return true;
    	case 6:
    		return false;
    	case 7:
    		return true;
    	case 8:
    		return false;
    	}
        return false;
    }
    
    public void setValueAt(Object nota, int linha, int coluna) {
        String disciplina = linhas.get(linha);
     
        switch (coluna) {
        case 1:
            aluno.setNota(disciplina, 0, Double.parseDouble((String) nota));
            break;
        case 2:
            aluno.setNota(disciplina, 1, Double.parseDouble((String) nota));
            break;      
        case 4:
            aluno.setNota(disciplina, 3, Double.parseDouble((String) nota));
            break;
        case 5:
            aluno.setNota(disciplina, 4, Double.parseDouble((String) nota));
            break;
        case 7:
            aluno.setNota(disciplina, 6, Double.parseDouble((String) nota));
            break;      
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(linha, coluna); // Notifica a atualização da célula
    }

    public Object getValueAt(int linha, int coluna) {        
        String disciplina = linhas.get(linha);
        switch (coluna) {
            case 0:
                return disciplina;
            case 1:
            	return aluno.getNota_disciplina().get(disciplina).get(1);
            case 2:
            	return aluno.getNota_disciplina().get(disciplina).get(2);
            case 3:
            	double n1=(double) this.getValueAt(linha, 1);
            	double n2=(double) this.getValueAt(linha, 2);
            	double media1=(n1+n2)/2;
                aluno.setNota(disciplina, 3, media1);
            	return aluno.getNota_disciplina().get(disciplina).get(3);
            case 4:
            	return aluno.getNota_disciplina().get(disciplina).get(4);
            case 5:
            	return aluno.getNota_disciplina().get(disciplina).get(5);
            case 6:
            	double n3=(double) this.getValueAt(linha, 4);
            	double n4=(double) this.getValueAt(linha, 5);
            	double media2=(n3+n4)/2;
                aluno.setNota(disciplina, 6, media2);
            	return aluno.getNota_disciplina().get(disciplina).get(6);
            case 7:
            	return aluno.getNota_disciplina().get(disciplina).get(7);
            case 8:
            	double N1=(double) this.getValueAt(linha, 1);
            	double N2=(double) this.getValueAt(linha, 2);
            	double Media1=(N1+N2)/2;
            	double N3=(double) this.getValueAt(linha, 4);
            	double N4=(double) this.getValueAt(linha, 5);
            	double Media2=(N3+N4)/2;
            	double Final=(double) this.getValueAt(linha, 7);
            	
            	double mediaF=(((Media1+Media2)/2)+Final)/2;
            	
                aluno.setNota(disciplina, 8, mediaF);
            	return aluno.getNota_disciplina().get(disciplina).get(8);
        }        
        return null;        
    }


    
}
