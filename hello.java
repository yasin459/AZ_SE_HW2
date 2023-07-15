class Rectangle {
    private int h;
    private int w;

    public Rectangle(int height, int width) {
        h = height;
        w = width;
    }

    public int computeArea() {
        return h * w;
    }

}
class HelloWorld {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect.computeArea()); 
    }
}