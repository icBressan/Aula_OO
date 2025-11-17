package FactoryMethod;

//sabe como criar um QuartoSimples
public class FabricaQuartoSimples implements FabricaQuarto{

    //Toda vez que alguém chama criarQuarto()
    //ela retorna um QuartoSimples.
    @Override
    public Quarto criarQuarto() {
        return new QuartoSimples();
    }
    
}
