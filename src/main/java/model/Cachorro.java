
package model;

public class Cachorro implements Animal{
    
    private String nome;

    public Cachorro() {
    }

    public Cachorro(String nome) {
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
        System.out.print("Latir");
    }
    
    @Override
    public void mover() {
        System.out.print("Andar");
    }
}
