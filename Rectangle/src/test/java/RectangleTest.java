import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void TestAreaOfRectangleWhenBothDimensionsArePositive(){
        int length=6;
        int breadth=3;
        int expectedArea=18;
        Rectangle rectangle = new Rectangle(length,breadth);
        int actualArea = rectangle.areaOfRectangle();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    public void TestAreaOfRectangleWhenLengthIsZero(){
        int length=0;
        int breadth=3;
        String expectedMessage="Length of the Rectangle cannot be Zero";

        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::areaOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestAreaOfRectangleWhenBreadthIsZero() {
        int length=5;
        int breadth=0;
        String expectedMessage="Breadth of the Rectangle cannot be Zero";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::areaOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestAreaOfRectangleWhenBothDimensionsAreZero() {
        int length=0;
        int breadth=0;
        String expectedMessage="Length and Breadth of the Rectangle cannot be Zero";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::areaOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestAreaOfRectangleWhenLengthIsNegative() {
        int length=-4;
        int breadth=2;
        String expectedMessage="Length of the Rectangle cannot be Negative Value";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::areaOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestAreaOfRectangleWhenBreadthIsNegative() {
        int length=4;
        int breadth=-2;
        String expectedMessage="Breadth of the Rectangle cannot be Negative Value";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::areaOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestAreaOfRectangleWhenBothDimensionsAreNegative() {
        int length=-4;
        int breadth=-2;
        String expectedMessage="Length and Breadth of the Rectangle cannot be Negative Values";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::areaOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    public void TestPerimeterOfRectangleWhenBothDimensionsArePositive(){
        int length=5;
        int breadth=2;
        int expectedPerimeter=14;
        Rectangle rectangle = new Rectangle(length,breadth);
        int actualPerimeter = rectangle.perimeterOfRectangle();
        assertEquals(expectedPerimeter,actualPerimeter);
    }

    @Test
    void TestPerimeterOfRectangleWhenLengthIsNegative() {
        int length=-5;
        int breadth=2;
        String expectedMessage="Length of the Rectangle cannot be Negative Value";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::perimeterOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestPerimeterOfRectangleWhenBreadthIsNegative() {
        int length=5;
        int breadth=-3;
        String expectedMessage="Breadth of the Rectangle cannot be Negative Value";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::perimeterOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestPerimeterOfRectangleWhenBothDimensionsAreNegative() {
        int length=-5;
        int breadth=-3;
        String expectedMessage="Length and Breadth of the Rectangle cannot be Negative Values";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::perimeterOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestPerimeterOfRectangleWhenLengthIsZero() {
        int length=0;
        int breadth=3;
        String expectedMessage="Length of the Rectangle cannot be Zero";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::perimeterOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestPerimeterOfRectangleWhenBreadthIsZero() {
        int length=7;
        int breadth=0;
        String expectedMessage="Breadth of the Rectangle cannot be Zero";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::perimeterOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }

    @Test
    void TestPerimeterOfRectangleWhenBothAreZero() {
        int length=0;
        int breadth=0;
        String expectedMessage="Length and Breadth of the Rectangle cannot be Zero";
        Rectangle rectangle = new Rectangle(length,breadth);
        Throwable exception = Assertions.assertThrows(RuntimeException.class, rectangle::perimeterOfRectangle);
        assertEquals(expectedMessage,exception.getMessage());
    }
}
