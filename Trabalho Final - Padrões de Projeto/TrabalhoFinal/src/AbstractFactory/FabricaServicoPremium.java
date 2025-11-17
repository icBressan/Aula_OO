package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

//implementação concreta da interface FabricaServicos.
public class FabricaServicoPremium implements FabricaServicos {

    @Override
    public List<Servico> criarServicos() {
        
        //Cada serviço é criado e adicionado numa List<Servico>
        List<Servico> servicos = new ArrayList<>();
        
        //a fábrica instancia objetos Servico e define seus atributos
        //representa um pacote premium, que inclui:
        servicos.add(new Servico("Café da Manhã Gourmet", 50.0));
        servicos.add(new Servico("Limpeza Executiva", 30.0));
        
        return servicos; // retorna a list
    }
    
    
}
