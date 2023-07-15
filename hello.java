class Rectangle {
    private int h;
    private int w;

    public Rectangle(int height, int width) {
        h = height;
        w = width;
    }
    public int getHeight() {
        return h;
    }

    public int getWidth() {
        return w;
    }

    public void  setHeight(int height) {
        this.h = height;
    }
    
    public void setWidthRectangle(int width) {
        this.w = width;
    }
    public int computeArea() {
        return h * w;
    }

}
class HelloWorld {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect.computeArea()); 
        rect.setHeight((12));
        rect.setWidthRectangle(7);
        System.out.println(rect.computeArea());

    }
}