public class NumeroEtichettato {
    public String Numero;
    public String Etichetta;

    public NumeroEtichettato(String numero, String etichetta) {
        Numero = numero;
        Etichetta = etichetta;
    }

    public String getEtichetta() {
        return Etichetta;
    }

    public String getNumero() {
        return Numero;
    }
}
