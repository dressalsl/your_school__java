package your_school.apresentacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import your_school.entidades.Aluno;

public class Editar_TurmaTableModel extends AbstractTableModel {

    private List<Aluno> linhas;
    private String[] colunas = {"Codigo","Nome"};    

    public Editar_TurmaTableModel() {
        linhas = new ArrayList<Aluno>();
    }

    public Editar_TurmaTableModel(List<Aluno> alunos) {
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

    public Object getValueAt(int linha, int coluna) {        
        Aluno aluno = linhas.get(linha);         
        switch (coluna) {
            case 0:
                return aluno.getCpf();
            case 1:
                return aluno.getNome();    
        }        
        return null;        
    }
    
    public void deleteAluno(int row) {
        linhas.remove(row);
        this.fireTableRowsDeleted(row, row);
    }

    public void addAluno(Aluno aluno) {
        linhas.add(aluno);
        this.fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }
    
}
