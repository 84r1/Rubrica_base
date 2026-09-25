public class Rubrica {
    public Contatto[] contattiRubrica;
    public Rubrica(int lunghezza){
        contattiRubrica = new Contatto[lunghezza];
    }
    public void creaContatto(String Nome,String Cognome,String Numero,String Etichetta){
        this.contattiRubrica[1] = new Contatto(Nome, Cognome, Numero, Etichetta);
        for (int i = 0; i <= contattiRubrica.length; i++){
            if (contattiRubrica[i] == null){

            }
            System.out.println(contattiRubrica[i]);
        }
    }

}
