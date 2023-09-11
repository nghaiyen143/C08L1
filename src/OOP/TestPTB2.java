package OOP;

public class TestPTB2 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(9,6,3);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có một nghiệm kép: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình có hai nghiệm:");
            System.out.println("r1 = "+quadraticEquation.getRoot1());
            System.out.println("r2 = "+quadraticEquation.getRoot2());
        }

    }
}
