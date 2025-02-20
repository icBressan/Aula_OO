public class Funcionarios {
    private String nome;
    private double salarioBruto;
    private double vINSS;
    private double salario;
    
    public Funcionarios () {
        nome = "";
        salarioBruto=0;
        vINSS=0;
        salario=0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getvINSS() {
        return vINSS;
    }

    public void setvINSS(double vINSS) {
        this.vINSS = vINSS;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calcularSalario() {
        vINSS = salarioBruto * 0.08; 
        salario = salarioBruto - vINSS;
}
}
