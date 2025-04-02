public class Professores extends Funcionarios {
    private int quantidadeAulas;
    private double valorHoraAula;

    public Professores() {
        quantidadeAulas = 0;
        valorHoraAula = 30.0; 
    }
    
    public Professores(int quantidadeAulas, double valorHoraAula, int matricula, String nome) {
        super(matricula, nome);
        this.quantidadeAulas = quantidadeAulas;
        this.valorHoraAula = valorHoraAula;
    }

    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public void setQuantidadeAulas(int quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override //sobrescreve o metodo
    public double calcularSalario() {
        return quantidadeAulas * valorHoraAula * 4.5;
    }

    @Override
    public String toString() {
        return "Professor";
    }
    
}
