
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.lang.String;
import javax.swing.ImageIcon;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import sun.audio.*;
import java.io.*;


public class MemoryGamePanel extends JPanel implements ActionListener, MouseListener {


    //Arrays and lists
    ArrayList<ImageIcon> Pics = new ArrayList<ImageIcon>();
    ArrayList<Card> selectedCards = new ArrayList<Card>();
    ArrayList<Card> shuffSelectedCards = new ArrayList<Card>();
    Card[][] cardArr = new Card[3][6];

    //int
    int score = 9;
    int clickCountDown = 0;
    int timing = 0;
    int count = 0;
    int x;
    int y;
    int colorCheck;
    int MaxTime = Integer.MAX_VALUE;
    int startClick = 0;

    //String
    String bestPlayer = "no player";
    //ImageIcons
    ImageIcon mypic;

    //kids Cards
    ImageIcon Bird = new ImageIcon("Bird card.png");
    ImageIcon Clock = new ImageIcon("Clock card.png");
    ImageIcon Dog = new ImageIcon("Dog card.png");
    ImageIcon Duck = new ImageIcon("Duck card.png");
    ImageIcon Hippo = new ImageIcon("Hippo card.png");
    ImageIcon IcePop = new ImageIcon("Ice Pop card.png");
    ImageIcon LadyBug = new ImageIcon("LadyBug card.png");
    ImageIcon Shark = new ImageIcon("Shark card.png");
    ImageIcon Balloon = new ImageIcon("Balloon card 2.png");

    //Color Cards
    ImageIcon Blue = new ImageIcon("Blue card.png");
    ImageIcon Brown = new ImageIcon("Brown card.png");
    ImageIcon Green = new ImageIcon("Green card.png");
    ImageIcon Orange = new ImageIcon("Orange card.png");
    ImageIcon Pink = new ImageIcon("Pink card.png");
    ImageIcon Purple = new ImageIcon("Purple card.png");
    ImageIcon Red = new ImageIcon("Red card.png");
    ImageIcon Violet = new ImageIcon("Violet card.png");
    ImageIcon Yellow = new ImageIcon("Yellow card.png");

    ImageIcon Apple = new ImageIcon("Apple card.png");
    ImageIcon Bread = new ImageIcon("Bread card.png");
    ImageIcon Broccoli = new ImageIcon("Broccoli card.png");
    ImageIcon Cake = new ImageIcon("Cake card.png");
    ImageIcon Cheese = new ImageIcon("Cheese card.png");
    ImageIcon FrenchFry = new ImageIcon("French fry card.png");
    ImageIcon Milk = new ImageIcon("Milk card.png");
    ImageIcon Pepper = new ImageIcon("Pepper card.png");
    ImageIcon Pizza = new ImageIcon("Pizza card.png");

    ImageIcon PeterG = new ImageIcon("Peter Griffin.jpg");
    ImageIcon StewieG = new ImageIcon("Stewie Griffin.jpg");
    ImageIcon JoeS = new ImageIcon("Joe Swanson.jpg");
    ImageIcon ClevelandB = new ImageIcon("Cleveland Brown.jpg");
    ImageIcon MegG = new ImageIcon("Meg Griffin.jpg");
    ImageIcon GlennQ = new ImageIcon("Glenn Quagmire.jpg");
    ImageIcon ChrisG = new ImageIcon("Chris Griffin.jpg");
    ImageIcon LoisG = new ImageIcon("Lois Griffin.jpg");
    ImageIcon BrianG = new ImageIcon("Brian Griffin.jpeg");

    //Music Players
    MusicPlayer shuffSound = new MusicPlayer("Cards Shuffling Sound Effect  [HD].mp3");


    // JLabel
    JLabel scoreBoard = new JLabel(" ");
    JLabel time = new JLabel (" ");
    JLabel topScorerPrompt = new JLabel ("Enter Your Name ('Cause You Won!)");
    JLabel Leader = new JLabel("");
    JLabel finalTime = new JLabel (" ");

    //Card
    Card selected;
    Card card1;
    Card card2;
    //JFrames
    JFrame window;

    //JButtons
    JButton KidCards = new JButton("Kids");
    JButton colorCards = new JButton ("Colors");
    JButton foodCards = new JButton ("Food");
    JButton FGCards = new JButton ("Family Guy");

