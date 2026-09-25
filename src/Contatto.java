/*
contatto:
- nome
- cognome
- NumeroEtichettato (numero telefono + eticehtta)
 */

public class Contatto {
    private String nome;
    private String cognnome;
    private NumeroEtichettato numeroE;

    public Contatto (String Nome,String Cognome,String Numero,String Etichetta){
        nome = Nome;
        cognnome = Cognome;
        numeroE = new NumeroEtichettato(Numero, Etichetta);
    }

    public String getNome() {
        return nome;
    }

    public String getCongnome() {
        return cognnome;
    }
    public String getNumero() {
        return numeroE.getNumero();
    }
    public String getEtichetta() {
        return numeroE.getEtichetta();
    }


}
