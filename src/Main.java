
/*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
 Scrivere una funzione che accetti in input 1 char lo stampi
 Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
 Scrivere una funzione che accetti in input 1 Character lo stampi
 Scrivere un un valore primitivo per int, double e char e fare autoboxing
 Scrivere un oggetto per Integer, Double e Character e fare Unboxing
 Usare le funzioni scritte con i valori creati*/

public class Main {

    public static void main(String[] args) {
        printSum(4, 10);

        printChar('P');

        printSumInteger(16, 29);

        printCharacter('S');

        int intValue = 56;
        double doubleValue = 3.14;
        char charValue = 'W';

        Integer integerValue = intValue;
        Double doubleWrapper = doubleValue;
        Character charWrapper = charValue;

        printSum(integerValue, 20);
        printChar(charWrapper);
        printSumInteger(5, integerValue);
        printCharacter(charWrapper);

        Integer objInteger = new Integer(38);
        Double objDouble = new Double(7.3);
        Character objCharacter = new Character('L');

        int unboxedInt = objInteger;
        double unboxedDouble = objDouble;
        char unboxedChar = objCharacter;

        printSum(unboxedInt, 7);
        printChar(unboxedChar);
        printSumInteger(13, objInteger);
        printCharacter(unboxedChar);
    }
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    public static void printChar(char c) {
        System.out.println("Character: " + c);
    }
    public static void printSumInteger(Integer x, Integer y) {
        System.out.println("Sum Integer: " + (x + y));
    }
    public static void printCharacter(Character ch) {
        System.out.println("Character: " + ch);
    }
}


