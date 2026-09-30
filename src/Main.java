import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int scelta;
    String datrovare;
    System.out.print("Numeri massimi rubrica: ");
    Rubrica rubrica = new Rubrica(sc.nextInt());
    do {
        System.out.println("1. Aggiungi contatto \n2. Cerca contatto \n3. Elimina");
        System.out.print("Scegli: ");
        scelta = sc.nextInt();

        switch (scelta){
            case 1:
                System.out.print("Inserisci nome: ");
                String nome = sc.next();
                System.out.print("Inserisci cognome: ");
                String cognome = sc.next();
                System.out.println("Quanti numeri vuoi inserire?");
                scelta=sc.nextInt();
                String[] numeri= new String[scelta];
                String[] etichette= new String[scelta];
                for (int i = 0; i < scelta; i++){
                    System.out.print("Inserisci numero: ");
                    numeri[i] = sc.next();
                    System.out.println("Scegli l'etichetta: \n1. casa \n2. lavoro");
                    int ne; //numero per scegliere etichetta
                    ne=sc.nextInt();
                    if (ne==1){
                        etichette[i] = "casa";
                    } else if (ne==2) {
                        etichette[i] = "lavoro";
                    }
                }

                rubrica.creaContatto(nome, cognome, numeri, etichette);

                break;

            case 2:
                System.out.println("Con cosa vuoi cercarlo?  1. Nome  2. Cognome  3. Telefono");
                scelta = sc.nextInt();
                System.out.print("Inserisci il valore da cercare: ");
                datrovare = sc.next();
                rubrica.cercaContatto(datrovare, scelta);
                break;

            case 3:

                break;

            default:
                break;

        }
    }while(scelta != 0);

}

