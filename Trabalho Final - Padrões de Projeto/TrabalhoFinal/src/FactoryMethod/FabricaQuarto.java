package FactoryMethod;

public interface FabricaQuarto {
//Define um contrato:
//quem implementar essa interface precisa saber criar e retornar um objeto do tipo Quarto
    Quarto criarQuarto();
}
