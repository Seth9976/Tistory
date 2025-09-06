package androidx.constraintlayout.core.widgets;

public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public boolean contains(int v, int v1) {
        return v >= this.x && v < this.x + this.width && (v1 >= this.y && v1 < this.y + this.height);
    }

    public int getCenterX() {
        return (this.x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.y + this.height) / 2;
    }

    public void setBounds(int v, int v1, int v2, int v3) {
        this.x = v;
        this.y = v1;
        this.width = v2;
        this.height = v3;
    }
}

