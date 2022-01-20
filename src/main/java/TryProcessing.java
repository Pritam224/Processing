import processing.core.PApplet;


public class TryProcessing extends PApplet {


    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;

    int firstCirclePos = 0;
    int secondCirclePos = 0;
    int thirdCirclePos = 0;
    int fourthCirclePos = 0;





    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        //super.setup();
        //ellipse(WIDTH/2, HEIGHT/2, DIAMETER, DIAMETER);
    }


    @Override
    public void draw () {
        //super.draw();

        ellipse(firstCirclePos, (HEIGHT) / 5, DIAMETER, DIAMETER);
        firstCirclePos += 1;

        ellipse(secondCirclePos, (2*HEIGHT) / 5, DIAMETER, DIAMETER);
        secondCirclePos += 2;

        ellipse(thirdCirclePos, (3*HEIGHT) / 5, DIAMETER, DIAMETER);
        thirdCirclePos += 3;

        ellipse(fourthCirclePos, (4*HEIGHT) / 5, DIAMETER, DIAMETER);
        fourthCirclePos += 4;

    }



}