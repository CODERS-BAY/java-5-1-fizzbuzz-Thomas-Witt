public class Fizzbuzz {
    public static void main(String[] args) {

        int highestNumber = 100;            //gib hier an wie lange das Spiel laufen soll
        for (int i = 1; i <= highestNumber; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
