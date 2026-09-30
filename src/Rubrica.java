public class Rubrica {
    public Contatto[] contattiRubrica;
    public Rubrica(int lunghezza){
        contattiRubrica = new Contatto[lunghezza];
    }
    public boolean creaContatto(String Nome,String Cognome,String[] Numero,String[] Etichetta){
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

    public void cercaContatto (String datrovare, int scelta){
            boolean trovato = false;

            for (int i = 0; i < contattiRubrica.length; i++) {
                if (scelta == 1 && datrovare.equalsIgnoreCase(contattiRubrica[i].nome)) {
                    System.out.println(contattiRubrica[i] + " " + contattiRubrica[i] + " " + contattiRubrica[i]);
                    trovato = true;
                } else if (scelta == 2 && datrovare.equalsIgnoreCase(contattiRubrica[i].cognnome())) {
                    System.out.println(contattiRubrica[i] + " " + contattiRubrica[i] + " " + contattiRubrica[i]);
                    trovato = true;
                } else if (scelta == 3 && datrovare.equals(contattiRubrica[i].numeroE)) {
                    System.out.println(contattiRubrica[i] + " " + contattiRubrica[i] + " " + contattiRubrica[i]);
                    trovato = true;
                }
            }
            if (!trovato) {
                System.out.println("Nessun contatto trovato.");
            }
    }

}
