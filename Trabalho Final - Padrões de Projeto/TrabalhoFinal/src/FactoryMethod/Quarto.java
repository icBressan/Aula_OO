package FactoryMethod;

//Classe abstrata que serve como modelo base para todos os quartos.
public abstract class Quarto {
    //Armazena:
    private String tipo; //se é "Simples", "Luxo", etc.
    private double precoBase; //valor da diária

    public Quarto(String tipo, double precoBase) {
        this.tipo = tipo;
        this.precoBase = precoBase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override //para exibir o tipo e o preco
    public String toString() {
        return  tipo + " (R$ " + precoBase + ")";
    }                          
    
}