    JButton start = new JButton("Start");
    JButton scorerEnter = new JButton("Enter");
    JButton reset = new JButton ("Reset");

    //JTextField
    JTextField enterTopScorer = new JTextField("");
    //timers
    Timer gameTime = new Timer (1000,this);
    Timer controlTime = new Timer(5000, this);
    Timer shuffTime = new Timer(100, this);
    Timer flipTime = new Timer (1500, this);
    Timer MatchTime = new Timer (450, this);
    Timer LossTime = new Timer (450,this);
    Timer endText = new Timer (100, this);
    Timer clickTimer = new Timer (500, this);





    public MemoryGamePanel() {
        setLayout(null);
        window = new JFrame("Memory Game");
        window.setSize(1200, 770); // sets size of Window
        window.setResizable(false);  // makes it non-resizable

        //window.getContentPane().add(this); // add panel
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//setting the positions, visibility, and actionListeners to buttons and JLabels
        KidCards.setBounds(200, 300, 200, 100);
        KidCards.addActionListener(this);
        KidCards.setVisible(true);

        colorCards.setBounds(410, 300, 200, 100);
        colorCards.addActionListener(this);
        colorCards.setVisible(true);

        foodCards.setBounds(620,300,200,100);
        foodCards.addActionListener(this);
        foodCards.setVisible(true);

        FGCards.setBounds(830,300 ,200, 100);
        FGCards.addActionListener(this);
        FGCards.setVisible(true);
//starts the game
        start.setBounds(500, 600, 100, 100);
        start.addActionListener(this);
        start.setVisible(false);

//this presents the players final time

        finalTime.setBounds(100, 200, 1000, 400);
        finalTime.setFont(new Font("Arial", Font.BOLD, 50));
        finalTime.setVisible(false);
        //leader board
        Leader.setText(bestPlayer + " is the best player \n with time: NA");
        Leader.setBounds(200, 600, 400, 50);
        Leader.setVisible(false);


        reset.setBounds(100, 600, 70, 50);
        reset.setVisible(false);
        reset.addActionListener(this);

        //this increases every time the gameTime timer goes of
        time.setBounds(900, 600, 200, 50);
        time.setVisible(false);

        //keeps track of how many sets are left to match
        scoreBoard.setText(score + " left");
        scoreBoard.setBounds(500,550,100,50);
        scoreBoard.setFont(new Font("Arial", Font.BOLD, 20));
        scoreBoard.setVisible(false);
        add(scoreBoard);

        topScorerPrompt.setBounds(800, 300, 300, 50);
        topScorerPrompt.setVisible(false);
        add(topScorerPrompt);

        // enters the new highest scorer
        enterTopScorer.setBounds(800, 360, 100, 50);
        enterTopScorer.setVisible(false);
        add(enterTopScorer);
//enter button for entering the new highest scorer

        scorerEnter.setBounds(900, 360, 100, 50);
        scorerEnter.setVisible(false);
        scorerEnter.addActionListener(this);
        add(scorerEnter);

//add() adds the object into the window
        add(KidCards);
        add(colorCards);
        add(foodCards);
        add(FGCards);
        add(finalTime);
        add(reset);
        add(start);
        add(Leader);
        add(time);
        setVisible(true);
        Container c = window.getContentPane();
        c.add(this);
        window.setVisible(true);
    }
    //resets everything to how it was originally
    public void restart() {
        start.setVisible(false);
        reset.setVisible(false);

        controlTime.stop();
        shuffTime.stop();
        gameTime.stop();
        endText.stop();

        timing = 0;
        score = 9;


        time.setText("Your time is " + timing + " Seconds");

        finalTime.setVisible(false);

        for (int i = 0; i < cardArr.length; i++) {
            for (int j = 0; j < cardArr[i].length; j++) {
                cardArr[i][j].setVisible(false);
                // cardArr[i][j] = null;
                remove(cardArr[i][j]);
            }
        }
        for (int rep = selectedCards.size()-1; rep >= 0; rep--) {
            selectedCards.remove(selectedCards.get(rep));
        }

        cardArr = new Card[3][6];

        KidCards.setVisible(true);
        colorCards.setVisible(true);
        foodCards.setVisible(true);
        FGCards.setVisible(true);

        scoreBoard.setText(score + " left");
        scoreBoard.setVisible(false);

        topScorerPrompt.setVisible(false);



        enterTopScorer.setVisible(false);



        scorerEnter.setVisible(false);



        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Color back;
        back = Color.LIGHT_GRAY;

        setBackground(back);
    }
    public void actionPerformed(ActionEvent e) {
        //describes what happens when KidCards is pressed
        if(e.getSource().equals(KidCards)){
            KidCards.setVisible(false);
            colorCards.setVisible(false);
            foodCards.setVisible(false);
            FGCards.setVisible(false);

            //add strings to card list


            start.setVisible(true);

            Leader.setVisible(true);


            reset.setVisible(true);


            time.setVisible(true);

//adds these pictures to the pics list in order for them to be used in the code below
            Pics.add(Clock);
            Pics.add(Dog);
            Pics.add(Duck);
            Pics.add(Hippo);
            Pics.add(IcePop);
            Pics.add(LadyBug);
            Pics.add(Shark);
            Pics.add(Balloon);
            Pics.add(Bird);
            Pics.add(Clock);
            Pics.add(Dog);
            Pics.add(Duck);
            Pics.add(Hippo);
            Pics.add(IcePop);
            Pics.add(LadyBug);
            Pics.add(Shark);
            Pics.add(Balloon);
            Pics.add(Bird);


            // for adding elements to each open space in array
            y = 40;
            System.out.println(cardArr.length + " " + cardArr[0].length);

            for (int i = 0; i < cardArr.length; i++) {
                x = 50;
                for (int j = 0; j < cardArr[i].length; j++) {
//going to make array to put in card array
                    mypic = Pics.get((int) (Math.random() * Pics.size()));
                    Card myCard = new Card(mypic,x,y);
                    cardArr[i][j] = myCard;
                    /** removes mypic from Pics
                     * eventually all Pictures previously added to mypics will be deleted
                     */
                    Pics.remove(mypic);
                    selectedCards.add(myCard);
                    cardArr[i][j].setVisible(true);
                    cardArr[i][j].addMouseListener(this);
                    add(cardArr[i][j]);
                    x = x + 170;

                }
                y = y + 160;

            }
            repaint();

        }
//describes what happens if colorCards is pressed

        if(e.getSource().equals(colorCards)){
            KidCards.setVisible(false);
            colorCards.setVisible(false);
            foodCards.setVisible(false);
            FGCards.setVisible(false);


            start.setVisible(true);

            Leader.setVisible(true);


            reset.setVisible(true);


            time.setVisible(true);


            Pics.add(Orange);
            Pics.add(Blue);
            Pics.add(Brown);
            Pics.add(Pink);
            Pics.add(Purple);
            Pics.add(Green);
            Pics.add(Red);
            Pics.add(Violet);
            Pics.add(Yellow);
            Pics.add(Orange);
            Pics.add(Blue);
            Pics.add(Brown);
            Pics.add(Pink);
            Pics.add(Purple);
            Pics.add(Green);
            Pics.add(Red);
            Pics.add(Violet);
            Pics.add(Yellow);


            // for adding elements to each open space in array
            y = 40;
            System.out.println(cardArr.length + " " + cardArr[0].length);

            for (int i = 0; i < cardArr.length; i++) {
                x = 50;
                for (int j = 0; j < cardArr[i].length; j++) {
//going to make array to put in card array
                    mypic = Pics.get((int) (Math.random() * Pics.size()));
                    Card myCard = new Card(mypic,x,y);
                    cardArr[i][j] = myCard;
                    //cards is now empty
                    Pics.remove(mypic);
                    selectedCards.add(myCard);
                    cardArr[i][j].setVisible(true);
                    cardArr[i][j].addMouseListener(this);
                    add(cardArr[i][j]);
                    x = x + 170;

                }
                y = y + 160;

            }
            repaint();

        }
        //desribes what happens if foodCards is pressed
        if(e.getSource().equals(foodCards)){
            KidCards.setVisible(false);
            colorCards.setVisible(false);
            foodCards.setVisible(false);
            FGCards.setVisible(false);


            start.setVisible(true);

            Leader.setVisible(true);


            reset.setVisible(true);


            time.setVisible(true);


            Pics.add(Apple);
            Pics.add(Bread);
            Pics.add(Broccoli);
            Pics.add(Cake);
            Pics.add(Cheese);
            Pics.add(FrenchFry);
            Pics.add(Milk);
            Pics.add(Pepper);
            Pics.add(Pizza);
            Pics.add(Apple);
            Pics.add(Bread);
            Pics.add(Broccoli);
            Pics.add(Cake);
            Pics.add(Cheese);
            Pics.add(FrenchFry);
            Pics.add(Milk);
            Pics.add(Pepper);
            Pics.add(Pizza);



            // for adding elements to each open space in array
            y = 40;
            System.out.println(cardArr.length + " " + cardArr[0].length);

            for (int i = 0; i < cardArr.length; i++) {
                x = 50;
                for (int j = 0; j < cardArr[i].length; j++) {
//going to make array to put in card array
                    mypic = Pics.get((int) (Math.random() * Pics.size()));
                    Card myCard = new Card(mypic,x,y);
                    cardArr[i][j] = myCard;
                    //cards is now empty
                    Pics.remove(mypic);
                    selectedCards.add(myCard);
                    cardArr[i][j].setVisible(true);
                    cardArr[i][j].addMouseListener(this);
                    add(cardArr[i][j]);
                    x = x + 170;

                }
                y = y + 160;

            }
            repaint();
        }
        //decribes what happens if FGCards is pressed
        if(e.getSource().equals(FGCards)){

            KidCards.setVisible(false);
            colorCards.setVisible(false);
            foodCards.setVisible(false);
            FGCards.setVisible(false);


            start.setVisible(true);

            Leader.setVisible(true);


            reset.setVisible(true);


            time.setVisible(true);


            Pics.add(PeterG);
            Pics.add(ChrisG);
            Pics.add(BrianG);
            Pics.add(MegG);
            Pics.add(LoisG);
            Pics.add(StewieG);
            Pics.add(GlennQ);
            Pics.add(JoeS);
            Pics.add(ClevelandB);
            Pics.add(PeterG);
            Pics.add(ChrisG);
            Pics.add(BrianG);
            Pics.add(MegG);
            Pics.add(LoisG);
            Pics.add(StewieG);
            Pics.add(GlennQ);
            Pics.add(JoeS);
            Pics.add(ClevelandB);



            // for adding elements to each open space in array
            y = 40;
            System.out.println(cardArr.length + " " + cardArr[0].length);

            for (int i = 0; i < cardArr.length; i++) {
                x = 50;
                for (int j = 0; j < cardArr[i].length; j++) {
//going to make array to put in card array
                    mypic = Pics.get((int) (Math.random() * Pics.size()));
                    Card myCard = new Card(mypic,x,y);
                    cardArr[i][j] = myCard;
                    //cards is now empty
                    Pics.remove(mypic);
                    selectedCards.add(myCard);
                    cardArr[i][j].setVisible(true);
                    cardArr[i][j].addMouseListener(this);
                    add(cardArr[i][j]);
                    x = x + 170;

                }
                y = y + 160;

            }
            repaint();
        }
        if (e.getSource().equals(start)) {
            start.setVisible(false);
            Leader.setVisible(false);
            shuffTime.start();
            controlTime.start();
            reset.setVisible(false);
            shuffSound.Start();
            startClick= 1;


        }
        if (e.getSource().equals(shuffTime)) {
            for (int i = 0; i < cardArr.length; i++) {
                for (int j = 0; j < cardArr[i].length; j++) {
                    cardArr[i][j].shuffle();
                }
            }
        }
        if (e.getSource().equals(controlTime)) {
            scoreBoard.setVisible(true);
            shuffTime.stop();
            controlTime.stop();
            shuffSound.Stop();
            Leader.setVisible(true);
            reset.setVisible(true);

            y = 40;
            for (int rep = 14; rep >= 0; rep--) {
                for (int i = 0; i < cardArr.length; i++) {
                    x = 50;
                    for (int j = 0; j < cardArr[i].length; j++) {
//                        remove(cardArr[i][j]);
                        selected = selectedCards.get((int) (Math.random() * selectedCards.size()));
                        //selectedCards is now empty
                        selectedCards.remove(selected);
                        //replaces the value at cardArr[i][j] with selected
                        cardArr[i][j] = null;
                        cardArr[i][j] = selected;
                        flipTime.start();
                        cardArr[i][j].setBounds(x, y, 140, 140);
                        x = x + 170;
                    }
                    y = y + 160;
                }

            }
        }

        if (e.getSource().equals(flipTime)){
            flipTime.stop();

            for (int i = 0; i < cardArr.length; i++){
                for (int j = 0; j < cardArr[i].length;j++){
                    cardArr[i][j].flip();
                }
            }
            gameTime.start();
        }
        if (e.getSource().equals(MatchTime)) {
            MatchTime.stop();
            card2.flip();
            card1.flip();
            card2.setVisible(false);
            card1.setVisible(false);
            /*selected.remove(card1);
            selected.remove(card2);*/
            remove(card2);
            remove(card1);

        }
        if (e.getSource().equals(LossTime)) {
            LossTime.stop();
            System.out.println("Flipping back");
            timing = timing + 2;
            card1.flip();
            card2.flip();
        }

        if (e.getSource().equals(gameTime)) {
            timing = timing + 1;

            if (score == 0) {
                gameTime.stop();

                endText.start();

                time.setVisible(false);

                finalTime.setText("Your time is " + timing + " Seconds");
                finalTime.setVisible(true);

                for (int i = 0; i < cardArr.length; i++) {
                    for (int j = 0; j < cardArr[i].length; j++) {
                        cardArr[i][j].setVisible(false);
                    }
                    if (timing < MaxTime) {
                        MaxTime = timing;
                        topScorerPrompt.setVisible(true);
                        enterTopScorer.setVisible(true);
                        scorerEnter.setVisible(true);
                    }

                }
            } else {
                time.setText(timing + " Seconds left");
            }

        }
        if (e.getSource().equals(scorerEnter)) {
            scorerEnter.setVisible(false);
            topScorerPrompt.setVisible(false);
            enterTopScorer.setVisible(false);
            bestPlayer = enterTopScorer.getText();
            Leader.setText(bestPlayer + " is the best player \n" + "with time: " + MaxTime + " seconds");
        }
        if (e.getSource().equals(endText)) {
            colorCheck = colorCheck + 1;
            if (colorCheck == 1) {
                finalTime.setForeground(Color.red);
            } else if (colorCheck == 2) {
                finalTime.setForeground(Color.BLUE);
                colorCheck = 0;
            }
        }
        if (e.getSource().equals(clickTimer)){
            clickCountDown= clickCountDown - 1;
            if (clickCountDown == 0){
                clickTimer.stop();
            }
        }
        if(e.getSource().equals(reset)){
           /* shuffTime.start();
            controlTime.start();
for (int i = 0; i < cardArr.length; i++){
    for (int j = 0; j < cardArr[i].length; j++){
        cardArr[i][j].reface();*/
            restart();
        }
    }

// describes what happens when the mouse is clicked
    public void mouseClicked(MouseEvent e) {
        if(startClick==1) {
            if(clickCountDown == 0){
                count++;
                System.out.println(e.getClickCount());
                if (count % 2 == 1) {
                    System.out.println("Click 1");
                    for (int i = 0; i < cardArr.length; i++) {
                        for (int j = 0; j < cardArr[i].length; j++) {
                            if (e.getSource().equals(cardArr[i][j])) {
                                card1 = cardArr[i][j];
                                add(card1);
                                //card1.setVisible(true);
                                card1.flip();
                            }
                        }
                    }
                    clickCountDown = 1;
                    clickTimer.start();
                }

                if (clickCountDown == 0) {
                    if (count % 2 == 0) {
                        System.out.println("Click 2");

                        for (int i = 0; i < cardArr.length; i++) {
                            for (int j = 0; j < cardArr[i].length; j++) {
                                if (e.getSource().equals(cardArr[i][j])) {
                                    card2 = cardArr[i][j];
                                    if (card2 == card1) {
                                        count--;
                                        return;
                                    }
                                    add(card2);
                                    // card2.setVisible(true);
                                    card2.flip();

                                    if (card2.match(card1) == true) {
                                        System.out.println("We got a match");
                                        score = score - 1;
                                        scoreBoard.setText(score + " left");
                                        MatchTime.start();

                                    } else {
                                        clickCountDown = 1;
                                        clickTimer.start();
                                        LossTime.start();
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }




    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }








    public static void main(String [] args){
        MemoryGamePanel MGP = new MemoryGamePanel();
    }
}


