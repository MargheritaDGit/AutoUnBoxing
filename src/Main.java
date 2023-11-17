
/*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
 Scrivere una funzione che accetti in input 1 char lo stampi
 Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
 Scrivere una funzione che accetti in input 1 Character lo stampi

 Scrivere un un valore primitivo per int, double e char e fare autoboxing
 Scrivere un oggetto per Integer, Double e Character e fare Unboxing
 Usare le funzioni scritte con i valori creati*/

public class Main {

    public static void main(String[] args) {

        Integer unbox = 89; //manuale a boxing


        int risultato1 = printSum(40, 50);
        System.out.println(risultato1);

        Integer resAutobox1 = risultato1; //reaAutobox è variabile di tipo Integer


        char risultato2 = printChar('Q');
        System.out.println(risultato2);
        Character resAutobox2 = risultato2;


        Integer risultato3 = printSumInteger(7, 8);
        System.out.println(risultato3);
        int resUnbox3 = risultato3;


        Character risultato4 = printCharacter('H');
        System.out.println(risultato4);
        char resUnbox4 = risultato4;


        double risultato5 = 3.4;
        Double resAutobox5 = risultato5;
        double resUnbox5 = resAutobox5;


    }

    public static Integer printSum(int a, int b) {
        return a + b;
    }

    public static char printChar(char c) {
        return c;
    }

    public static int printSumInteger(Integer x, Integer y) { //unboxing di integer e torna primitivo
        return x + y;
    }

    public static Character printCharacter(Character ch) {
        return ch;
    }
}


