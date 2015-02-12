package segundoBillVenners;

import java.util.EventObject;

/**
 * Created by ton on 9/23/14.
 */
public class TelefoneEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     *
     * @throws IllegalArgumentException if source is null.
     */
    public TelefoneEvent(final Object source) {
        super(source);
    }
}
