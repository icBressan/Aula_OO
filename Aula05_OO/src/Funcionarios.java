public class Funcionarios {
    private int matricula;
    private String nome;

    public Funcionarios(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Funcionarios() {
        this.matricula = 0; 
        this.nome = ""; 
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override // sobrescreve o to String
    public String toString() {
        return "Funcionario";
    }
    
    public double calcularSalario(){
        return 2000.00;
    }
}


