package sec10.ex01;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("너비 및 높이는 양수여야 합니다.");
        }
        this.width = width;
        this.height = height;
    }

    // Getter and setter methods...

    public int calculateArea() {
        return width * height;
    }
}