package ru.stqa.pft.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PointTest {
    @Test
    public void testDis(){

        Point s = new Point(3, 6);
        Assert.assertEquals(s.distance(5,4) , 2.8284271247461903);
    }
}
