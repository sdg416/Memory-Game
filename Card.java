import javax.swing.*;
import javax.swing.ImageIcon;


public class Card extends JLabel {
    ImageIcon face;
    int x, y;
    int count = 0;
    ImageIcon back = new ImageIcon("Back card.png");


    public Card(ImageIcon f, int x, int y) {

        super();
        face = f;
        setIcon(face);
        this.x = x;
        this.y = y;


        setBounds(x, y, 200, 200);
        setVisible(true);
    }


    public void shuffle() {
        x = (int) (Math.random() * 1000);
        y = (int) (Math.random() * 600);
        setBounds(x, y, 200, 200);
    }


    public int compareTo(Card other) {
        if (this.y > other.y) {
            return 1;
        } else if (this.y < other.y) {
            return -1;
        } else {
            if (this.x > other.x) {
                return 1;

            } else if (this.x < other.x) {
                return -1;
            } else return 0;
        }
    }

    public void flip() {
        count = count + 1;
        if (count == 1) {
            setIcon(back);
        }
        if (count == 2) {
            count = 0;
            setIcon(face);
        }

    }

    public void reface() {
        setIcon(face);
        setVisible(true);
    }

    public boolean match(Card other) {
        boolean check = true;
        if (this.face != other.face) {
            check = false;

        }
        return check;
    }
}
