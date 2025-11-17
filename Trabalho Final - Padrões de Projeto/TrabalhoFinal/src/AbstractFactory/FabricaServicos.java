package AbstractFactory;

import java.util.List;

//Define o contrato para as fábricas de pacotes de serviço.
public interface FabricaServicos {
    //Toda classe que implementar essa interface precisa ter o método:
    List<Servico> criarServicos();
    //cria e retorna uma lista de serviços (como café da manhã e limpeza).
}
