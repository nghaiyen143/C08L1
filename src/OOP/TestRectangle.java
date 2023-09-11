package OOP;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,9);
        System.out.println("Chu vi hình chữ nhật = "+ rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật = "+ rectangle.getArea());
    }
}
