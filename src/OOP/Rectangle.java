package OOP;

public class Rectangle {
    int width;
    int length;
    public Rectangle(){};
    public Rectangle(int width, int lenght){
        this.width = width;
        this.length = lenght;
    };
    public int getArea(){
        return width*length;
    }
    public int getPerimeter(){
        return (width+length)*2;
    }
    public void display(){

    }
}
