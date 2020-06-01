package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeFigure = new ShapeCollector();
        Shape triangle = new Triangle();

        //When
        shapeFigure.addFigure(triangle);

        //Then
        Assert.assertEquals(triangle,shapeFigure.getFigure(0));
        Assert.assertEquals(1,shapeFigure.getSize());

    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeFigure = new ShapeCollector();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        shapeFigure.addFigure(triangle);
        //When
        boolean result = shapeFigure.removeFigure(triangle);
        boolean result_2 = shapeFigure.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertFalse(result_2);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeFigure = new ShapeCollector();
        Shape triangle = new Triangle();
        shapeFigure.addFigure(triangle);

        //When
       Shape result =  shapeFigure.getFigure(0);
       Shape result_2 =  shapeFigure.getFigure(-1);
       Shape result_3 =  shapeFigure.getFigure(15);
        //Then
        Assert.assertEquals(triangle,result);
        Assert.assertNull(result_2);
        Assert.assertNull(result_3);


    }

}
