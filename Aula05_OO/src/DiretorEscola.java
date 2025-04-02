public class DiretorEscola extends Professores{
    public DiretorEscola(){
        
    }

    public DiretorEscola(int quantidadeAulas, double valorHoraAula, int matricula, String nome) {
        super(quantidadeAulas, valorHoraAula, matricula, nome);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.5;
    }

    @Override
    public String toString() {
        return "Diretor de Escola";
    }
    
    
    
    
}
