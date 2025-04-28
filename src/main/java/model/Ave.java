
package model;

public class Ave implements Animal{
    
    private String nome;

    public Ave() {
    }

    public Ave(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void produzirSom() {
        System.out.print("Cantar");
    }
    
    @Override
    public void mover() {
        System.out.print("Voar");
    }
}
