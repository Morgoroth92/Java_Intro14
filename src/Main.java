public class Main {
    public static void main(String[] args) {
    isEven(5);
    isEven(6);
    }
    public static void isEven(int number) {
        boolean z = number % 2 == 0;
        System.out.println("Hai inserito " + number + " che è un numero pari? " + z);
    }
}