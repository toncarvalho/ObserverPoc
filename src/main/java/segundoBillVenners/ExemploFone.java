package segundoBillVenners;

/**
 * Não vamos seguir a apresentação do livro GoF aqui, pois há críticas sobre a solução dada Falaremos das críticas à frente Seguiremos a
 * apresentação dada por Bill Venners em http://www.javaworld.com/topicalindex/jw-ti-techniques.html (The 'event generator' idiom) Em
 * particular, apresentaremos como este padrão é implementado em Java Portanto, além de um Design Pattern (que não depende de linguagem),
 * apresentaremos um "Idioma Java" que mostra como implementar um Design Pattern numa linguagem particular
 * <p/>
 * artigo que demonstra o padrão em detalhes http://www.artima.com/designtechniques/eventgen.html
 * http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/arqu/observer.htm
 */
public class ExemploFone {
    public static void main(String[] args) {
        TelefoneSource foneSource = new TelefoneSource();

        Pessoa fulano = new Pessoa();

        SecretariaEletronica secretariaEletronica = new SecretariaEletronica();

        foneSource.addTelefoneListener(secretariaEletronica);

        fulano.escutaTelefone(foneSource);

        foneSource.tocaFone();
    }
}
