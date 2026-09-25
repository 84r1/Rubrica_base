import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int scelta;
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
                System.out.print("Inserisci numero: ");
                String numero = sc.next();
                System.out.print("Inserisci etichetta: ");
                String etichetta = sc.next();

                rubrica.creaContatto(nome, cognome, numero, etichetta);
        }
    }while(scelta != 0);

}
