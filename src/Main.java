import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Numeri massimi rubrica: ");
    Rubrica rubrica = new Rubrica(sc.nextInt());
    rubrica.creaContatto(sc.next(),sc.next(),sc.next(),sc.next());


}
