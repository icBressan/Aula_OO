package FactoryMethod;

//sabe como criar um QuartoLuxo
public class FabricaQuartoLuxo implements FabricaQuarto{

    @Override
    public Quarto criarQuarto() {
        return new QuartoLuxo();
    }
    
}
