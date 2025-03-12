import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Professor> lista;

    public FolhaPagamento() {
        lista = new ArrayList<>();
    }

    public ArrayList<Professor> getLista() {
        return lista;
    }
    
    public void contratarProfessor(Professor objeto){
        lista.add(objeto);
    }
    
    public void contratarProfessor(String nome, int qtdAulas){
        lista.add( new Professor(nome, qtdAulas));
    }
    
    public void demitirProfessor(int i){
        lista.remove(i);
    }
    
    public double calcularSalarioTotal (){
        double total = 0;
        
        for (Professor objeto : lista){
            total = total + objeto.getSalario();
        }
        return total;
    }
}
