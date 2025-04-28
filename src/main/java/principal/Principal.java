
package principal;

import model.Ave;
import model.Cachorro;       

public class Principal {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Tob");
        Ave ave = new Ave("cu");
        
        System.out.print("Teste do Cachorro: ");
        cachorro.produzirSom();
        cachorro.mover();
        
        System.out.print("\nTeste da Ave: ");
        ave.produzirSom();
        ave.mover();
    }
    
}
