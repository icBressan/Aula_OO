public class Medicos {
    private String nome;
    private double valorCons;
    private int qtdeCons;
    private double salario;
    
    public Medicos(){
        nome="";
        valorCons=0;
        qtdeCons=0;
        salario=0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCons() {
        return valorCons;
    }

    public void setValorCons(double valorCons) {
        this.valorCons = valorCons;
    }

    public int getQtdeCons() {
        return qtdeCons;
    }

    public void setQtdeCons(int qtdeCons) {
        this.qtdeCons = qtdeCons;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void calcularSalario() {
        salario = qtdeCons * valorCons;
    }
    
}
