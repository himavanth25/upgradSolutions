import java.util.*;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.
    int getSuitPriority(String suitString) {
        //Write your code here.Spades > Diamond > Hearts > Clubs
        int value1, value2 = 0;
        if (this.suit.equalsIgnoreCase("spades")) value1 = 4;
        else if (this.suit.equalsIgnoreCase("diamond")) value1 = 3;
        else if (this.suit.equalsIgnoreCase("hearts")) value1 = 2;
        else value1 = 1;

        if (suitString.equalsIgnoreCase("spades")) value2 = 4;
        else if (suitString.equalsIgnoreCase("diamond")) value2 = 3;
        else if (suitString.equalsIgnoreCase("hearts")) value2 = 2;
        else value2 = 1;

        if (value1 > value2)
            return 1;
        else if (value1 < value2)
            return -1;
        else return 0;
    }
}

    class ClassicGame {
        int points1 = 0;
        int points2 = 0;

        public ClassicGame(Cards c1, Cards c2) {
            game(c1, c2);
        }

        public void game(Cards c1, Cards c2) {

            //Write your code here.
            if (c1.value > c2.value)
                points1 = points1 + 1;
            else if (c1.value < c2.value)
                points2 = points2 + 1;
            else {
                if (c1.getSuitPriority(c2.suit) > 1)
                    points1 = points1 + 1;
                else if (c1.getSuitPriority(c2.suit) < 1)
                    points2 = points2 + 1;
                else {
                    points2 = 0;
                    points1 = 0;
                }
            }

            System.out.println("points of player 1 :" + " " + points1);
            System.out.println("points of player 2 :" + " " + points2);
        }

    }

    public class Source {

        public static void main(String[] args) {
            //Two objects (cards) of class Cards
            Cards c1 = new Cards();
            Cards c2 = new Cards();
            Scanner in = new Scanner(System.in);
            //Enter the suit of card 1
            String s1 = in.nextLine();
            c1.setCards(s1, in.nextInt());
            in.nextLine();
            //Enter the suit of card 2
            String s2 = in.nextLine();
            c2.setCards(s2, in.nextInt());
            ClassicGame c = new ClassicGame(c1, c2);

            //c.game(c1, c2);
        }
    }
