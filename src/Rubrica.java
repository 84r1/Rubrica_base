public class Rubrica {
    public Contatto[] contattiRubrica;
    public Rubrica(int lunghezza){
        contattiRubrica = new Contatto[lunghezza];
    }
    public boolean creaContatto(String Nome,String Cognome,String Numero,String Etichetta){
        for (int i = 0; i <= contattiRubrica.length; i++){
            if (i >= contattiRubrica.length){
                return false;
            }
            if (contattiRubrica[i] == null){
                this.contattiRubrica[i] = new Contatto(Nome, Cognome, Numero, Etichetta);
                return true;
            }
            System.out.println(contattiRubrica[i]);
        }
        return false;
    }

}
