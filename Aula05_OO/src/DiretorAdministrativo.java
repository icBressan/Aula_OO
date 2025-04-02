public class DiretorAdministrativo extends Funcionarios {
    
    public DiretorAdministrativo(){
    }

    public DiretorAdministrativo(int matricula, String nome) {
        super(matricula, nome);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.5;
    }

    @Override
    public String toString() {
        return "Diretor Administrativo";
    }
 
}
