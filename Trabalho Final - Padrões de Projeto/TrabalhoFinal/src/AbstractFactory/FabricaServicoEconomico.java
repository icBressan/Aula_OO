package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

//implementação concreta da interface FabricaServicos
public class FabricaServicoEconomico implements FabricaServicos {

    @Override
    public List<Servico> criarServicos() {
        
        //Cada serviço é criado e adicionado numa List<Servico>
        List<Servico> servicos = new ArrayList<>();
        
        //a fábrica instancia objetos Servico e define seus atributos
        //cada pacote simples inclui:
        servicos.add(new Servico("Café da Manhã", 25.0));
        servicos.add(new Servico("Limpeza Básica", 20.0));
        
        return servicos; //retorna a list
    }
    
}
