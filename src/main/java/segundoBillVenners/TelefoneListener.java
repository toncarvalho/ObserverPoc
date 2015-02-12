package segundoBillVenners;

import java.util.EventListener;

/**
 * Created by ton on 9/23/14.
 */
public interface TelefoneListener extends EventListener {

    void telefoneTocou(TelefoneEvent e);

    void telefoneAtendido(TelefoneEvent e);
}
