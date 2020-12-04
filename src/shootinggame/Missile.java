package shootinggame;

class Missile {
    int x;
    int y;
    int angle;
    int speed;

    int who;

    Missile(int x, int y, int angle, int speed, int who) {
        this.x = x;
        this.y = y;

        this.who = who;

        this.angle = angle;
        this.speed = speed;
    }

    public void move() {
        x += Math.cos(Math.toRadians(angle)) * speed;

        y += Math.sin(Math.toRadians(angle)) * speed;
    }
}
