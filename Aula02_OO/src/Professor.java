public class Professor {
    private String nome;
    private int quantidadeAulas;
    private double salario;

    public Professor() {
        nome="";
        quantidadeAulas=0;
        salario=0;
    }
    
    public Professor(String nome, int quantidadeAulas){
        this.nome = nome;
        this.quantidadeAulas = quantidadeAulas;
        this.salario = 0; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public void setQuantidadeAulas(int quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularSalario(){
        salario = quantidadeAulas * 4.5 * 40;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + "\nAulas = " + quantidadeAulas + 
                      "\nSalário = " + salario;
    }
    
}
