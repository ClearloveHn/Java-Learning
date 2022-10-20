package Shape;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public void drawAll(List<?extends Shape> shapeList) {
        for (Shape shape:shapeList) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        Test test =  new Test();
        List<Circle> circles = new ArrayList<>();
        test.drawAll(circles);
    }
}
