package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {

    @Test
    void test() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(387.2983346207417,triangle.triangleArea(40,20,40));     //Тест на площадь
        Assertions.assertThrows(MyException.class,()-> triangle.triangleArea(0,20,30)); //Тест на ноль
    }

}
