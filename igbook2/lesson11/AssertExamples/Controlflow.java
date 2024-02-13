package lesson11.AssertExamples;

public class Controlflow {
    enum Suit {
        SPADES, DIAMONDS, CLUBS, HEARTS
    }

    public static void main(String args[]) {

        Suit suit = Suit.HEARTS;

        switch (suit) {
            case CLUBS:
                System.out.print("club");
                break;
            case DIAMONDS:
                System.out.print("diamond");
                break;
            case HEARTS:
                System.out.print("diamond");
                break;
            case SPADES:
                System.out.print("spades");
                break;
            default:
                assert false : suit;


        }

    }
}
