
package constructor;

/**
 * Esta clase inicializa una TV
 * @author RubenHH/FerMS
 * @version 1.0
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Television Violeta=new Television(20,4) {
            @Override
            public void transmitir() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void apagar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void prender() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Violeta.prender();
        Violeta.transmitir();
        Violeta.apagar();
    }
    
}
