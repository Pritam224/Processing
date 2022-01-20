import processing.core.PApplet;


public class TryProcessing extends PApplet {









    class Balls {

        int speed, pos, heightFactor;
        Balls(int speed, int pos, int heightFactor) {
            this.speed = speed;
            this.pos = pos;
            this.heightFactor = heightFactor;
        }

        void createEllipse()
        {
            ellipse(pos, (heightFactor*HEIGHT)/5, DIAMETER, DIAMETER);
            pos += speed;
        }
    }

    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    Balls balls[] = new Balls[4];





    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        //super.setup();
        for(int i = 0; i<4; i++)
        {
            balls[i] = new Balls(i+1, 0, i+1);
        }
    }


    @Override
    public void draw () {
        //super.draw();

        for(int i = 0; i<4; i++)
        {
            balls[i].createEllipse();
        }

    }


    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);


    }



}