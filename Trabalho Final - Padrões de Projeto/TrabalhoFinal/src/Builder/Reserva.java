package Builder;

import AbstractFactory.Servico;
import FactoryMethod.Quarto;
import java.util.ArrayList;
import java.util.List;

//armazena os dados de uma reserva do hotel.
//Implementa clonagem manual (Prototype) pelo método clonar().
public class Reserva {
    private String nomeHospede;
    private String dataEntrada;
    private String dataSaida;
    private int numeroHospedes;
    private Quarto quarto; // referência ao tipo de quarto (Simples/Luxo)
    private List<Servico> servicos;   // lista de serviços do pacote

    //Cria uma reserva em branco
    //com a lista de serviços inicializada vazia.
    public Reserva() {
        this.servicos = new ArrayList<>();
    }
    
    //Permite criar uma reserva pronta de uma vez
    public Reserva(String nomeHospede, String dataEntrada, String dataSaida, 
            int numeroHospedes, Quarto quarto, List<Servico> servicos){
        this.nomeHospede = nomeHospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.numeroHospedes = numeroHospedes;
        this.quarto = quarto;
        // copia da lista para evitar referência externa
        this.servicos = (servicos == null) ? new ArrayList<>() : new ArrayList<>(servicos);
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getNumeroHospedes() {
        return numeroHospedes;
    }

    public void setNumeroHospedes(int numeroHospedes) {
        this.numeroHospedes = numeroHospedes;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
    
    
    //Cria uma string com os nomes dos serviços separados por vírgula
    public String getDescricaoServicos() {
        StringBuilder sb = new StringBuilder();
        for (Servico s : servicos) {
            if (sb.length() > 0) sb.append(", ");
             sb.append(s.getNome()).append(" (R$ ").append(s.getPreco()).append(")");
        }
        return sb.toString();
    }
    
    
    //Método Prototype: clona a reserva, agilizand na criação de reservas semelhantes
    //Faz cópia dos campos e cria nova lista de serviços.
    public Reserva clonar() {
        List<Servico> copiaServicos = new ArrayList<>(this.servicos);
        return new Reserva(this.nomeHospede, this.dataEntrada, this.dataSaida,
                this.numeroHospedes, this.quarto, copiaServicos);
    }

}
