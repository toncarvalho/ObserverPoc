package segundoGOF_JavaUtils;

import java.util.Observable;

/**
 A definição formal do Padrão Observer é: “O Padrão Observer define uma dependência um-para-muitos entre os objetos de modo que quando um
 * objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente”.
 * <p/>
 * Leia mais em: Padrão de Projeto Observer em Java http://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163#ixzz3E8lCooaL
 */
public class RevistaInformatica extends Observable {

    private int edicao;

    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;
        setChanged();
        notifyObservers();
    }

    public int getEdicao() {
        return this.edicao;
    }

    public static void main(String[] args) {
        int nrNovaEdicao = 3;
        RevistaInformatica revista = new RevistaInformatica();

        Assinante a1 = new Assinante(revista);
        Assinante a2 = new Assinante(revista);
        Assinante a3 = new Assinante(revista);
        Assinante a4 = new Assinante(revista);
        Assinante a5 = new Assinante(revista);

        revista.setNovaEdicao(nrNovaEdicao);

        revista.setNovaEdicao(12);

        revista.setNovaEdicao(555);
    }
}
