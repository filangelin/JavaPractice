package practice2;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void print() {
        System.out.println("X - " + x + " Y - " + y);
    }
}
