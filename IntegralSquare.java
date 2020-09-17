import static java.lang.Math.*;

public class IntegralSquare {

    public static void main(String[] args) {
        double y1 = 0.7;
        int accuracy = 10;
        double a = 0;
        double b = Math.PI;
        double delta = b - a;
        double width = (b - a) / accuracy;
        double height;
        double rectSquare;
        double square = 0;


        for (int i = 1; i <= accuracy; i++) {
            if (sin(i * delta / accuracy) < y1) {
                height = sin(i * delta / accuracy);
                rectSquare = height * width;
                System.out.println("Rectangle square: " + rectSquare);
            }
            else {
                height = y1;
                rectSquare = height * width;
                System.out.println("Rectangle square MAX: " + rectSquare);
            }
            square += rectSquare;
        }
        System.out.println("====================================================");
        System.out.println("Full Square: " + square);
    }
}

