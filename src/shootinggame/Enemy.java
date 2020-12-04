package shootinggame;

class Enemy {
    int x;
    int y;

    int speed;

    Enemy(int x, int y, int speed) {
        this.x = x;
        this.y = y;

        this.speed = speed;
    }

    public void move() {
        x -= speed;
    }
}
