package segundoGOF_JavaUtils;

import java.util.Observable;
import java.util.Observer;

public class Assinante implements Observer {

    private Observable revistaInformatica;
    private int edicaoNovaRevista;

    public Assinante(final Observable revistaInformatica) {
        this.revistaInformatica = revistaInformatica;
        this.revistaInformatica.addObserver(this);
    }

    @Override
    public void update(final Observable o, final Object arg) {

        if (o instanceof RevistaInformatica) {
            RevistaInformatica revistaInformatica = (RevistaInformatica) o;
            edicaoNovaRevista = revistaInformatica.getEdicao();
            System.out.println(
                    "Atenção, já chegou a mais uma edição da Revista Informatica. " + "Esta é a sua edição número: " + edicaoNovaRevista
                    + " Assinante: " + this);
        }
    }
}
