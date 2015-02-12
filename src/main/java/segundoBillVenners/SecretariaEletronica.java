package segundoBillVenners;

/**
 * Created by ton on 9/23/14.
 */
public class SecretariaEletronica implements TelefoneListener {
    @Override
    public void telefoneTocou(final TelefoneEvent e) {
        System.out.println(" secretária percebe que o telefone esta tocando!!!");
    }

    @Override
    public void telefoneAtendido(final TelefoneEvent e) {
        System.out.println("  secretária percebe que Telefone atendido!!!");
    }
}
