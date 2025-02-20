public class Pessoas { 
    private String nome;
    private String sexo;
    private int idade;  
    private int meses;  
    
    public Pessoas () {
        nome = "";
        sexo = "";
        idade = 0;
        meses = 0;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getIdade(){ 
        return this.idade;
    }

    public void setIdade(int idade){  
        this.idade = idade;
    }
    
    public int getMeses(){  
        return meses;
    }
    
    public void calcularIdadeMeses(){
        meses = idade * 12; 
    }
}
