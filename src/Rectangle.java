class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    public int getArea() { return width * height; }
}

class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() { return side; }
    public void setSide(int side) { this.side = side; }

    public int getArea() { return side * side; }
}

