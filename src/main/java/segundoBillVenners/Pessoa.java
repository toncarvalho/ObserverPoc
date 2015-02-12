package segundoBillVenners;

/**
 * Created by ton on 9/23/14.
 */
public class Pessoa {

    public void escutaTelefone(TelefoneSource t) {
        t.addTelefoneListener(
                new TelefoneAdapter() {
                    public void telefoneTocou(TelefoneEvent e) {
                        System.out.println("Eu pego!");
                        ((TelefoneSource) (e.getSource())).atendeFone();
                    }
                }
        );
    }
}
